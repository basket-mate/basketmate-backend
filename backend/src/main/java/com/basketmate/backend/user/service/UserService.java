package com.basketmate.backend.user.service;

import com.basketmate.backend.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository UserRepository;
    private final PasswordEncoder passwordEncoder;  // 비밀번호 암호화


}
