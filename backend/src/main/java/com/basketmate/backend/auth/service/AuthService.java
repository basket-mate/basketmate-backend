package com.basketmate.backend.auth.service;

import com.basketmate.backend.auth.controller.request.LoginRequest;
import com.basketmate.backend.auth.controller.request.SignupRequest;
import com.basketmate.backend.auth.jwt.service.JwtService;
import com.basketmate.backend.user.entity.UserEntity;
import com.basketmate.backend.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public void signup(SignupRequest request) {
        String encodedPassword = passwordEncoder.encode(request.getPassword());
        UserEntity user = request.toEntity(encodedPassword);
        userRepository.save(user);
    }

    public Map<String, String> login(LoginRequest request) {
        UserEntity user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found with this email"));

        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw new RuntimeException("Incorrect password provided");
        }

        String accessToken = jwtService.createAccessToken(String.valueOf(user.getId()));

        Map<String, String> tokens = new HashMap<>();
        tokens.put("authorization", accessToken);
        tokens.put("authorization-refresh", "refresh-token-placeholder");

        return tokens;
    }

}
