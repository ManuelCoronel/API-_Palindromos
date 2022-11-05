package com.api.api.Services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.api.api.Services.PalindromoCheckService;


class PalindromoCheckServiceTest {


    private PalindromoCheckService service;

    @BeforeEach
    void setUp() {
        service = new PalindromoCheckService();
    }

    @Test
    void testPalindrome1(){
        String t1 = service.validatePlaindrome("RECONOCER");
        Assertions.assertEquals("RECONOCER",t1);
    }
    @Test
    void testPalindrome2(){
        String t1 = service.validatePlaindrome("Anita lava la tina");
        Assertions.assertEquals("ava",t1);
    }
    @Test
    void testPalindrome3(){
        String t1 = service.validatePlaindrome("abcc");
        Assertions.assertEquals("cc",t1);
    }
    @Test
    void testPalindrome4(){
        String t1 = service.validatePlaindrome("12345654321");
        Assertions.assertEquals("12345654321",t1);
    }
}