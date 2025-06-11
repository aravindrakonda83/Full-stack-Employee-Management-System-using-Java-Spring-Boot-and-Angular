package com.ems.service;

import com.ems.entity.User;
import com.ems.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String register(User user) {
        if (userRepo.findByUsername(user.getUsername()) != null) {
            return "Username already taken!";
        }

        if ("ADMIN".equalsIgnoreCase(user.getRole())) {
            boolean adminExists = userRepo.findAll()
                    .stream()
                    .anyMatch(u -> "ADMIN".equalsIgnoreCase(u.getRole()));
            if (adminExists) {
                return "Admin already exists!";
            }
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        if (user.getRole() == null || user.getRole().isBlank()) {
            user.setRole("USER");
        }

        userRepo.save(user);
        return "Success";
    }

    public User getUserByUsername(String username) {
        return userRepo.findByUsername(username);
    }
}
