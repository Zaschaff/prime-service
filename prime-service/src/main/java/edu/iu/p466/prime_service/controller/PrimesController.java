package edu.iu.p466.prime_service.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import edu.iu.p466.prime_service.service.IPrimeService;

@RestController
@CrossOrigin
public class PrimesController {
    
    private IPrimeService primeService;
    
    public PrimesController(IPrimeService primeService) {
        this.primeService = primeService;
    }
    
    @GetMapping("/primes/{n}")
    public boolean isPrime(@PathVariable int n) {
        return primeService.isPrime(n);
    }
}
