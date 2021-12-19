package com.example.springsesiones456.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hola")
    public String imprimirSaludo(){
        return "¡Hola!";
    }
}
