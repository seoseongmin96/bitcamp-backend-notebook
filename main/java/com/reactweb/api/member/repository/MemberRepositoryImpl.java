package com.reactweb.api.member.repository;

import com.reactweb.api.member.domain.CalcDTO;
import com.reactweb.api.member.domain.MemberDTO;
import org.springframework.stereotype.Repository;

/**
 * packageName: com.reactweb.api.member.repository
 * fileName   : MemberRepositoryImpl
 * author     : seoseongmin
 * date       : 2022-02-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-11     seoseongmin        최초 생성
 */
@Repository
public class MemberRepositoryImpl implements MemberRepository {

    @Override
    public String bmi(MemberDTO bmi) {
        return null;
    }

    @Override
    public String grade(MemberDTO grade) {
        return null;
    }
}

