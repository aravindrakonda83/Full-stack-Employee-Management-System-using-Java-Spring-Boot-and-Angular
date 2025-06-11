package com.ems.controller;

import com.ems.entity.User;
import com.ems.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user) {
        if (userRepository.findByUsername(user.getUsername()) != null) {
            return "redirect:/register.html?error";
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole("USER");
        userRepository.save(user);

        return "redirect:/login.html?success";
    }

    @GetMapping("/dashboard")
    public String showDashboard() {
        return "redirect:/dashboard.html";
    }
}
