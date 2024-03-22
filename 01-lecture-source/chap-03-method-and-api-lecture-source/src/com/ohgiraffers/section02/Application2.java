package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;

import static com.ohgiraffers.section01.method.Calculator.maxNumOf;


public class Application2 {

    public static void main(String[] args) {

        /* 수업 목표 : import 에 대해 이해할 수 있다. */

        /* import 란?
        * 서로 다른 패키지에 존재하는 클래스를 사용하는 경우
        *       패키지명을 포함한 풀 클래스 이름을 사용해야 한다.
        * BUT 매번 다른 클래스의 패키지명까지 쓰기에는 번거롭다.
        * 그래서 패키지명을 생략하고 사용할 수 있도록 하는 방법이 import 문이다.
        * import 는 package 선언문과 class 선언문 사이에 작성하며
        * 어떤 패키지 내에 클래스를 사용할 것인지 선언하는 효과를 가진다.
        * */

        Calculator cal = new Calculator();

        /* 1. non-static method */

        int min = cal.minNumOf(30, 50);
        System.out.println("30과 50 중 더 작은 값은? : " + min);

        /* 2. static method */

        int max = maxNumOf(30, 50);
        System.out.println("30과 50 중 더 큰 값은? : " + max);

        /* 3. static method 호출 시 클래스명 생략하고 작성하는 법 */

        int max2 = maxNumOf(30, 50);        //static import 메소드 수동으로 추가
        System.out.println("30과 50 중 더 큰 값은? : " + max2);


    }
}
