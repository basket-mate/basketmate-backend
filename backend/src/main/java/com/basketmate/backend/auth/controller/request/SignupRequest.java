package com.basketmate.backend.auth.controller.request;

import com.basketmate.backend.user.entity.UserEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupRequest {
    private String email;
    private String username;
    private String password;
    private String phoneNumber;
    private String address;
    private String detailAddress;

    public UserEntity toEntity(String encodedPassword) {
        return UserEntity.builder()
                .email(email)
                .username(username)
                .password(encodedPassword)
                .phoneNumber(phoneNumber)
                .address(address)
                .detailAddress(detailAddress)
                .build();
    }
}