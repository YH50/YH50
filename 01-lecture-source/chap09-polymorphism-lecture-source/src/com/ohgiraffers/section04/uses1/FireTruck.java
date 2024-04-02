package com.ohgiraffers.section04.uses1;

public class FireTruck extends Car{
    @Override
    public void go() {
        System.out.println("소방차가 지나갑니다 비키세요");
    }

    @Override
    public void stop() {
        System.out.println("소방차가 멈춥니다 비키세요");
    }
}
