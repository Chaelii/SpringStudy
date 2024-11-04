package com.example.study.service;

import com.example.study.model.AuthUser;
import com.example.study.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public AuthService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public AuthUser register(String username, String password, String name) {
        String encodedPassword = passwordEncoder.encode(password);
        AuthUser authUser = new AuthUser(username, encodedPassword, name); // 이름 추가
        return userRepository.save(authUser);
    }

    public Optional<AuthUser> login(String username, String password) {
        Optional<AuthUser> user = userRepository.findByUsername(username);
        if (user.isPresent() && passwordEncoder.matches(password, user.get().getPassword())) {
            return user;
        }
        return Optional.empty();
    }
}

