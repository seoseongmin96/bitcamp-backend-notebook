package com.reactweb.api.buy.domain;

/**
 * packageName: com.reactweb.api.buy.domain
 * fileName   : BuyDTO
 * author     : seoseongmin
 * date       : 2022-02-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-11     seoseongmin        최초 생성
 */
public class BuyDTO {
    private static final BuyDTO buyDTO = new BuyDTO();
    private BuyDTO(){}
    public static BuyDTO getInstance(){return buyDTO;}

    private int num;
    private String memId;
    private String prodName;
    private String groupname;
    private int price;
    private String amount;

    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }
    public String getMemId(){
        return memId;
    }
    public void setMemId(String memId){
        this.memId = memId;
    }
    public String getProdName(){
        return prodName;
    }
    public void setProdName(String groupname){
        this.groupname = groupname;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getAmount(){
        return amount;
    }
    public void setAmount(String amount){
        this.amount = amount;
    }
}
