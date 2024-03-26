package com.ohgiraffers.section01.array;

public class Application1 {

    public static void main(String[] args) {

        /* 수업 목표 : 배열에 대해 이해하고 배열의 사용 목적을 이해할 수 있다. */
        /*
        * 배열이란?
        * >> 동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도).
        * 배열은 heap 영역에 new 연산자를 이용하여 할당한다.
        * */

        /*
        * 배열을 사용하는 이유
        * >> 배열을 사용하지 않는다면 변수를 여러 개 사용해야하는 번거로움이 있음.
        * 1. 연속된 메모리 공간으로 관리할 수 있다.(모든 변수의 이름을 사용자가 관리해야 함)
        * 2. 반복문을 이용한 연속 처리가 불가능하다.
        * */


        int no = 10;
        int no1 = 20;
        int no2 = 30;
        int no3 = 40;
        int no4 = 50;

        int sum = 0;

        sum += no;
        sum += no1;
        sum += no2;
        sum += no3;
        sum += no4;


        System.out.println("sum = " + sum);

        int[] arr = new int[5];
        /* 하나의 이름으로 관리되는 연속된 메모리 공간이고,
        *   공간마다 찾아갈 수 있는 번호(인덱스)를 이용하여 접근.*/
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        /* 값을 대입할 때에도 반복문으로 사용할 수 있다. */
        for(int i = 0, value = 0; i < arr.length; i++){
            arr[i] = value += 10;       //위에 깔아놓은 값이랑 똑같은 표현법.

        }

        /* 배열의 값을 누적해서 담을 변수를 선언. */
        int sum2 = 0;

        /* 일반적인 변수처럼 사용. */
        sum2 += arr[0];
        sum2 += arr[1];
        sum2 += arr[2];
        sum2 += arr[3];
        sum2 += arr[4];

        System.out.println("sum2 = " + sum2);

        int sum3 = 0;

        for(int i = 0; i < arr.length; i++){
            sum3 += arr[i];
        }

        System.out.println("sum3 = " + sum3);







    }
}







