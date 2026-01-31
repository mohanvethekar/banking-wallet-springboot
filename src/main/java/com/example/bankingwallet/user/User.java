package com.example.bankingwallet.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
class User {
    @Id
    @GeneratedValue
    private Long Cust_id;

    private String name;
    private String email;
    private String password;
}
