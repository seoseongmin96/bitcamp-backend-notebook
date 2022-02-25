package com.reactweb.api.member.controller;

import com.reactweb.api.member.domain.CalcDTO;
import com.reactweb.api.member.domain.MemberDTO;
import com.reactweb.api.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * packageName: com.reactweb.api.member.controller
 * fileName   : MemberController
 * author     : seoseongmin
 * date       : 2022-02-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-11     seoseongmin        최초 생성
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService service;

   @PostMapping("/bmi") public String bmi(@RequestBody MemberDTO bmi){
       return service.bmi(bmi);
   }


   @PostMapping("/calc") public String calc(@RequestBody CalcDTO calc){
      return service.calc(calc);

   }

   @PostMapping("/grade") public String grade(@RequestBody MemberDTO grade){
       return service.grade(grade);
   }

}