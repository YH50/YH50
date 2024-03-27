package com.ohgiraffers.section03.copy;

public class Application2 {

    public static void main(String[] args) {

        /* 얕은 복사를 활용하여 매개변수와 리턴값으로 활용할 수 있다. */
        //메소드 활용

        /*
        * 얕은 복사의 활용
        * >> 주로 메소드를 호출할 때 인자로 사용하는 경우
        * >> 리턴값으로 동일한 배열을 리턴해주고 싶을 때 사용하는 경우
        *
        * */

        String[] name = {"김민석", "윤동희", "전미르"};

        System.out.println("name.hashCode() = " + name.hashCode());


        /* 1. 인자와 매개변수로 활용 */
        print(name);
        
        /* 2. 리턴값을 활용 */
        String[] animals = getAnimals();

        System.out.println("리턴 받은 animals.hashCode() = " + animals.hashCode());

        print(animals);

    }

    public static void print(String[] sarr){

        System.out.println("sarr.hashCode() = " + sarr.hashCode());
        for(int i = 0; i < sarr.length; i++){
            System.out.print(sarr[i] + " ");
        }
        System.out.println();
    }

    public static String[] getAnimals(){

        String[] animals = new String[] {"뱀", "고라니", "다람쥐"};

        System.out.println("새로 만든  animals의 hashcode : " + animals.hashCode());

        return animals;
    }
}
