package com.ohgiraffers.section01.polymorphism;

public class Tiger extends Animal{

    @Override
    public void eat() {
        System.out.println("호랑이는 고기를 뜯어먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("호랑이는 잘 달리지 않고 걸어다닙니다.");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 어흥 울부짖습니다.");
    }
    public void bite(){
        System.out.println("호랑이가 물어뜯습니다 촉촉챡챡");
    }


}
