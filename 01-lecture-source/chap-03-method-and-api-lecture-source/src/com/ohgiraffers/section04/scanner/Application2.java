package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 수업 목표 : Scanner의 nextLine()과 next에 대해 구분하여 사용할 수 있다.
        *
        * nextLine : 공백을 포함한 한 줄 입력을 위한 개행문자 전까지 읽어서 문자열로 반환. (공백문자 포함)
        * next() : 공백 문자나 개행문자 전까지를 읽어서 문자열로 반환.(공백문자 포함 x)
        * */

        /* 1. Scanner 객체 생성 */
        Scanner sc = new Scanner(System.in);

        /* 2. 문자열 입력 */
        /* 2-1. nextLine() */
        System.out.print("인사말을 입력해주세요 : ");
        String greeting1 = sc.nextLine();
        System.out.println(greeting1);
        //ex) 안녕 좋은아침 >> 전부 다 출력됨. >> 공백문자 포함

        /* 2-1. next() */
        System.out.print("인사말을 입력해주세요 : ");
        String greeting2 = sc.next();
        System.out.println(greeting2);
        //ex) 안녕 좋은아침 >> '안녕' 까지만 출력하고 그 뒤 공백부터는 다 짤림.


    }

}
