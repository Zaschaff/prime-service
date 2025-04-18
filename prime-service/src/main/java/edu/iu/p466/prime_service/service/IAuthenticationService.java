package edu.iu.p466.prime_service.service;

import edu.iu.p466.prime_service.model.Customer;
import java.io.IOException;

public interface IAuthenticationService {
    // 1 usage 1 implementation - A Nahameganian
    boolean register(Customer customer) throws IOException;
    
    // no usages 1 implementation - A Nahameganian
    boolean login(String username, String password) throws IOException;
} 