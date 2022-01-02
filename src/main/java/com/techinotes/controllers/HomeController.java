package com.techinotes.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("v1")
public class HomeController {

    @GetMapping(value = "/")
    public ResponseEntity<String> home(){
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping(value = "/secured")
    public ResponseEntity<String> securedMethod(){
        return ResponseEntity.ok("Secured Method");
    }

}
