package com.test.auth;

import com.test.auth.SnsAuth;
import com.test.DTO.MemberDTO;
public class NaverAuth implements SnsAuth {

    @Override
    public boolean login(MemberDTO member) {
        return true;
    }
}