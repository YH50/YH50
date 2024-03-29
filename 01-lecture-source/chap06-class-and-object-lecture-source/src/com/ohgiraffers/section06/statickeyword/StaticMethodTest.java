package com.ohgiraffers.section06.statickeyword;

public class StaticMethodTest {

    private int count;

    public void nonStaticMethod(){

        this.count++;
        System.out.println("nonStaticMethod 호출함...");
    }

    public static void staticMethod(){

        //this.count++;     >> 이거 왜 안된다고?

        System.out.println("StaticMethod 호출함...");
    }

}
