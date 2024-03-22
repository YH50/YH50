package com.ohgiraffers.section01.method;

public class Application6 {

    public static void main(String[] args) {

        /* 메소드 리턴값을 이해하고 활용할 수 있다. */
        /*
        * 메소드 리턴값 테스트
        * 메소드는 항상 마지막에 return 명령어가 존재한다.
        * return : 자신을 호출한 구문으로 복귀하는 것을 의미함.
        * 복귀 시 그냥 복귀할 수도 있지만 값을 가진 채 복귀할 수도 있다.
        * 이때 갖고 가는 값을 리턴값이라고 한다.
        * */

        /*
        * return 값을 반환받기 위해서는 메소드 선언부에 리턴타입을 명시해줘야함.
        * void : 아무 반환값도 가지지 않겠다는 리턴타입에 사용할 수 있는 키워드.
        * 반환값이 없는 경우 return 구문을 생략해도 컴파일러가 자동으로 추가해주지만,
        * 반환값이 있을 때는 그 구문을 반드시 명시해줘야 한다.
        * 또한 메소드 선언부에 선언한 리턴타입 반환값의 자료형은 반드시 일치해야 함.
        * */

        System.out.println("main 메소드 시작함");

        Application6 app6 = new Application6();
        app6.testMethod();

        String returnText = app6.testMethod();
        System.out.println(returnText);
        System.out.println(app6.testMethod());



        System.out.println("main 메소드 종료함");

    }

    public String testMethod(){



        return"hello World";
    }
}
