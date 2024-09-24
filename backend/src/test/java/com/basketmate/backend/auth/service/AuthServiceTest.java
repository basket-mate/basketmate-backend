package com.basketmate.backend.auth.service;  // 패키지 경로 확인

import com.basketmate.backend.auth.controller.request.LoginRequest;
import com.basketmate.backend.auth.controller.request.SignupRequest;
import com.basketmate.backend.user.entity.UserEntity;
import com.basketmate.backend.user.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AuthServiceTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private PasswordEncoder passwordEncoder;

    @InjectMocks
    private AuthService authService;

    @Test
    public void testSignup() {
        SignupRequest signupRequest = new SignupRequest();
        signupRequest.setUsername("testuser");
        signupRequest.setPassword("password");
        signupRequest.setPhoneNumber("010-1234-5678");
        signupRequest.setAddress("Seoul");
        signupRequest.setDetailAddress("Address detail");

        when(passwordEncoder.encode(anyString())).thenReturn("encodedPassword");

        authService.signup(signupRequest);

        verify(userRepository, times(1)).save(any(UserEntity.class));
    }

    @Test
    public void testLoginSuccess() {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername("testuser");
        loginRequest.setPassword("password");

        UserEntity userEntity = UserEntity.builder()
                .username("testuser")
                .password("encodedPassword")
                .build();

        when(userRepository.findByUsername("testuser")).thenReturn(Optional.of(userEntity));
        when(passwordEncoder.matches(anyString(), anyString())).thenReturn(true);

        String token = authService.login(loginRequest);

        assertNotNull(token);
    }

    @Test
    public void testLoginFailure() {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername("wronguser");
        loginRequest.setPassword("password");

        when(userRepository.findByUsername("wronguser")).thenReturn(Optional.empty());

        Exception exception = assertThrows(RuntimeException.class, () -> {
            authService.login(loginRequest);
        });

        assertEquals("Invalid username or password", exception.getMessage());
    }
}
