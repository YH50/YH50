package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /* 수업 목표 : 스캐너 사용 시 주의사항에 대해 이해하고
                        사용 시 주의사항을 고려하여 사용할 수 있다. */


        /* 스캐너의 next 메소드들은 입력한 내용을 버퍼로부터 토큰 단위로 분리해서 읽어온다.
        *  >> 크게 두가지 사항을 주의해야 함. */
        /* 1. next()로 문자열 입력을 받은 후 정수, 실수, 논리값을 받을 때
//         * 2. 정수, 실수, 논리값 입력 후 nextLine()으로 문자열을 받을 때
         * */

        /* 1. Scanner 객체 생성 */
        Scanner sc = new Scanner(System.in);

        /* 1. next()로 문자열 입력을 받은 후 정수, 실수, 논리값을 받을 때 */
        System.out.print("문자열을 입력해주세요 : ");
        String str1 = sc.next();
        System.out.println("str1 = " + str1);

        //sc.nextLine();

        System.out.print("숫자를 입력해주세요 : ");
        int no1 = sc.nextInt();
        System.out.println("no1 = " + no1);

        //ex) "안녕하세요 반갑습니다" 입력 시 오류 발생
                // >> 위에 sc.nextLine()으로 " 반갑습니다" 처리 후 다음 단계 실행하게 해줌

        /* 2. 정수, 실수, 논리값 입력 후 nextLine()으로 문자열을 받을 때 */

        System.out.print("다시 숫자를 입력해주세요 : ");
        int no2 = sc.nextInt();
        System.out.println("no2 = " + no2);

        System.out.print("공백이 있는 문자열을 하나 입력하세요 : ");

        sc.nextLine();      //위에 next() 쓸때나 nextLine() 쓸때나 써줘야 함.
        // 한 줄 비워주는게 중요함.

        String str2 = sc.nextLine();
        System.out.println("str2 = " + str2);


    }
}
