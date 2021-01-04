package com.azure.microservice.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAzureController
{
    @GetMapping("/azure")
    public HttpEntity<String> helloAzure()
    {
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<String>("Hello azure", responseHeaders, HttpStatus.CREATED);
    }
}
