package com.ohgiraffers.section01.method;

public class Application5 {

    public static void main(String[] args) {

        /* 수업 목표 : 메소드 리턴에 대해 이해할 수 있다. */
        /*
        * return 이란?
        * >> 모든 메소드 내에는 return 이 존재함.
        * void 메소드의 경우 return 명시 없이도 마지막 줄에 컴파일러가 자동으로 추가해줌.
        * return : 현재 메소드를 강제 종료하고 호출한 구문으로 다시 돌아가는 명령어.
        * */

        System.out.println("main() 메소드 시작");



        System.out.println("main() 메소드 종료");

    }

    public void testMethod(){

        System.out.println("테스트 메소드 동작 확인..");

        /* 컴파일러에 의해 자동으로 추가되는 구문 */
        /* 가장 마지막에 작성하고 마지막에 작성되지 않을 경우 컴파일 에러 발생
        * */

        return;

        //System.out.println();     >> 메소드의 가장 마지막에 작성돼야 하기 때문에 에러 발생.
    }
}
