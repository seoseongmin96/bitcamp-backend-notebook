package com.reactweb.api.member.repository;

import com.reactweb.api.member.domain.CalcDTO;
import com.reactweb.api.member.domain.MemberDTO;

/**
 * packageName: com.reactweb.api.member.repository
 * fileName   : MemberRepository
 * author     : seoseongmin
 * date       : 2022-02-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-11     seoseongmin        최초 생성
 */
public interface MemberRepository {


    String bmi(MemberDTO bmi);

    String grade(MemberDTO grade);
}
