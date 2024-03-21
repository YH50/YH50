package com.ohgiraffers.section03.increment;

public class Application1 {

    public static void main(String[] args) {

        /* 증감 연산자에 대해 이해하고 활용할 수 있다. */
        /* 증감 연산자
        *  피연산자의 앞, 또는 뒤에서 사용이 가능함.;
        * '++': 1 증가한다는 뜻
        * '--' : 1 감소한다는 뜻
        * */
        /* 1. 증감연산자를 단독으로 사용 */
        /* 단항으로 사용될 경우 1+, 1- 의 의미를 갖음.*/
        int no = 32;
        System.out.println("num  : " + no);

        no++;   //1이 증가
        System.out.println("num  : " + no);
        ++no;   //위와 동일
        System.out.println("num  : " + no);
        no--;   //1이 감소
        System.out.println("num  : " + no);

        /*증감 연산자를 다른 연산자와 사용
        *
        * 주의 사항 : 증감 연산자는 다른 연산자와 함께 사용할 때 의미가 달라짐.
//        * 다른 연산자와 함께 사용할 때 증감 연산자의 의미
        * num++ : "다른 연산 먼저 진행 후" 마지막 피연산자의 값을 1 증가시킴
        * ++num : "피연산자의 값을 먼저" 1 증가시킨 후 다른 연산 진행
        * */
        int first = 20;
        int result = first++ * 3;

        System.out.println("result : " + result);
        System.out.println("firstNum : " + first);

        int second = 20;
        int result1 = ++second * 3;

        System.out.println("result : " + result1);
        System.out.println("second : " + second);

        int num1 = 10;
        int result2 = --num1 * 3;

        System.out.println("result2 : " + result2);
        System.out.println("num1 : " + num1);

        int num2 = 10;
        int result3 = num2-- * 3;

        System.out.println("result2 : " + result3);
        System.out.println("num2 : " + num2);





    }
}
