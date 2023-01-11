package com.example.swagger_01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping(value = "/name")
    public String getName() {
        return "Alessio Pacelli";
    }
}