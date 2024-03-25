package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {


    public static void main(String[] args) {

    /* 수업 목표 : java.util.scanner 를 이용한 다양한 자료형 값 입력 받기 */

    /*
    * 1. Scanner 객체 선언
    * 1-1. 원래 밑에처럼 scanner 객체를 만들어야 함
    * */
    //java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
    // 존나 길죠? 딱 봐도 쓰기 싫게 생겼죠?              >> 이건 빼도 됨.

        /*1-2. 다른 클래스에 클래스를 사용할 시 패키지명을 생략하기 위해 사용하는 구문을 사용
        * >> import */

        Scanner sc1 = new Scanner(System.in);

        /* 2. 자료형 값 입력 받기 */

        /* 2-1. 문자열 입력받기 */
        /* nextLine() : 입력 받은 값을 문자열로 반환시켜줌 */
        System.out.print("이름을 입력하세요 : ");
        String name = sc1.nextLine();
        System.out.println("입력하신 이름은 " + name + "입니다.");


        /* 2-2. 정수값 입력 */
        /* nextInt() : 입력받은 값을 int 형태로 변환한다. */

        System.out.print("숫자를 입력하세요 : ");
        int age = sc1.nextInt();
        System.out.println("입력하신 정수는 "+ age + "입니다.");


        /* 2-3. 실수값 입력 */
        /* nextDouble() : 입력 받은 값을 double 형태로 변환한다. */

        System.out.print("원하는 실수를 입력해주세요 : ");
        double num = sc1.nextDouble();
        System.out.println("입력하신 실수는 " +num+ "입니다.");

        /* 2-4. 논리형 값 입력 받기 */
        /* nextBoolean() : 입력받은 값을 boolean 으로  변환한다. */
        System.out.print("참과 거짓의 한가지를 true or false로 입력해주세요");
        boolean isTrue = sc1.nextBoolean();
        System.out.println("입력하신 논리값은 "+isTrue+ "입니다.");
    }
}
