package com.ohgiraffers.section05.logical;

public class Application2 {

    public static void main(String[] args) {

        /* 수업 목표 : 논리 연산자의 우선순위에 대해 이해하고 이를 활용할 수 있다.*/
        /* 논리 연산자의 우선순위와 활용
        * 논리 and 연산자와 논리 or 연산자의 우선순위
        * && : 11순위
        * || : 12순위
        * 논리 and 연산자가 논리 or 연산자보다 우선.
        * */

        /* 1. 1부터 100 사이의 값인지 확인 */
        //1 <= x <= 100 >>> 안됩니다~
        // "x >= 1 && x <= 100" 으로 작성해야함.
        int num1 = 55;
        System.out.println("1부터 100 사이인지 확인 : "+ (num1 >= 1 && num1 <= 100));
        int num2 = 186;
        System.out.println("1부터 100 사이인지 확인 : "+ (num2 >= 1 && num2 <= 100));



    }
}