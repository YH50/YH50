package com.ohgiraffers.section01.exception;

public class ExceptionTest {

    public void checkBalance (int price, int money) throws Exception {

        System.out.println("가지고 계신 돈은 " +money+ "원 입니다.");

        if(money >= price){
            System.out.println("상품 구입이 가능합니다. ");
        }else{

            throw new Exception();
        }
        System.out.println("즐거운 쇼핑 되세요~");
    }
}
