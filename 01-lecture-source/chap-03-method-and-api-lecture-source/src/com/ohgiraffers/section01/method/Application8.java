package com.ohgiraffers.section01.method;

public class Application8 {

    public static void main(String[] args) {

        /* 수업 목표 : static method 를 호출할 수 있다. */

        /*
        * static 메소드를 호출하는 방법
        * 클래스명, 메소드명(); >>> 안 만들어도 된다 이말이야
        * */

        System.out.println("33과 11의 합 : " + Application8.sumTwoNum(33,11));

        /* ""동일한 클래스"" 내에 작성된 static 메소드는 클래스명 생략이 가능하다. */

        System.out.println("33과 11의 합 : " + sumTwoNum(33, 11));

    }


    public static int sumTwoNum(int x, int y){


        return x + y;
    }
}
