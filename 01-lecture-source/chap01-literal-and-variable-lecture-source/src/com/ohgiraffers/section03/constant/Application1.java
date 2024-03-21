package com.ohgiraffers.section03.constant;

public class Application1 {

    public static void main(String[] args){

        /* 수업 목표 : 상수에 대해 이해하고 사용할 수 있다. */
        /* 상수란?
            * 변수가 메모리에 변경될 값을 저장하기 위한 공간으로 나타내는 반면,
                상수는 이와 상반되는 개념.
            * >> 항상 고정된 값을 저장해두기 위한 메모리 상의 공간
            *
            * 상수의 사용 목적
            * >> 변경되지 않는 값을 저장하기 위한 목적으로 사용
            * 초기화 이후 값을 대입할 시 컴파일 에러를 발생시켜 값이 수정되지 못하도록 함
            * ex) 수학 공식에 사용되는 수치 등등
            *
            * 사용 방법
            * 1. 상수 선언하기 >> 변수 선언같이 유사한 과정이나 final 키워드를 사용한다
            * 2. 값을 초기화하기 >> 한 번 초기화하게 되면 변경 불가능
            * 3. 필요한 위치에 상수를 호출해서 사용하기
            * */

        /* 1. 상수 선언하기 */
        //상수를 선언할 때 final 키워드를 붙인다.
        final int age;

        /* 2. 초기화 */
        age = 28;       //상수는 대문자로 해야 "국룰"이다.
        //age = 20; 이미 28로 초기화했기 때문에 값을 재대입하는 건 불가능

        /* 3. 필요한 위치에 상수를 호출하여 사용하기 */
        /* 3-1. 출력 구문에서 사용 (System.out.println(); */
        System.out.println("age의 값 : " + age );
        /* 3-2. 필요 시 연산식에 호출하여 사용하기 */
        System.out.println("age의 2배 : " + (age * 2));

        /* 3-3. 대입 연산 시 활용하기 */
        int sum = age;          //대입연산자(등호)의 우측에는 기술 가능함
        //age = age + 10;            //대입연산자의 좌측에는 기술 불가
    }
}
