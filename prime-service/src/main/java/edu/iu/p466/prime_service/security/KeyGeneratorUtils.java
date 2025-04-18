package edu.iu.p466.prime_service.security;

import org.springframework.stereotype.Component;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

@Component
public class KeyGeneratorUtils {

    private KeyGeneratorUtils() {}

    public static KeyPair generateRsaKey() {
        KeyPair keyPair;
        try {
            KeyPair rsaKey;
            try {
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
                keyPairGenerator.initialize(2048);
                rsaKey = keyPairGenerator.generateKeyPair();
            } catch (Exception ex) {
                throw new IllegalStateException(ex);
            }
            return rsaKey;
        } catch (Exception ex) {
            throw new IllegalStateException(ex);
        }
    }
} 