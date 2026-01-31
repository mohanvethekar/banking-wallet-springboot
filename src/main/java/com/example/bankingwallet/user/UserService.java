package com.example.bankingwallet.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    UserService(UserRepository userRepository){
        this.userRepository = userRepository;    // this avoids nullpointer Exception and privents changes in repositoty
    }

    public User resisterUser(User user){
        return userRepository.save(user);
    }
}
