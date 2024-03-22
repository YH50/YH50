package com.ohgiraffers.section02.package_and_import;

public class Application1 {

    public static void main(String[] args) {

        /* 수업 목표 : 패키지에 대해 이해할 수 있다.
        * 패키지란?
        *  > 서로 관련된 클래스 or 인터페이스 등을 모아 하나의 묶음(그룹)으로 단위를 구성하는 것.
        *  > 같은 패키지 내에서는 동일한 이름의 클래스를 만들 수 있지만
        *     패키지가 다르면 동일한 이름을 가진 클래스를 만들 수 없다.
        *  클래스명은 원래 패키지명이 포함돼있기 때문.
        *   ex) package com.ohgiraffers.section01.method.Calculator (요게 클래스 이름임)//
        *  따라서 서로 다른 패키지의 클래스를 사용하는 경우 클래스명 앞에
        *           패키지명을 명시하여 풀 클래스 이름으로 사용해야 한다.
        *
        * */
        /* 1. non-static method 일때*/
        com.ohgiraffers.section01.method.Calculator cal = new com.ohgiraffers.section01.method.Calculator();
        int min = cal.minNumOf(44, 79);

        System.out.println("44와 79의 최솟값은? : " + min);

        /* 2. static method 일때*/

        int max = com.ohgiraffers.section01.method.Calculator.maxNumOf(44, 79);
        // 저 기다란게 전부 클래스명이다 이말이야

        System.out.println("44와 79의 최댓값은? : " + max);

    }
}
