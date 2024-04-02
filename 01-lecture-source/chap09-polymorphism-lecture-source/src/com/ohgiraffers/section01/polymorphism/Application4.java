package com.ohgiraffers.section01.polymorphism;

public class Application4 {

    public static void main(String[] args) {
        /* 다형성을 적용하여 리턴 타입을 활용할 수 있다. */

        /* 1. getRandomAnimal() 으로 동물 인스턴스 받기 */
        Application4 app4 = new Application4();

        Animal randomAnimal = app4.getRandomAnimal();
        randomAnimal.cry();
    }

    public Animal getRandomAnimal(){
        int random =  (int)(Math.random() * 2);

        return random == 0? new Rabbit() : new Tiger();
    }
}
