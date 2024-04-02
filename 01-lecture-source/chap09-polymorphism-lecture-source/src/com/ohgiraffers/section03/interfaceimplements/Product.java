package com.ohgiraffers.section03.interfaceimplements;

public class Product extends Object implements InterProduct, java.io.Serializable {

    /*
    * 클래스에서 인터페이스를 상속받을 때에는 implement 키워드를 사용한다.
    * 또한 인터페이스는 여러 개를 상속받을 수 있으며,
    * extends 로 다른 클래스를 상속 받는 경우에도 이와 별개로 인터페이스 추가 상속 가능해짐.
    * 단 extends 키워드를 앞에 쓰고 implement를 뒤에 작성한다. (순서 바뀌면 에러 발생)
    * */

    @Override
    public void nonStaticMethod() {
        System.out.println("InterProdcut의 nonStaticMethod 오버라이딩한 메소드 호출됨...");
    }

    @Override
    public void absMethod() {
        System.out.println("InterProduct의 absMethod 오버라이딩한 메소드 호출됨");

    }

    @Override
    public void defaultMethod() {
        InterProduct.super.defaultMethod();

        /* 디폴트 메소드는 인터페이스에서만 작성 가능
        *
        * @Override
        * public default void defaultMethod(){}
        * */

            System.out.println("Product의 defaultMethod 호출됨...");
        }


    }
