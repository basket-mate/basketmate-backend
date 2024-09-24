package com.basketmate.backend.user.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private long id;

    private String username;
    private String password;
    private String phoneNumber;
    private String address;
    private String detailAddress;

    @Builder
    public UserEntity(String username, String password, String phoneNumber, String address, String detailAddress) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.detailAddress = detailAddress;
    }
}
