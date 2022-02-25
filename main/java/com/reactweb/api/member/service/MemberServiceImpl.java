package com.reactweb.api.member.service;

import com.reactweb.api.member.domain.CalcDTO;
import com.reactweb.api.member.domain.MemberDTO;
import com.reactweb.api.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * packageName: com.reactweb.api.member.service
 * fileName   : MemberImpl
 * author     : seoseongmin
 * date       : 2022-02-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-11     seoseongmin        최초 생성
 */
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
   private final MemberRepository repository;

   @Override
   public String calc(CalcDTO calc) {
      int a = calc.getNum1();
      int b = calc.getNum2();
      int res = 0;
      String op = calc.getOpcode();
      switch (op) {
         case "+":
            res = a + b;
            break;
         case "-":
            res = a - b;
            break;
         case "*":
            res = a * b;
            break;
         case "/":
            res = a / b;
            break;
         case "%":
            res = a % b;
            break;
      }
      return String.format("%d %s %d = %d", a, op, b, res);


   }

   @Override
   public String bmi(MemberDTO bmi) {
      return repository.bmi(bmi);
   }

   @Override
   public String grade(MemberDTO grade) {
      return repository.grade(grade);
   }
}
