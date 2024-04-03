package com.ohgiraffers.section02.String;

public class Application2 {

    public static void main(String[] args) {

        /* 문자열 객체를 만드는 다양한 방법을 숙지하고
        *   인스턴스가 생성되는 방식을 이해할 수 있다. */

        /* 문자열 객체를 만드는 방법
        * "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다.(singleton 방식)
        * new String("문자열") : 매번 새로운 인스턴스를 생성한다.
        * */

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println("str1 == str2 : " + (str1 == str2));     //true
        System.out.println("str2 == str3 : " + (str2 == str3));     //false
        //>> 새로운 인스턴스를 생성했기 때문에 다른 값으로 간주 및 처리
        System.out.println("str3 == str4 : " + (str3 == str4));     //false
        //>> 3,4 전부 새롭게 정의했기 때문에 얘네도 서로 다른 값으로 간주 및 처리


        /*
        * 동일한 문자열은 동일한 hashCode 를 반환함.
        * */

        System.out.println("str1.hashCode() : " +str1.hashCode());
        System.out.println("str2.hashCode() : " +str2.hashCode());
        System.out.println("str3.hashCode() : " +str3.hashCode());
        System.out.println("str4.hashCode() : " +str4.hashCode());

        str1 += "oracle";

        System.out.println("str1 == str2 : " + (str1 == str2));     //false : 바꿨으니께

        /*
        * equals() : String 클래스의 equals() 메소드는 인스턴스의 비교가 아니라
        *  문자열 값을 비교하여 동일한 값을 가지면 true, 그렇지 않으면 false를 갖도록
        *   Object의 equals() 메소드를 재정의했었다. 따라서 문자열 인스턴스 생성 방식과 무관하게
        *   동일한 문자열을 비교하기 위해서는 == 대신 equals() 메소드를 사용해야 한다.*/

        System.out.println("str2.equals(str3) : " + str2.equals(str3));
        System.out.println("str2.equals(str4) : " + str2.equals(str4));






    }
}
