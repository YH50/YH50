package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application2 {

    public static void main(String[] args) {

        /* 와일드 카드에 대해 이해할 수 있다. */
        /*
        * 와일드카드(WildCard)
        * 제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때
        * 그 객체의 타입 변수를 제한할 수 있다.
        *
        * <?> : 제한 없음
        * <? extends Type> : 와일드카드의 상한 제한 (Type과 Type의 [후손]을 이용하여 생성한
        *                       인스턴스로만 인자로 사용이 가능함)
        * <? super Type> : 와일드카드의 하한 제한(Type과 Type의 [부모]를 이용하여 생성한
        *                       인스턴스로만 인자로 사용이 가능함)
        * */

        WildCardFarm wildCardFarm = new WildCardFarm();
//        wildCardFarm.anyType(new RabbitFarm<Mammal)(new Rabbit()))
        wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        System.out.println("===========================================");
//        wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
        // >> Bunny의 윗등급인 Rabbit은 사용 못함 (extends 썼으니까)

        wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        System.out.println("===========================================");

        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//        wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
            // >> Bunny의 아랫등급인 DrunkenBunny 사용 불가 (super 썼으니까)





    }
}
