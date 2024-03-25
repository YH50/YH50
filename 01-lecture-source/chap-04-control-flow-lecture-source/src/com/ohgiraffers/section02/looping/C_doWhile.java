package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_doWhile {

    public void testSimpleDoWhileStatement(){
        /*do-while문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /*
        *
        * [do-while문 표현식]
        * 초기식;
        *   do{
        *       1회차는 무조건 실행하고 이후에는 조건식을 확인하여
        *               조건을 만족하는 경우 수행할 구문(반복할 구문)
        *       증감식;
        * }     while(조건식);
        *
        * */
        do{
            System.out.println("최초 한 번 동작함...");
        }while(false);
        System.out.println("반복문 종료 확인...");
    }

    public void testSimpleDoWhileExample(){

        /* do-while 문의 흐름을 이해하고 적용할 수 있다. */
        /* 키보드로 문자열을 입력받아 반복적으로 출력하기 */
        // 단 exit 가 입력되면 반복문을 종료.

        Scanner sc = new Scanner(System.in);

        String str = "";

        do{

            System.out.print("문자열을 입력하세요 : ");
            str = sc.nextLine();
            System.out.println(str);

            /* equals : 문자열은 "==" 비교가 불가능함. 저 말 뜻은 문자열이 같은지 비교하는 기능임. */
        }while(!str.equals("exit"));

        System.out.println("프로그램을 종료합니다.");
    }
}
