package com.ohgiraffers.section06.singleton;

public class EagerSingleton {

    private static EagerSingleton eager = new EagerSingleton(); //객체 생성

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){return eager;}

}
