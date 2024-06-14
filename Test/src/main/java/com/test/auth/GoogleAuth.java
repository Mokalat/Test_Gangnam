package com.test.auth;
import com.test.DTO.MemberDTO;

public class GoogleAuth implements SnsAuth {

    @Override
    public boolean login(MemberDTO member) {
        return true;
    }
}