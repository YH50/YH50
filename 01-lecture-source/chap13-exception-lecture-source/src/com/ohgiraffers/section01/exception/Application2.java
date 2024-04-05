package com.ohgiraffers.section01.exception;

public class Application2 {

    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkBalance(10000, 50000);      // 구입 가능
            et.checkBalance(100000, 50000);     // 구입 불가


            System.out.println("==========상품 구입 가능=============");
        } catch (Exception e) {

            System.out.println("돈 더 가온나 개새ㅐㅐㅐㅐ이야");

        }

        System.out.println("프로그램 종료");

    }

}
