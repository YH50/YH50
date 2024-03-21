package com.ohgiraffers.section05.typecasting;

public class Application3 {

    public static void main(String[] args){

        /* 수업 목표 : 자동형변환, 강제형변환을 이용하여 서로 다른 자료형끼리 연산을 수행할 수 있다. */
        /*
        *  자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산
        *  다른 자료형끼리의 연산은 큰 자료형으로 자동 형변환 후 연산처리된다.
        * */

        int inum = 10;
        long lnum = 100;

        /* 1. 두 수의 연산 결과를 int 형태로 변환 후 int 자료형 변수에 리턴 받는다. */

        //int isum = inum + lnum; >> error
        int isum = (int)(inum + lnum);      //전체 연산값 = long, 그 long값을 int로 바꾼다.
        /* 2. long 형태의 값을 int 형태로 강제형변환한다. */
        int isum2 = inum + (int)lnum;
        /* 3. 결과값을 long으로 받는다. (자동형변환 이용) */
        long lsum = inum + lnum;

        //주의사항//
        //int 미만의 연산 처리의 결과는 int 형태이다.
        byte bn1 = 1;
        byte bn2 = 2;
        short st1 = 4;
        short st2 = 6;

        //short ssum = bn1 + st1;       >> error
        //byte bsum = bn1 + bn2;        >> error
        int result1 = bn1 + bn2;
        int result2 = bn1 + st2;
        //결과값은 byte or short끼리, 혹은 혼합이어도 무조건 int 형태로 처리되게끔 하도록 한다.




    }
}
