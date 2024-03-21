package com.ohgiraffers.section04.overflow;

public class Application1 {

    public static void main(String[] args) {

        /* 수업 목표 : 오버플로우에 대해 이해할 수 있다. */
        /* 자료형의 값의 최대 범위를 벗어나는 경우
         * 발생한 carry를 버림 처리하고 sign bit룰 반전시켜 최소값으로 순환시킴
         */

        /* 1. 오버플로우 */
        byte num1 = 127;

        System.out.println("num1 : " + num1);

        num1++; //1만큼 증가

        System.out.println("num1 오버플로우 : " + num1);

        /* 2. 언더플로우  */
        //오버플로우의 반대, 최소범위보다 작은 수를 발생시키는 경우 일어나는 현상
        byte num2 = -128;

        System.out.println("num2 : " + num2);

        num2--; //1만큼 감소

        System.out.println("num2 오버플로우 : " + num2);



        int firstNum = 1000000;
        int secondNum = 500000;

        int multi = firstNum * secondNum;       //5000억이 나와야 함.
        System.out.println("firstNum * second Num = " + multi);
        //결과값이 다르게 나옴
        /* 3. 해결법
         * >> 오버플로우를 예측하고 더 큰 자료형으로 결과값을 받아서 처리하기 */
        long longMulti = firstNum * secondNum;
        System.out.println("firstNum * second Num = " + longMulti);
        // tlqkf 그래도 똑같네

        long result = (long)firstNum * secondNum;
        System.out.println("result : " + result);
        //이러면 정상으로 5000억이 나온다 이말이야

    }
}