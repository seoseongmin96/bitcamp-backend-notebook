package com.reactweb.api.member.domain;

import java.util.Scanner;

/**
 * packageName: com.reactweb.api.member.domain
 * fileName   : MemberDTO
 * author     : seoseongmin
 * date       : 2022-02-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-11     seoseongmin        최초 생성
 */
public class MemberDTO {

    private final static MemberDTO memberDTO = new MemberDTO();
    private MemberDTO(){}
    public static MemberDTO getInstance(){return memberDTO;}

    private String memId;
    private String memName;
    private int menNumberr;
    private String addr;
    private String phone1;
    private String phone2;
    private int height;
    private String debutDate;

    public String getMemid(){
        return memId;
    }
    public void setMemid(String memId){
        this.memId = memId;

    }
    public String getMemname(){
        return memName;
    }
    public void setMemName(String memName){
        this.memName = memName;}

    public int getMenNumberr(){
        return menNumberr;
        }
    public void setMenNumberr(int menNumberr){
        this.menNumberr = menNumberr;}


        public String getPhone1(){
    return phone1;
}
        public void setPhone1(){
        this.phone1 = phone1;
    }
        public String getPhone2(){
        return phone2;
    }
        public void setPhone2(String phone2){
        this.phone2 = phone2;
    }
        public int getHeight(){
        return height;
    }
        public void setHeight(int height){
        this.height = height;
    }
        public String getDebutDate(){
        return debutDate;
    }
        public void setDebutDate(String debutDate){
        this.debutDate = debutDate;
    }

}
