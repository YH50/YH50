package com.ohgiraffers.section04.comparison;

public class Application1 {

    public static void main(String[] args) {
        /* 비교 연산자에 대해 이해하고 활용할 수 있다.
        * 비교연산자 : 피연산자 사이에 상대적인 크기를 판단하여
                      참 혹은 거짓을 반환하는 연산자
        * 연산자 중 참 혹은 거짓을 반환하는 연산자는 삼항연산자의 조건식이나
                    조건문의 조건절에 많이 사용됨. >> 연습 많이 해야함!!!!
        * */

        /*
        * 비교연산자의 종류
        * '==' : 왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 true, 다르면 false 반환
        * '!=' : 왼쪽의 피연산자와 오른쪽의 피연산자가 다르면 true, 같으면 false 반환
        * '>' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크면 true, 아니면 false 반환
        * '>=' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크거나 같으면 true, 아니면 false 반환
        * '<' : 왼쪽의 피연산자가 오른쪽 피연산자보다 작으면 true, 아니면 false
        * '<=' : 왼쪽 피연산자가 오른쪽 피연산자보다 작거나 같으면 true, 아니면 false
        * */

        /* 1. 숫자값 비교 */
        /* 1-1. 정수 비교 */
        int inum1 = 10;
        int inum2 = 20;

        System.out.println("========== 정수 값 비교 ==========");
        System.out.println("inum1과 inum2가 같은지 비교 : " + (inum1 == inum2));
        System.out.println("inum1과 inum2가 다른지 비교 : " + (inum1 != inum2));
        System.out.println("inum1이 inum2보다 큰지 비교 : " + (inum1 > inum2));
        System.out.println("inum1이 inum2보다 작은지 비교 : " + (inum1 < inum2));
        //작거나 같은거는 굳이 안쓰겠음. <=, >= 순서만 생각하기

        double dnum1 = 10.0;
        double dnum2 = 20.0;

        System.out.println("========== 실수 값 비교 ==========");
        System.out.println("dnum1과 dnum2가 같은지 비교 : " + (dnum1 == dnum2));
        System.out.println("dnum1과 dnum2가 다른지 비교 : " + (dnum1 != dnum2));
        System.out.println("dnum1이 dnum2보다 큰지 비교 : " + (dnum1 > dnum2));
        System.out.println("dnum1이 dnum2보다 작은지 비교 : " + (dnum1 < dnum2));
        System.out.println("dnum1이 dnum2보다 크거나 같은지 비교 : " + (dnum1 >= dnum2));
        System.out.println("dnum1이 dnum2보다 작거나 같은지 비교 : " + (dnum1 <= dnum2));

        /* 2. 문자값 비교 */

        char ch1 = 'a';
        char ch2 = 'A';

        System.out.println("========== 문자 값 비교 ==========");
        System.out.println("a와 A가 같은지 비교 : " + (ch1 == ch2));
        System.out.println("a와 A가 다른지 비교 : " + (ch1 != ch2));
        System.out.println("a가 A보다 큰지 비교 : " + (ch1 > ch2));
        System.out.println("a가 A보다 작은지 비교 : " + (ch1 < ch2));
        System.out.println("a가 A보다 크거나 같은지 비교 : " + (ch1 >= ch2));
        System.out.println("a가 A보다 작거나 같은지 비교 : " + (ch1 <= ch2));

        /* 3. 논리값 비교 */
        /* ==과 !=의 비교는 가능하나 대소 비교는 전부 불가능. */
        //참과 거짓의 크기 비교<--- 안됩니다~
        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println("========== 논리값 비교 ==========");
        System.out.println("bo1과 bo2가 같은지 비교 : " + (bo1 == bo2));
        System.out.println("bo1과 bo2가 다른지 비교 : " + (bo1 != bo2));

        /* 4. 문자열의 값 비교 */
        /* 문자열 역시 ==, != 는 비교 가능하나 대소 비교는 불가능. */

        String str1 = "Lotte";
        String str2 = "Lotte";

        System.out.println("========== 문자열 값 비교 ==========");
        System.out.println("str1과 str2가 같은지 비교 : " + (str1 == str2));
        System.out.println("str1과 str2가 다른지 비교 : " + (str1 != str2));
        // 대,소문자 하나라도 다르면 같지 않다고 간주.
        //System.out.println("str1이 str2보다 큰지 비교 : " + (str1 > str2));
        //문자열은 대소 비교 안된다!

        int x = 10;
        int y = 11;

        boolean result = x <= y;
        System.out.println(result);





    }
}
