package com.ohgiraffers.section05.typecasting;

public class Application1 {

    public static void main(String[] args){

        /* 자동형변환 규칙에 대해 이해할 수 있다. */

        /* 데이터의 형 변환이 필요한 이유
         * 자바에서 다른 유형 간의 현산은 피연산자들이 모두 같은 타입인 경우 실행할 수 있다.
         * >> 같은 데이터 유형끼리만 연산 수행이 가능하다.
         *
         * */
        /* 형변환의 종류와 규칙
        * 1. 자동형변환 (묵시적 형변환) : 컴파일러가 자동으로 수행해주는 유형 변환
         * 1-1. 작은 자료형 -> 큰 자료형으로 자동형변환 발생
         * 1-2. 정수 -> 실수로 자동형변환 발생
         * 1-3. 문자형 -> int 형태로 자동형변환 발생
         * 1-4. 논리형은 형변환 규칙에서 제외됨
        * 2. 강제적 (명시적) 형변환 : 형변환(cast) 연산자를 이용한 강제적 수행 형태의 형변환
         * 2-1. 자동형변환이 적용되지 않을 경우 강제적으로 형변환이 필요하다.
         * */

        /* 자동형변환 규칙테스트 */
        /* 1-1. 작은 자료형 -> 큰 자료형으로 자동형변환 */
        // 이렇게 공간만 옮기는 경우 데이터 손실이 발생하지 않기 때문에 컴파일러가 자동으로 처리해줌.

        byte bnum = 1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;       //더 큰 공간으로 옮기는거기 때문에 오류 발생 없이 진행됨.


        int num1 = 10;
        long num2 = 20;

        // int result = num1 + num2;
        // 자동으로 큰 자료형인 long 유형으로 변경 이후 계산
        //>> int형 변수에 값을 담을 수 없음.

        long result = num1 + num2;
        // int + long은 다른 자료형이라 데이터 손실이 발생하지 않는 int -> long 변환을 자동으로 수행 후 연산함

        System.out.println("result : " + result);

        /* 1-1-2. 실수 간의 자동형변환 */

        float fnum = 5.0f;

        double dnum = fnum;

        double result2 = fnum + dnum;

        System.out.println("result : " + result2);

        /* 1-2. 정수는 실수로 자동형변환된다. */
        /* 정수를 실수로 변경할 때 소수점 자릿수가 없어도 실수 형태로 표현 가능.
         * 이때 데이터의 손실이 없으므로 자동 형변환이 가능함. */

        /* 1-3. 문자형은 int 형태로 자동 형변환이 된다. */
        char ch1 = 'a';
        int num8 = ch1;     //아스키 어쩌고 그거로 문자도 고유 숫자로 간주 ㅇㅋ?

        /* 1-4. 논리형은 형변환 규칙에서 제외된다. */
        // 어떤 자료형이든 boolean을 형변환할 수 없다.
        boolean isTrue = true;
        // XXXX bnum1 = isTrue; >> XX에 어떤 자료형을 놔둬도 형






    }
}
