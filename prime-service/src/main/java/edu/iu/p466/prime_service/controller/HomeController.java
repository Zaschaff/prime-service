package edu.iu.p466.prime_service.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@CrossOrigin
public class HomeController {
    
    @GetMapping
    public String greetings() {
        return "Welcome to the primes service!";
    }
}
