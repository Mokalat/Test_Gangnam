package com.test.service;

import com.test.auth.SnsAuth;
import com.test.DTO.MemberDTO;

public class MemberService {
    private SnsAuth snsAuth;

    public MemberService(SnsAuth snsAuth) {
        this.snsAuth = snsAuth;
    }

    public String loginMember(MemberDTO memberDTO) {
        boolean result = snsAuth.login(memberDTO);
        String type = snsAuth.getClass().getSimpleName().replace("Auth", "");

        return type + "으로 로그인 " + (result ? "성공" : "실패");
    }
}
