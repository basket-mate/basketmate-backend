package com.basketmate.backend.auth.controller.request;

import com.basketmate.backend.user.entity.UserEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupRequest {
    private String username;
    private String password;
    private String phoneNumber;
    private String address;
    private String detailAddress;

    // toEntity 메서드를 추가
    public UserEntity toEntity(String encodedPassword) {
        return UserEntity.builder()
                .username(this.username)
                .password(encodedPassword)
                .phoneNumber(this.phoneNumber)
                .address(this.address)
                .detailAddress(this.detailAddress)
                .build();
    }
}
