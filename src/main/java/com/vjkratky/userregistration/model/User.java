package com.vjkratky.userregistration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Entity(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    //default
    //vjkratky
    //123456

    @Id
    @GeneratedValue
    private UUID id;
    private String username;
    private String password;
}
