package com.example.bankingwallet.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bankWallet")
public class UserController {
    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.resisterUser(user);
    }

    @GetMapping("/user/profile")
    //gets the value of the key Autherization from header and stores it into token and it can be null also header may be missing
    public String getUserDetails(@RequestHeader(value = "Authorization", required = false) String token) {
        if (token == null && token.isEmpty()) {
            throw new RuntimeException("Missing token");
        }
        if(token.startsWith("TOKEN_")){
            throw new RuntimeException("invalid token");
        }
        return "This is protected user profile";
    }
}
