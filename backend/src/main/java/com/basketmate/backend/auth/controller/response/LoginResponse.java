package com.basketmate.backend.auth.controller.response;

import lombok.Builder;

@Builder
public class LoginResponse {
    private String email;
    private String username;
    private String phoneNumber;
    private String address;
    private String detailAddress;
    private String token;
}