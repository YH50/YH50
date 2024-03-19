package com.ohgiraffers.section01.literal;

public class Application1 {

    public static void main(String[] args){

        /*
        * 1. 오늘 할일 특이사항 없음
        * 2. 롯데 언제 우승함
        * 3. 집가고 싶다
        * 4. 야구하고 싶다
        *
        * 슬래시 사이에 **넣으면 여러줄 주석처리 가능
        *
        *
        * >>단축키 - 컨트롤+시프트+슬래시
        * */

        /*수업목표 : 여러가지의 값의 형태를 출력할 수 있다.*/

        /*1. 숫자 형태의 값*/
        /*1-1. 정수 형태*/
        //일반적인 숫자 값
        System.out.println(5050);
        /*1-2. 실수 형태*/
        //소수점 포함하는 숫자 값
        System.out.println(5.05);

        /*2. 문자 형태의 값 출력*/
        System.out.println('A');
        //문자 형태의 값 : 홀따옴표(single quotation)으로 묶기
        /*System.out.println('Ace');
        *2개 이상의 문자 : 문자로 취급 x >> error.
        *System.out.println('');
        *blank - Also error
         */
        System.out.println('5');
        //출력은 되나 숫자가 아닌 문자로 판단.
        System.out.println('슝');
        //한글은 한 음절 글씨 가능


        /*3. 문자열 형태의 값 출력*/
        System.out.println("Ace");
        //문자열(여러개 문자 나열) 형태 : 쌍따옴표(double quotation)으로 묶기
        System.out.println("5050");
        //위와 유사하게 출력은 되나 숫자가 아닌 문자열로 취급.
        System.out.println("");
        //쌍따옴표 공백도 문자열로 취급해서 오류 없이 출력 진행.
        System.out.println("A");
        //하나의 문자도 쌍따옴표로 문자열 취급, 문자 <-> 문자열.

        /*4. 논리 형태의 값 출력*/
        //참 or 거짓 형태
        System.out.println(true); //뱀은 파충류인가 > 참
        System.out.println(false); //작년 롯데는 우승을 했는가 > 거짓
        //출력된 true,false 값 > "논리형"
    }
}
