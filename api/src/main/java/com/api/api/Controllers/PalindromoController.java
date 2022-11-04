package com.api.api.Controllers;
import com.api.api.Services.PalindromoCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class PalindromoController {


    @Autowired
    private PalindromoCheckService service;

    
}
