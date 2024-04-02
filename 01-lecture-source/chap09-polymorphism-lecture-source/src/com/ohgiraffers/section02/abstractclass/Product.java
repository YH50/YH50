package com.ohgiraffers.section02.abstractclass;

public abstract class Product {

    private int nonStaticField;
    private static int staticField;
    public Product(){}

    public void nonStaticMethod(){

        System.out.println("Product 클래스의 nonStaticMethod 호출함...");
    }
    public static void StaticMethod(){

        System.out.println("Product 클래스의 staticMethod 호출함...");
    }

    public abstract void absMethod();   //미완성 메소드 : 구현부 없음. but 만들수는 있다.

}
