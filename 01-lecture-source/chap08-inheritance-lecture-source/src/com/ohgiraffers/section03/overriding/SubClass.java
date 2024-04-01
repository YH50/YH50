package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass {

    /* 1. 메소드의 이름을 변경하면 에러 발생함.*/

 /*   @Override
    public void method3(int num) {
//        super.method(num);    >> 없어도 문제 안됨.
    }*/


    /*2. 메소드의 리턴 타입을 변경하면 에러 발생함.*/
/*    @Override
    public int method(int num) {
        return 0;
    }*/


    /* 3. 매개변수의 개수, 타입이 변경됐을 경우 에러 발생함.*/
 /*   @Override
    public void method(String num) {
    }*/


    /* 4. 메소드 이름, 리턴 타입, 매개변수의 개수, 타입, 순서가 일치할 경우 오버라이딩 성립*/
/*    @Override
    public void privateMethod(int num) {}*/



    /* 5. private 메소드는 오버라이딩 불가능*/

/*    @Override
    public void privateMethod() {}*/


    /* 6. final 메소드는 오버라이딩 불가능.*/

/*    @Override
    public final void finalMethod(){}*/



//    void protectedMethod(){}  >> 좁은 범위라 불가능

    @Override
    protected void protectedMethod() {}     //더 넓은 범위로도 가능함.

    /*참고*/
        /* 클래스에도 final 키워드 추가 가능 , but 이것은 상속을 제한하는 키워드임.
        *                                   >>> 클래스의 확장 불가능*/
    }
