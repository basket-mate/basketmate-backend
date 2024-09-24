package com.basketmate.backend.user.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDTO {
    private Long userId;  // 추가: 회원번호 필드
    private String name;
    private String loginId;
    private String password;
    private String address;
    private String subAddress;
    // 위의 @Getter와 @Setter가 lombok을 이용하여 자동으로 getter/setter를 생성해줍니다.
}

