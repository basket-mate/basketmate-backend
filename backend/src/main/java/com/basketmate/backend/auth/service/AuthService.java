package com.basketmate.backend.auth.service;

import com.basketmate.backend.auth.controller.request.LoginRequest;
import com.basketmate.backend.auth.controller.request.SignupRequest;
import com.basketmate.backend.user.entity.UserEntity;
import com.basketmate.backend.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    // 회원가입 메서드
    public void signup(SignupRequest request) {
        String encodedPassword = passwordEncoder.encode(request.getPassword());
        UserEntity user = request.toEntity(encodedPassword);
        userRepository.save(user);
    }

    // 로그인 메서드
    public String login(LoginRequest request) {
        UserEntity user = userRepository.findByUsername(request.getUsername())
                .orElseThrow(() -> new RuntimeException("Invalid username or password"));

        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid username or password");
        }

        // JWT 토큰을 반환하는 로직이 필요하면 추가하세요. 현재는 가짜 토큰을 반환합니다.
        return "dummy-jwt-token";
    }
}
