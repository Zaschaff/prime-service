package edu.iu.p466.prime_service.repository;

import edu.iu.p466.prime_service.model.Customer;
import java.io.IOException;

public interface IAuthenticationRepository {
    // 1 usage 1 implementation - A Nahameganian
    boolean save(Customer customer) throws IOException;
    
    // 3 usages 1 implementation - A Nahameganian
    Customer findByUsername(String username) throws IOException;
} 