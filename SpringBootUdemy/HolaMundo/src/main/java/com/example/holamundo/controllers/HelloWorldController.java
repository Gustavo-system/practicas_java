package com.example.holamundo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
    @GetMapping
    public ResponseEntity<String> helloWorld(){
        return new ResponseEntity<String>("Hello world this is my way to learn SpringBoot", HttpStatus.OK);
    }
}
