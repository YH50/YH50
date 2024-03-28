package com.ohgiraffers.section03.abstraction;

public class CarRacer {     //차를 운전하는 객체 >> 컨트롤러

    private Car car = new Car();

    public void startUp(){car.startUp();}       //차보고 시동걸으라고 함

    public void stepAccel(){car.go();}      //차보고 가라고 함

    public void stepBreak(){car.stop();}        //차보고 멈추라 함

    public void turnOff(){car.off();}       //차보고 시동 끄라고 함
}
