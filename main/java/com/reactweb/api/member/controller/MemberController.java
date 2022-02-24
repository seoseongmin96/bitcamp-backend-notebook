package com.reactweb.api.member.controller;

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
public class MemberController {

    private final MemberService service;

    @GetMapping("/member/bmi/{name}/{height}/{weight}")
    public String getBmi(@PathVariable String name,
                         @PathVariable double height,
                         @PathVariable double weight) {
        System.out.println(" 리액트에서 넘어온 데이터: "+name);
        System.out.println(" 리액트에서 넘어온 데이터: "+height);
        System.out.println(" 리액트에서 넘어온 데이터: "+weight);
        return "BMI 는 정상";

        }
    }
