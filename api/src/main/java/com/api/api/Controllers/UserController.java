package com.api.api.Controllers;

import com.api.api.Contracts.AuthenticationRequest;
import com.api.api.Contracts.AuthenticationResponse;
import com.api.api.Services.JwtService;
import com.api.api.Services.MyUserDetailService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {


    private AuthenticationManager authenticationManager = new AuthenticationManager() {
        @Override
        public Authentication authenticate(Authentication authentication) throws AuthenticationException {
            return null;
        }
    } ;
    @Autowired
    private MyUserDetailService myUserDetailService;
    @Autowired
    private  JwtService jwtService;



    @PostMapping("/login")
    public AuthenticationResponse createToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        try {
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword());
            authenticationManager.authenticate(authentication);
        } catch (BadCredentialsException e) {
            throw new Exception("Invalid username or password", e);
        }
        UserDetails userDetails = myUserDetailService.loadUserByUsername(authenticationRequest.getUsername());
        String token = jwtService.createToken(userDetails);
        return new AuthenticationResponse(token);
    }
}