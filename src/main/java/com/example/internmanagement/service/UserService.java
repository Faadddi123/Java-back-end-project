package com.example.internmanagement.service;

import com.example.internmanagement.entity.User;
import com.example.internmanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Insert a new user
    public User insertUser(User user) {
        return userRepository.save(user);
    }

    // Show all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Show user by ID
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Remove user by ID
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
