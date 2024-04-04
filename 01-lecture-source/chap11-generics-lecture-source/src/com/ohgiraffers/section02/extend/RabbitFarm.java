package com.ohgiraffers.section02.extend;

//public class RabbitFarm<T implements Animal>{   >> error
// (인터페이스는 implement가 안된다)

//public class RabbitFarm<T extends Animal> {      >> 이건 됨

//public class RabbitFarm<T extends Rabbit> {

//public class RabbitFarm<T extends Rabbit & Animal> {
                    //반드시 클래스 앞, 인터페이스 뒤! 위치 유의할 것
                        //(Animal & Rabbit 하면 오류 발생)
                    //클래스 & 클래스 도 안됨 (but 클래스, 클래스 는 되긴 함)


public class RabbitFarm<T extends Rabbit> {

    private T animal;

    public RabbitFarm(){}

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
