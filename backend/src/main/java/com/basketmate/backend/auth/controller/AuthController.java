package com.basketmate.backend.auth.controller;

import com.basketmate.backend.auth.controller.request.LoginRequest;
import com.basketmate.backend.auth.controller.request.SignupRequest;
import com.basketmate.backend.auth.service.AuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody SignupRequest request) {
        authService.signup(request);
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        String accessToken = authService.login(request).toString();
        Map<String, String> tokens = new HashMap<>();
        tokens.put("authorization", accessToken);
        tokens.put("authorization-refresh", "refresh-token-placeholder");
        return ResponseEntity.ok(tokens);
    }
}