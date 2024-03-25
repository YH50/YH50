package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor {

    public void printGugudanFromTwoToNine1(){

        /* 수업 목표 : 중첩된 for 문의 흐름을 이해하고 적용할 수 있다. */
        /* for문 안에 for 문을 이용할 수 있다. */

        for(int dan = 2; dan < 10; dan++){

            for(int su = 1; su < 10; su++){

                System.out.println( dan + " * " + su + " = " + (dan*su));

            }
            System.out.println();
        }

    }

    public void printGugudanFromTwoToNine2(){
        for(int dan = 2; dan < 10; dan++) {

            /* 설명. 한 단씩 구구단을 출력하는 메소드를 호출하며 "인자로 단을 전달"한다. */
            printGugudanOf(dan);
            /* 설명. 한 단을 출력하고 한 줄을 띄운다. */
            System.out.println();
        }

    }

    public void printGugudanOf(int dan) {

        /* 설명. "매개변수로 전달받은 단"을 1 ~ 10까지 곱한 내용을 출력해준다. */
        for(int su = 1; su < 10; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
    }

    public void printStarInputRowTimes(){

        /* 키보드로 정수 하나를 입력받아 해당 정수만큼 한 행에 '*'를 5개씩 출력하기. */

        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 행 수를 입력하세요 : ");
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++){

 /*           for(int a = 1; a < 6; a++){
                System.out.print("*");
            }*/

        }


    }
    public void printStar(int times){

        for (int i = 1; i <= times; i++){
            System.out.print("*");
        }

    }

    public void printTriangleStars(){
     /*
     * ex) 정수를 입력 : 5
     *              *
     *              **
     *              ***
     *              ****
     *              *****
     *
     * */
        System.out.println("출력할 줄 수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++){

            printStar(i);
            System.out.println();
        }
    }




}

