package com.ohgiraffers.section01.init;

public class Car {

    private String modelName;
    private int maxSpeed;

    public Car(String modelName, int maxSpeed) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    public void driverMaxSpeed(){

        System.out.println(modelName + "이(가) 최고 시속 " + maxSpeed + "km/h를 기록했습니다.");
    }   //이상 메소드 하나 만들었음
}
