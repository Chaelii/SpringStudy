package com.example.study.controller.toyproject;

import com.example.study.model.AuthUser;
import com.example.study.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<AuthUser> register(@RequestParam String username, @RequestParam String password, @RequestParam String name) {
        AuthUser authUser = authService.register(username, password, name);
        return ResponseEntity.ok(authUser);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password) {
        return authService.login(username, password)
                .map(authUser -> ResponseEntity.ok("Login successful!"))
                .orElse(ResponseEntity.status(401).body("Invalid credentials"));
    }
}

