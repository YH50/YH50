package com.ohgiraffers.section01.method;

public class Application2 {

    public static void main(String[] args) {

        /* 다른 흐름의 메소드 호출 흐름에 대해 이해할 수 있다. */

        /*
        * 1. method1(), method2(), method3()을 차례대로 작성.
        * 2. 작성 후 메소드 호출 확인과 실행 종료 출력 구문을 확인 후 다시 현재 위치로 회귀.
        * 3. 메인 메소드 시작을 확인하기 위한 출력 구문을 작성.
        * */
        System.out.println("main 시작");
        /* 4. method1, 2, 3 을 차례대로 호출 */
        Application2 app2 = new Application2();
        app2.method1();
        app2.method2();
        app2.method3();
        // 위 순서대로 method 출력, 1-2-3 >> 1-3-2로 바꾸면 바뀐대로 출력됨.

        /* 5. 메인 메소드 종료를 확인하는 출력 구문을 작성. */
        System.out.println("main 끝");

        /* 6. main 을 실행하여 전체적인 소스 흐름을 파악하기. */

    }

    public void method1(){

        System.out.println("오늘 수업 시작");
        System.out.println("오늘 수업 종료");


    }

    public void method2(){

        System.out.println("취업특강 시작");
        System.out.println("취업특강 종료");


    }
    public void method3(){

        System.out.println("선생님과 상담하는 날입니다.");

        System.out.println("선생님과 상담이 끝났습니다.");

    }
}
