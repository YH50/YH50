package com.ohgiraffers.section05.logical;

public class Application2 {

    public static void main(String[] args) {

        /* 수업 목표 : 논리 연산자의 우선순위에 대해 이해하고 이를 활용할 수 있다.*/
        /* 논리 연산자의 우선순위와 활용
        * 논리 and 연산자와 논리 or 연산자의 우선순위
        * && : 11순위
        * || : 12순위
        * 논리 and 연산자가 논리 or 연산자보다 우선.
        * */

        /* 1. 1부터 100 사이의 값인지 확인 */
        //1 <= x <= 100 >>> 안됩니다~
        // "x >= 1 && x <= 100" 으로 작성해야함.
        int num1 = 55;
        System.out.println("1부터 100 사이인지 확인 : "+ (num1 >= 1 && num1 <= 100));
        int num2 = 186;
        System.out.println("1부터 100 사이인지 확인 : "+ (num2 >= 1 && num2 <= 100));

        /* 2. 영어의 대문자인지 확인 */
        /* 영어 대문자임? ---> 문자 변수 >= 'A' && 문자 변수 <= 'Z' */
        char ch = 'G';
        System.out.println(" 영어의 대문자인지 확인 : " + (ch >= 'A' && ch <= 'Z'));
        char ch0 = 'g';
        System.out.println(" 영어의 대문자인지 확인 : " + (ch0 >= 'A' && ch0 <= 'Z'));

        /* 3. 대소문자 상관 없이 영문자 y 인지 확인 */
        /* 문자 변수 == 'y' || 문자 변수 == 'Y' */
        char ch1 = 'y';
        System.out.println(" 영문자 y인지 확인 : " + (ch1 == 'y' || ch1 == 'Y'));
        char ch2 = 'Y';
        System.out.println(" 영문자 Y인지 확인 : " + (ch2 == 'y' || ch2 == 'Y'));
        // 둘 중 하나라도 맞으면 true 이기 때문에 둘 다 true 로 나옴.

        /* 4. 영문자인지 확인 */
        /* A = 65, Z = 90, a = 97, z = 122 >>> ASCII 코드 변환값 (중간 91~96은 영문자 x) */
        char ch3 = 't';
        char ch4 = 'ㅁ';
        System.out.println(" 영문자인지 확인 : " + ((ch3 >= 'A'&& ch3 <='Z')||(ch3 >= 'a' && ch3 <= 'z')));
        System.out.println(" 영문자인지 확인 : " + ((ch3 >= 65 && ch3 <= 90)||(ch3 >= 97 && ch3 <= 122)));

        System.out.println(" 영문자인지 확인 : " + ((ch4 >= 'A'&& ch4 <='Z')||(ch4 >= 'a' && ch4 <= 'z')));



    }
}