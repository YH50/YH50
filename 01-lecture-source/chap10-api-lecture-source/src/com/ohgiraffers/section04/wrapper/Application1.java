package com.ohgiraffers.section04.wrapper;

public class Application1 {

    public static void main(String[] args) {
        /* Wrapper 클래스에 대해 이해할 수 있다. */
        /*
        * 상황에 따라 기본 타입의 데이터를 인스턴스화 해야하는 경우가 있을때
        * 기본 타입의 데이터를 먼저 인스턴스로 변환 후 사용해야 하는데,
        * 이 떄 8가지에 해당하는 기본 타입의 데이터를 인스턴스화 할 수 있도록 하는 클래스를
        *   << Wrapper >> 클래스 라고 한다. (Wrap : 감싼다)
        *
        * */

        /*
        *
        *   기본 타입         //         래퍼 클래스
        *    byte                       Byte
        *    short                      Short
        *    int                        Integer
        *    long                       Long
        *    float                      Float
        *    double                     Double
        *    char                       Character
        *    boolean                    Boolean
        *
        */

        /* 박싱 (Boxing) 과 언박싱 (Unboxing)
        *
        * 박싱 : 기본 타입을 레퍼런스의 인스턴스로 인스턴스화 하는 것
        * 언박싱 : 래퍼 클래스 타입의 인스턴스를 기본 타입으로 변경하는 것
        * */

        int intValue = 20;
        Integer boxingNo1 = new Integer(intValue);      //인스턴스화 - 박싱 >> 생성자 이용
        Integer boxingNo2 = Integer.valueOf(intValue);  //static 메소드 이용

        int unBoxingNo1 = boxingNo1.intValue();     // 언박싱 : intValue() 메소드 이용

        /*
        * 오토 박싱 (autoBoxing) & 오토 언박싱 (autoUnBoxing)
        * JDK 1.5 부터 박싱과 언박싱이 필요한 상황에서 자바 컴파일러가
        * 이를 자동으로 처리해주기 시작함 >> 이런 자동화된 과정을 오토 (언)박싱이라고 한다.
        */

        Integer boxingNo3 = intValue;       //오토박싱

        int unBoxingNo3 = boxingNo3;       //오토 언박싱

        int ino = 20;
        Integer integerNo1 = new Integer(20);
        Integer integerNo2 = new Integer(20);
        Integer integerNo3 = 20;
        Integer integerNo4 = 20;

        System.out.println("int와 Integer 비교 : "+ (ino == integerNo1));   //true
        System.out.println("int와 Integer 비교 : "+ (ino == integerNo3));   //true

        System.out.println("Integer와 Integer 비교 : "+ (integerNo1 == integerNo2));   //true
        System.out.println("Integer와 Integer 비교 : "+ (integerNo1 == integerNo3));   //true
        System.out.println("Integer와 Integer 비교 : "+ (integerNo2 == integerNo3));   //true

        System.out.println("equals() = " + (integerNo1.equals(integerNo2)));
        System.out.println("equals() = " + (integerNo1.equals(integerNo3)));
        System.out.println("equals() = " + (integerNo3.equals(integerNo4)));

        System.out.println("valueOf() : " + (Integer.valueOf(123) == Integer.valueOf(123)));

    }
}
