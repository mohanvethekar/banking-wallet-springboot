package com.example.bankingwallet.auth;

import com.example.bankingwallet.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.bankingwallet.user.User;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private final AuthService authService;

    AuthController(AuthService authService){
        this.authService = authService;
    }

    @PostMapping("/login")
    public String login(@RequestBody User user){
        return authService.login(user.getEmail() , user.getPassword());
    }
}
