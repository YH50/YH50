package com.ohgiraffers.section01.extend;

public class RacingCar extends Car{

    public RacingCar(){
        System.out.println("RacingCar 클래스 기본 생성자 호출됨...");
    }

    @Override
    public void run() {
//        super.run();        >> 부모 클래스에서 가져온거임
        System.out.println("레이싱카가 빠르게 달립니다");

    }

    @Override
    public void soundHorn() {
//        super.soundHorn();    >> 부모 클래스에서 가져온거
        System.out.println("레이싱카는 경적 따위 울리지 않습니다.");
    }

    @Override
    public void stop() {
//        super.stop();
        System.out.println("레이싱카가 멈춥니다.");
    }
}
