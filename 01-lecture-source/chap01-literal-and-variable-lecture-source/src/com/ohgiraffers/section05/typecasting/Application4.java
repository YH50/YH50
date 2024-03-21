package com.ohgiraffers.section05.typecasting;

public class Application4 {

    public static void main(String[] args){

        /* 형변환 시 주의할 점을 이해하고 사용할 수 있다.
        *  형변환 사용 시 주의할 점
        * >> 데이터 손실에 유의해서 사용할 것.
        * */
        /* 1. 의도치 않은 데이터 손실 */
        int inum = 280;
        byte bnum = (byte) inum;

        System.out.println("inum : " + inum);
        System.out.println("bnum : " + bnum);       //비트 앞부분 손실로 예측이 어려움


        /* 2. 의도적인 데이터 손실 */
        double wrc = 190.4;
        int wrcplus = (int) wrc;

        System.out.println("wrc : " + wrc);
        System.out.println("wrcplus : " + wrcplus);    //소수점 자르고 싶다 - 의도적으로 자름.






    }
}
