package com.example.bankingwallet.auth;

import com.example.bankingwallet.user.User;
import com.example.bankingwallet.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;

    public AuthService( UserRepository userRepository , JwtUtil jwtUtil){
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
    }

    public String login(String email , String password){
        User user = userRepository.findByEmail(email);

        if(!user.getPassword().equals(password)){
            throw new RuntimeException("Invalid password");
        }
        return jwtUtil.generateToken(email);
    }
}
