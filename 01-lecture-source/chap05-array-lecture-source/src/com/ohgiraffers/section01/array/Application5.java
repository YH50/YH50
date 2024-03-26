package com.ohgiraffers.section01.array;

public class Application5 {

    public static void main(String[] args) {

        /* 수업 목표 : 배열을 사용하는 예시를 이해하고 적용할 수 있다.*/
        /* 임의의 카드를 한 장 뽑아서 출력하기*/

        String[] cardNumbers = {"2", "4", "7", "10", "ACE", "KING", "JACK", "6", "8", "9", "QUEEN", "5"};
        int randomNo = (int)(Math.random()*cardNumbers.length);
        System.out.println(cardNumbers[randomNo]);

    }
}
