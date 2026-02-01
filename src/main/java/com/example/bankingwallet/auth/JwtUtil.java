package com.example.bankingwallet.auth;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class JwtUtil {

    public String generateToken(String email){
        return "TOKEN_" + email + "_" + UUID.randomUUID();
    }
}
