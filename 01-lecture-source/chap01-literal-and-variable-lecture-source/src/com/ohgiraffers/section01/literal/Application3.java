package com.ohgiraffers.section01.literal;

public class Application3 {

    public static void main(String[] args){

        /*수업 목표 : 문자열 합치기 결과를 예측, 사용할 수 있다.*/

        /* 1. 2개의 문자열 합치기 */
        System.out.println("======== 2개의 문자열 합치기 ========");
        System.out.println(9 + 9); //18
        System.out.println("9" + "9"); //99
        System.out.println("9" + 9); //99
        System.out.println(9 + "9"); //99


        /* 2. 3개의 문자열 합치기 */
        System.out.println("======== 3개의 문자열 합치기 ========");
        System.out.println("9" + 9 + 9); //999
        System.out.println(9 + "9" + 9); //999
        System.out.println(9 + 9 + "9"); //189

        /* 연산 과정은 왼쪽부터 진행 후 오른쪽과 연산하기 때문에
            3번째의 경우 999가 아닌 18"9"가 출력됨.
            단 "189"가 숫자가 아닌 문자열 형태로 존재. */
        //"918"을 출력하려면?
        System.out.println("9" + (9 + 9)); //918
        //숫자끼리 괄호로 묶으면 괄호 먼저 계산, 그 이후 문자열과 합치기 수행

        /* 3. 문자열 합치기의 응용 */
        /* 10과 20의 사칙연산 결과를 출력하기 */
        System.out.println("======== 10과 20의 사칙연산 결과 ========");
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);
        /*//////////////////////////////////////////////*/
        System.out.println("======== 10과 20의 사칙연산 결과를 보기 좋게 출력하기 ========");
        System.out.println("10과 20의 합 = " + (10 + 20));//괄호가 없을 시 1020으로 출력
        System.out.println("10과 20의 차 = " + (10 - 20));//문자열은 "-" 연산 불가. 반드시 괄호 사용
        System.out.println("10과 20의 곱 = " + (10 * 20));
        System.out.println("10과 20의 몫 = " + (10 / 20));
        System.out.println("10을 20으로 나눴을 때의 나머지 = " + (10 % 20));


        System.out.println("기차"); //기차
        System.out.println("기차" + "칙칙폭폭"); //기차칙칙폭폭
        System.out.println("기차" + 123 + 34 + "칙칙폭폭"); //기차12334칙칙폭폭
        System.out.println(123 + 34 + "기차" + "출발"); //157기차출발
        

    }
}
