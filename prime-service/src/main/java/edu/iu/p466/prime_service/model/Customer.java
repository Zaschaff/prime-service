package edu.iu.p466.prime_service.model;

public class Customer {
    private String username;
    private String password;

    // A. Nahameganian
    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // 3 usages - A Nahameganian
    public String getUsername() { return username; }

    // no usages
    public void setUsername(String username) {
        this.username = username;
    }

    // 1 usages - A Nahameganian
    public String getPassword() { return password; }

    // 1 usages - A Nahameganian
    public void setPassword(String password) {
        this.password = password;
    }
} 