package com.api.api.Controllers;
import com.api.api.Contracts.Palindrome;
import com.api.api.Services.PalindromoCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PalindromoController {


    @Autowired
    private PalindromoCheckService service;

    @PostMapping("/palindrome")
        public String validatePalindrome (@RequestBody Palindrome palindrome){
            return service.validatePlaindrome(palindrome.getPalindrome());
        }
}

