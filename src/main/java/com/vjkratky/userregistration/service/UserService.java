package com.vjkratky.userregistration.service;

import com.vjkratky.userregistration.model.User;
import com.vjkratky.userregistration.repository.UserNotFoundException;
import com.vjkratky.userregistration.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private final UserRepository repository;
    private final BCryptPasswordEncoder encoder;

    public UserService(UserRepository repository) {
        this.repository = repository;
        this.encoder = new BCryptPasswordEncoder(12);;
    }

    public List<User> getUsers() {
        return this.repository.findAll();
    }

    public User getUser(UUID userId) {
        return this.repository.findById(userId).orElseThrow(() -> new UserNotFoundException(userId));
    }

    public void addUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        this.repository.save(user);
    }

    public void updateUser(UUID userId, User user) {
        if(this.repository.existsById(userId)) {
            if(user.getPassword() != null | !user.getPassword().isEmpty()) {
                user.setPassword(encoder.encode(user.getPassword()));
            }
            this.repository.save(user);
        } else {
            throw new UserNotFoundException(userId);
        }
    }

    public void deleteUser(UUID userId) {
        this.repository.deleteById(userId);
    }

    public User findByUsername(String username) {
        return this.repository.findByUsername(username).orElseThrow(()->new UserNotFoundException(username));
    }
}
