package com.ohgiraffers.section04.uses1;

public class F1Machine extends Car implements Soundable{
    @Override
    public void go() {
        System.out.println("F1 머신이 지나갑니다 빨리 비키세요");
    }

    @Override
    public void stop() {
        System.out.println("F1 머신이 멈춥니다 나오세요");
    }

    @Override
    public void horn() {
    System.out.println("빠아아아ㅏㅇ아아ㅏㅏ아아아앙");
    }
}
