package com.basketmate.backend.user.entity;

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
    private String email;
    private String phoneNumber;
    private String address;
    private String detailAddress;
}