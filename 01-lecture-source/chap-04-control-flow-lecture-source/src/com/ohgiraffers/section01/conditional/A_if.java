package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {

    public void testSimpleIfStatement(){


        /* 수업 목표 : if 단독 사용에 대한 흐름을 이해하고 적용시킬 수 있다. */
        /* [if문 표현식]
         * if(조건식) {
         *       조건식이 true 일 때 실행할 명령문;
         * }
         * */

        /* 조건식 : true or false 가 나오는 연산식.
         * if 문은 조건식 결과값이 참(true)이면 {} 안의 코드를 실행하고
         *              결과값이 거짓(false)이면 {} 안의 코드를 무시하고 넘김.
         * */

        /*
         * 정수 한 개를 입력받아 그 수가 짝수이면 "입력한 숫자는 짝수입니다." 라고 출력하고
         * 짝수가 아니면 출력하지 않는 구문을 만들어보기.
         * 단 조건과 관련없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되게 만들기. */

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 한 개를 입력하세요 : ");
        int no = sc.nextInt();
        if(no % 2 == 0){
            System.out.println("입력하신 숫자는 짝수.");
        }
        System.out.println("프로그램을 종료합니다.");

    }

    public void testNextIfStatement(){

        /* 수업 목표 : 중첩된 if문의 흐름을 이해하고 적용할 수 있다. */
        /* 중첩된 if문 실행의 흐름 확인 */

        /* 정수 한 개를 입력받아 그 수가 양수인 경우에만 짝수인지를 확인하고
        * 짝수이면 "입력하신 숫자는 양수이며 짝수." 라고 출력하고
        * 둘 중 어디에도 해당이 안될 시 아무 내용도 출력하지 않는 구문을 작성해보기. */
        //단 조건과 상관없이 프로그램이 종료될 때 "프로그램을 종료합니다." 출력되게 하기.

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 한 개를 입력하세요 : ");
        int no = sc.nextInt();

        if(no > 0){
            if(no % 2 == 0){
                System.out.println("입력하신 숫자는 양수이면서 짝수.");
            }
        }
        System.out.println("프로그램을 종료합니다.");


    }

}
