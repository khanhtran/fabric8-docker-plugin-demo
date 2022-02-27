package com.mustafa.fabricdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

     @GetMapping
    public ResponseEntity<String> getHello(){
         return new ResponseEntity<>("Hello from fabric8io maven plugin demo", HttpStatus.OK);
     }
}
