package com.ohgiraffers.section03.constant;

public class Application2 {

    public static void main(String[] args){

        /* 수업 목표 : 상수의 명명 규칙에 대해 이해할 수 있다. */
        /* 상수의 명명 규칙 >> 변수의 명명 규칙과 컴파일에러 유발 규칙은 동일
         * 단, 개발자들 간의 불문율에 대해 일부 차이가 존재
         * 1. 모든 문자들은 영문 대문자 or 숫자만 사용한다.
         * 2. 단어 간의 연결 사이에는 언더스코어(_) 사용
         * */

        /* 1. 모든 문자는 영문 대문자, or 숫자만 사용 */
        final int AGE1 = 15;
        final int AGE2 = 25;
        final int AGE3 = 31;        //소문자 써도 된다, 다만 변수와 구분하기 힘들어지기 때문.

        /* 2. 단어 간의 연결은 언더스코어 (_) 사용 */
        final int MAX_AGE = 99;
        final int MIN_AGE = 0;
        final int minAge = 0;       //camel case 사용 가능, but 변수와 구분하기 힘들어지기 때문에 대문자 on


    }
}
