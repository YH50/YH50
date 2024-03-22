package com.ohgiraffers.section01.method;

public class Calculator {

    public int minNumOf(int x, int y){


        return (x > y)? y : x;      ///non-static
    }

    public static int maxNumOf(int x, int y){


        return (x > y)? x : y;        ///static
    }
}
