package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {

    public void simpleTestIfElseStatement(){
        /* 수업 목표 : if-else 문의 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.
        *
        * [if - else 조건식]
        * if(조건식){
        *           조건식이 참일때 실행할 명령문;
        * } else {
        *           조건식이 거짓일때 실행할 명령문
        * }
        * */

        /* if 문은 조건식의 결과가 참이면 if{} 안에 있는 코드를 실행하고
        *  조건식의 결과가 거잣이면 else의 {} 안에 있는 코드를 실행.
        * */


        /* 정수 한 개를 입력받아 그 수가 홀수이면 "입력한 숫자 : 홀수." 코드 실행,
        * 조건식의 결과가 거짓이면 else{} 안에 있는 코드 실행
        *
        * */
        /* 단 조건과 상관 없이 프로그램이 종료될 때 "프로그램 종료" 출력되게 하기.
        * */


        Scanner sc = new Scanner((System.in));
        System.out.print("정수를 하나 입력하세요 : ");
        int no = sc.nextInt();

        //짝수 조건 확인
        if ( no % 2 != 0) {
            /* 조건문이 참일 때 출력할 내용 */
            System.out.println("입력한 정수는 홀수.");
        }else{
            /* 조건식이 거짓일 때 출력할 내용 */
            System.out.println("입력한 정수는 짝수.");
        }
        /* 조건문과 상관없이 프로그램 종료 시 출력 내용 */
        System.out.println("프로그램 종료.");
    }

    public void testNeatedIfStatement(){

        /* 수업 목표 : 중첩된 if-else 문의 흐름을 이해하고 적용할 수 있다. */
        /* 중첩된 if-else 문 실행의 흐름 확인 */

        /*
        * 숫자 하나를 입력받아 양수이면 "입력한 숫자는 양수"를 출력하고,
        * 음수이면 "입력한 숫자는 음수"를 출력, 단 0일 경우 "0입니다." 가 출력되게 만들기.
        * 조건과 상관없이 프로그램이 종료될 때 "프로그램 종료" 출력되게 하기.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int no = sc.nextInt();

        if(no != 0){

            if(no > 0) {
                System.out.println("입력한 숫자는 양수");

            }else{ // no < 0
                System.out.println("입력한 숫자는 음수");
            }



        }else{ // no == 0
            System.out.println("0입니다.");

        }
        System.out.println("프로그램 종료");






    }
}
