package com.ohgiraffers.section01.arithmetic;

public class Application1 {

    public static void main(String[] args){


        /* 수업 목표 : 산술 연산자에 대해 이해하고 활용할 수 있다. */
        /* 산술연산자
        *  주로 사칙연산과 관련된 연산자로 가장 기본적이며 많이 사용되는 연산자.
        *  연산의 실행이 가능하기 위해 필요한 값이나 변수가 2개인 이항 연산자로 분류,
        *  피연산자들의 연산방향은 왼쪽 > 오른쪽
        * */

        /*
        *  산술연산자의 종류
        *  '+' : 왼쪽 피연산자에 오른쪽 피연산자를 더함
        *  '-' : --------------------------를 뺌
        *  '*' : --------------------------를 곱함
        *  '/' : --------------------------를 나눔
        *  '%' : --------------------------로 나눈 나머지를 반환
        * */

        /*
        *  산술연산자의 우선 순위
        *   >> 수학에서의 개념과 유사하게 *, / 먼저, +, - 는 그 다음으로
        *  우선순위가 같은 경우 연산자의 결합 방향에 따라 실행 순서가 결정됨
        * */

        int no1 = 20;
        int no2 = 4;

        System.out.println("no1 + no2 : "+ (no1 + no2));
        System.out.println("no1 - no2 : "+ (no1 - no2));
        System.out.println("no1 * no2 : "+ (no1 * no2));
        System.out.println("no1 / no2 : "+ (no1 / no2));
        System.out.println("no1 % no2 : "+ (no1 % no2));



    }
}
