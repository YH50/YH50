package com.ohgiraffers.section01.method;

public class Application7 {

    public static void main(String[] args) {


        /* 수업 목표 : 매개변수와 리턴값을 복합적으로 활용하는 것을 이해하고 활용할 수 있다. */
        /*
        * 매개변수와 리턴값 복합 활용
        * 매개변수도 존재하고 리턴값도 존재하는 메소드를 이용하여 간단한 계산기 만들기.
        *
        *
        * */

        int x = 33;
        int y = 11;
        Application7 app7 = new Application7();
        System.out.println("두 수를 더한 결과 : " + app7.plusTwoNum(x, y));
        System.out.println("두 수를 뺀 결과 : " + app7.minusTwoNum(x, y));
        System.out.println("두 수를 곱한 결과 : " + app7.multipleTwoNum(x, y));
        System.out.println("두 수를 나눈 결과 : " + app7.divideTwoNum(x, y));

    }

    public int plusTwoNum(int x, int y){

       return x + y;
    }

    public int minusTwoNum(int x, int y){

        return x - y;
    }

    public int multipleTwoNum(int x, int y){

        return x * y;
    }


    public int divideTwoNum(int x, int y){

        return x / y;
    }
}
