package com.ohgiraffers.section07.kindsofvariable;

public class KindsOfVariable {  //클래스 영역의 시작

    /* 수업 목표 : 다양한 변수들을 이해하고 사용할 수 있다. */

    /*
    * 클래스 영역에 작성하는 변수 >> "필드"(or 속성)
    * 필드 == 멤버 변수 (클래스가 가지는 멤버라는 뜻)
    *     == 전역 변수 (클래스 전역에 사용할 수 있는 변수라는 뜻)
    * */

    /*
    * non-static field >> "인스턴스 변수"(인스턴스 생성 시점에서 사용 가능한 변수라는 뜻)
    * */
    private int globalNo;   //private >> 캡슐화 목적

    /* static field >> 정적 필드(클래스 변수)
    * >> 정적(클래스) 영역에 생성되는 변수라는 뜻
    * */
    private static int staticNum;

    public void testMethod(int num){        //매개변수 있는 메소드
        /*
        * 메소드 영역에서 작성하는 변수 -> 지역 변수
        * 메소드 괄호 안에 선언하는 변수 -> 매개 변수
        * 매개변수도 일종의 지역변수로 생각하면 됨.
        * 지역변수, 매개변수 모두 메소드 호출 시 stack을 할당받아 stack에 생성된다.
        * */

        int localNum;

        System.out.println("num = " + num);
        //매개변수는 호출 시 값이 넘어와서 변경되기 때문에 초기화를 해주지 않아도 된다.

        /* 지역 변수는 선언 외에 사용(호출)하기 위해서는 반드시 초기화가 되어야 한다.*/
        //System.out.println("localNum = " + localNum);
        System.out.println("globalNo = " + globalNo);
        //전역 변수는 클래스 전역에서 사용 가능
        System.out.println("staticNum = " + staticNum);
    }

    public void testMethod2(){          //매개변수 x, 반환값 x >>non-static
        /*
        System.out.println("localNum = " + localNum);
        >> 지역 변수는 해당 지역(블럭) 내에서만 사용 가능!!
        */
        System.out.println("globalNo = " + globalNo);
        System.out.println("staticNum = " + staticNum);
        //전역변수는 다른 메소드에서도 사용할 수 있다.

    }

}
