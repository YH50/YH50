package com.ohgiraffers.section05.typecasting;

public class Application2 {

    public static void main(String[] args){

        /* 수업목표 : 강제형변환 규칙에 대해 이해할 수 있다. */
        /*
        * 강제형변환
        * 바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환한다.
        * ex) (바꾸려는 자료형) 값;
        * */

        /*
        * 자동형변환 규칙의 반대 상황에서 강제형변환이 필요하다.
        * 1. 강제형변환의 규칙
        *   1-1. 큰 자료형 > 작은 자료형으로 변형시 강제형변환이 필요함.
        *   1-2. 실수 > 정수 변경 시 필요.
        *   1-3. 문자형 > int 미만 크기의 변수에 저장할 때 필요.
        *   1-4. 논리형은 강제 형변환 규칙에서도 제외됨.
        * */

        /* 1-1. 大 > 小 변경
        *   1-1-1. 정수 간의 강제 형변환 */
        long lnum = 7;
        //int inum = lnum;      >> 데이터 손실 우려를 컴파일러가 알려줌(error)
        int inum = (int)lnum;   //바꾸려고 하는 자료형을 명시하여 강제형변환 수행.

        short snum = (short)inum;

        double dnum = 2.7;
        float fnum = (float)dnum;   // "小 小변수 = (小) 大변수"
        /* 1-1-2. 실수 > 정수 변경 시 강제 형변환 */
        float fnum0 = 3.0f;
        //long lnum2 = fnum0;     //소수점 아래의 경우 데이터 손실 우려 발생.
                                // 자료형의 byte 값이 크더라도 불가능.
        long lnum2 = (long)fnum0;
        // >> 강제형변환 - 데이터손실 감당할거니까 아몰라 변환"해줘" 의 의미.

        /* 1-3. 문자형을 int 미만 크기(byte, short)의 변수에 저장할 때 강제형변환 필요. */

        int no1 = 97;
        int no2 = -97;

        char ch1 = (char)no1;
        char ch2 = (char)no2;

        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);

        /* 1-4. 논리형은 강제형변환 규칙에서도 제외. */
        //굳이...해야 하나 싶지만 하나는 보고 가자.
        boolean isTrue = true;
        //byte bt = (byte) isTrue;    되겠냐?

    }
}
