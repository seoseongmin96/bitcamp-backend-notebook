package com.reactweb.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: com.reactweb.api.member.domain
 * fileName   : CalcDTO
 * author     : seoseongmin
 * date       : 2022-02-25
 * desc       :
 * 클래스변수   :
 * 인스턴수변수 :
 * 파라미터변수 :
 * 로컬변수    :
 * ================================
 * DATE       AUTHOR        NOTE
 * ================================
 * 2022-02-25    seoseongmin        최초 생성
 */
@Data
@Component
public class CalcDTO {
    private int num1;
    private int num2;
    private String opcode;
}
