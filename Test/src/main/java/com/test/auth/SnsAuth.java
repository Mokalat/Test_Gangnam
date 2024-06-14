package com.test.auth;

import com.test.DTO.MemberDTO;
public interface SnsAuth {

    boolean login(MemberDTO member);

}