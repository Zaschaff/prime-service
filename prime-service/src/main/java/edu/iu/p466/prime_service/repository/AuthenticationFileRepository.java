package edu.iu.p466.prime_service.repository;

import edu.iu.p466.prime_service.model.Customer;
import org.springframework.stereotype.Repository;
import java.io.IOException;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.logging.Logger;
import java.nio.charset.StandardCharsets;

@Repository
public class AuthenticationFileRepository implements IAuthenticationRepository {
    
    private static final Logger LOG = 
        Logger.getLogger(AuthenticationFileRepository.class.getName());
    
    private static final String DATABASE_NAME = "data/customers.txt";
    private static final String NEW_LINE = System.lineSeparator();
    
    public AuthenticationFileRepository() { // no usages - A Nahameganian
        File file = new File(DATABASE_NAME);
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException e) {
            LOG.error(e.getMessage());
        }
    }
    
    @Override
    public Customer findByUsername(String username) throws IOException {
        Path path = Paths.get(DATABASE_NAME);
        List<String> data = Files.readAllLines(path);
        for (String line : data) {
            if(line.trim().isEmpty()) continue;
            String[] properties = line.split(",");
            if(properties[0].trim().equalsIgnoreCase(username.trim())) {
                return new Customer(properties[0].trim(), properties[1].trim());
            }
        }
        return null;
    }
    
    @Override
    public boolean save(Customer customer) throws IOException {
        Customer x = findByUsername(customer.getUsername());
        if(x == null) {
            Path path = Paths.get(DATABASE_NAME);
            String data = String.format("%s,%s", 
                customer.getUsername().trim(), 
                customer.getPassword().trim());
            data += NEW_LINE;
            Files.write(path, 
                data.getBytes(StandardCharsets.UTF_8),
                StandardOpenOption.CREATE, 
                StandardOpenOption.APPEND);
            return true;
        }
        return false;
    }
} 