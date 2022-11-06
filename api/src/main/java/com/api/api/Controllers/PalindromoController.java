package com.api.api.Controllers;
import com.api.api.Contracts.Palindrome;
import com.api.api.Services.PalindromoCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

@RestController
public class PalindromoController {


    @Autowired
    private PalindromoCheckService service;

    @PostMapping("/palindrome")
        public ResponseEntity<Palindrome> validatePalindrome (@RequestBody Palindrome palindrome){
        try {

            return  ResponseEntity.accepted().body(new Palindrome(service.validatePlaindrome(palindrome.getPalindrome())));
        }catch (Exception e){
            return ResponseEntity.badRequest().body(new Palindrome("No se ha encontrado palindromo"));

        }

        }
}

