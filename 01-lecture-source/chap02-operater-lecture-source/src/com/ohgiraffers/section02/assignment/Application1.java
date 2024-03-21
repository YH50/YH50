package com.ohgiraffers.section02.assignment;

public class Application1 {

    public static void main(String[] args) {
        /* 수업 목표 : 대입연산자와 산술 복합 대입 연산자를 이해하고 활용할 수 있다. */

        /* 대입 연산자와 산술 복합 대입 연산자
        *  '=' : 왼쪽 피연산자에 오른쪽 피연산자를 대입
        *  '+=' : 왼쪽 피연산자에 오른쪽 피연산자를 더한 결과를 왼쪽 피연산자에 대입
        *  '-=' : --------------------------를 뺀 결과를 왼쪽 피연산자에 대입
        *  '*=' : --------------------------를 곱한 결과를 왼쪽 피연산자에 대입
        *  '/=' : --------------------------를 나눈 결과를 왼쪽 피연산자에 대입
        *  '%=' : --------------------------를 나눈 나머지 결과를 왼쪽 피연산자에 대입
        * */

        int num = 13;

        System.out.println("num : " + num);

        //3 증가 시
        num += 3;       // 기존 num = num + 3 과 동일.
        System.out.println("num : " + num);
        num += 3;
        System.out.println("num : " + num);
        num -= 4;
        System.out.println("num : " + num);
        num *= 2;
        System.out.println("num : " + num);
        num /= 5;
        System.out.println("num : " + num);
        num %= 4;
        System.out.println("num : " + num);

        /* 주의 사항 */
        /* 산술 복합 대입연산자의 작성 순서 주의해야할 것.*/

        num =- 4;
        System.out.println("num : " + num);     //얘는 그냥 -4임





    }
}
