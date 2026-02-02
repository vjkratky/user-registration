package com.vjkratky.userregistration.repository;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.UUID;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(UUID userId) {
        super("User with id " + userId + "  not found");
    }

    public UserNotFoundException(String username) {
        super("User with username " + username + "  not found");
    }

}
