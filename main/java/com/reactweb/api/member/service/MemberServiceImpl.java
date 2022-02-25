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

      double bmi1 = bmi.getWeight() / (bmi.getHeight() * bmi.getHeight()) * 10000;
      String s = "";
      if (bmi1 >= 35) {
         s = "고도비만";
      } else if (bmi1 >= 30) {
         s = "중(重)도 비만 (2단계 비만)";
      } else if (bmi1 >= 25) {
         s = "경도 비만 (1단계 비만)";
      } else if (bmi1 >= 23) {
         s = "과체중";
      } else if (bmi1 >= 18.5) {
         s = "정상";
      } else {
         s = "저체중";
      }
      return String.format(bmi.getName() + s);
   }
   @Override
   public String grade(MemberDTO grade) {
      return repository.grade(grade);
   }
}

