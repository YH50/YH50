package com.ohgiraffers.section06.ternary;

public class Application1 {

    public static void main(String[] args) {

        /* 수업 목표 : 삼항연산자에 대해 이해하고 활용할 수 있다. */

        /* 삼항연산자
        * 자바에서 유일하게 피연산자 항목이 3개인 연산자.
        * 항목이 3개. >> "(조건식)? 참일때 사용할 값1 : 거짓일 때 사용할 값2"
        *
        * 조건식은 반드시 결과가 true 혹은 false 가 나오게 작성해야함.
        * 주로 비교,논리연산자가 사용됨.
        * */

        /* 삼항연산자 단독 사용 */

        int n3 = 10;
        int n4 = -10;
        String res3 = (n3 > 0)? "양수임" : "양수가 아님";
        System.out.println("n3 - " + res3);

        String res4 = (n4 > 0)? "양수임" : "양수가 아님";
        System.out.println("n4 - "+ res4);


        /* 삼항연산자의 중첩 사용 */

        int n5 = 5;
        int n6 = 0;
        int n7 = -5;

        String res5 = (n5 > 0)? "양수" : (n5  == 0)? "0임" : "음수";
        String res6 = (n6 > 0)? "양수" : (n6  == 0)? "0임" : "음수";
        String res7 = (n7 > 0)? "양수" : (n7  == 0)? "0임" : "음수";

        System.out.println("n5 - "+ res5);
        System.out.println("n6 - "+ res6);
        System.out.println("n7 - "+ res7);


    }
}
