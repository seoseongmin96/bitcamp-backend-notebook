package com.reactweb.api.member.service;

import java.util.Scanner;

/**
 * packageName: com.reactweb.api.member.service
 * fileName   : MemverService
 * author     : seoseongmin
 * date       : 2022-02-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-11     seoseongmin        최초 생성
 */
public interface MemberService {
    String membershiplist();
    String membershipinformation();
    String checkthelist();
    String registertosendemails();
    String savingmoneylist();
    String checkthedetailsofthesavings();

}
