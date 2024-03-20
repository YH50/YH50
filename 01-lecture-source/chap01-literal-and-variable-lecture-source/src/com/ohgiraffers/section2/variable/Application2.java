package com.ohgiraffers.section2.variable;

public class Application2 {

    public static void main(String[] args){

    /* 수업 목표 : 변수를 선언하고 값을 할당하여 사용할 수 있다. */
        /*변수를 사용하는 방법
        * 1. 변수 준비(선언)
        * 2. 변수에 값 대입(값 대입 및 초기화)
        * 3. 변수 사용
        * */

        /*자료형이란?
        *  다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지
           미리 컴파일러와 약속한 키워드.
        * ex) 앞서 사용한 int 자료형은 정수를 4바이트만큼 읽어서 하나의 값으로 취급하겠다고 약속함.
        *      이러한 자료형은 기본자료형(Primary type)과 참조자료형(Reference type)으로 구분됨.
        *      기본자료형(8종)
        * */

        /**/
        /* 1-1-1. 숫자를 취급하는 자료형 */
        /* 정수를 취급하는 자료형 - 4종 */

        byte bnum;      //1byte
        short snum;     //2byte
        int inum;       //4byte
        long lnum;      //8byte (2제곱씩 증가)

        /* 실수를 취급하는 자료형 - 2종*/

        float fnum;     //4byte
        double dnum;    //8byte

        /* 1-1-2. 문자를 취급하는 자료형 */
        /* 문자를 취급하는 자료형 - 1종 */

        char ch;    //2byte
        char ch2;

        /* 1-1-3. 논리값을 취급하는 자료형 */
        boolean isTrue;     //1byte

        /*이상 기본자료형 8종*/

        /* 1-1-4. 문자열을 취급하는 자료형 */

        String str;     //main에 들어감, 주소값은 4byte, 정수값.
        //주소값 ~= 용량

        /* 2. 변수에 값을 대입. */ //값 대입 및 초기화

        //등호 기준 좌측 - 자료형 or 이름, 우측 - 값.

        /* 2-1. 정수를 취급하는 자료형에 값을 대입 */
        bnum = 1;   // (참고) -128 ~ +127
        snum = 2;   // -32768 ~ 32767
        inum = 3;   // -2147483648 ~ 2147483647
        //lnum = 8;   // -92233420368554775808 ~ 그만 알아보자...
                        // 단 뒤에 대문자 L 붙여야함.
        lnum = 8L;

        /* 2-2. 실수를 취급하는 자료형에 값을 대입 */
        //fnum = 5.0; >> error - 뒤에 f 붙여야 함.
        fnum = 5.0f;
        dnum = 8.0; //double은 그냥 가능, 뒤에 d 붙여도 상관없음

        /* 2-3. 문자를 취급하는 자료형에 값을 대입 */
        ch = 'a';   //문자 형태의 값 저장 가능.
        ch2 = 97;   //여기에 들어갈 수 있는 숫자 - ASCII 코드와 연관된 숫자들 한정.

        /* 2-4. 논리를 취급하는 자료형에 값을 대입 */
        isTrue = true;
        isTrue = false;

        /* 2-5. 문자열을 취급하는 자료형에 값을 대입 */

        str = "Hola";
        /* 일반적으로 사용하는 독특한 형태가 아닌 일반적 형태로 사용 가능한 자료형 - 대표자료형 */
        //ex) 정수 - int, 실수 - double이 각각 대표 자료형.



        /* 3. 변수의 사용 */
        /* 변수에 저장한 값을 출력 */
        System.out.println(" ======== 변수에 저장된 값 출력하기 ========");
        System.out.println("bnum의 값 출력 : " + bnum);
        System.out.println("snum의 값 출력 : " + snum);
        System.out.println("inum의 값 출력 : " + inum);
        System.out.println("lnum의 값 출력 : " + lnum);
        System.out.println("fnum의 값 출력 : " + fnum);
        System.out.println("dnum의 값 출력 : " + dnum);

        System.out.println("ch의 값 출력 : " + ch);
        System.out.println("ch2의 값 출력 : " + ch2);

        System.out.println("isTrue의 값 출력 : " + isTrue);

        System.out.println("str값 출력 : "+ str);




    }
}
