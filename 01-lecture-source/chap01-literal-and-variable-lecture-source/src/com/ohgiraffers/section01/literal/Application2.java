package com.ohgiraffers.section01.literal;

public class Application2 {

    public static void main(String[] args) {

        /*수업 목표 : 값의 직접적인 사칙연산을 출력할 수 있다.*/
        /*값의 형태에 따라 사용할 수 있는 연산자의 종류와 연산의 결과가 달라진다.*/

        /*1. 숫자 간의 연산*/
        /*1-1. 정수 간의 연산*/
        /*수학적으로 사용하는 사칙연산에 추가로 나머지를 구하는 연산을 사용할 수 있다.*/
        System.out.println("==========정수 간의 연산==========");
        System.out.println(123 + 456);
        System.out.println(456 - 123);
        System.out.println(5050 * 11);
        System.out.println(5050 / 10);
        System.out.println(5050 % 11);

        /*1-2. 실수 간의 연산*/
        System.out.println("==========실수 간의 연산==========");
        System.out.println(1.23 + 2.94);
        System.out.println(45.5 - 20.2);
        System.out.println(2.81 * 6.7);
        System.out.println(324.5 / 2.2);
        System.out.println(500.2 % 10.5);

        /*1-3. 정수, 실수 간의 연산*/
        System.out.println("==========정수와 실수 간의 연산==========");
        System.out.println(123 + 1.01);
        System.out.println(123 - 10.5);
        System.out.println(123 * 5.2);
        System.out.println(123 / 1.2);
        System.out.println(123 % 2.2);

        /*2. 문자의 연산*/
        /*2-1. 문자 간의 연산*/
        /*문자 간의 연산도 사칙연산, 나머지 구하는 연산까지 가능함*/
        /*결과가 왜 이렇게 나왔는지보다는 연산이 가능하다는 점에 주목하기*/
        System.out.println("==========문자 간의 연산==========");
        System.out.println('A' + 'B');
        System.out.println('A' - 'B');
        System.out.println('A' * 'B');
        System.out.println('A' / 'B');
        System.out.println('A' % 'B');

        /*2-2. 문자와 정수의 연산*/
        /**/
        System.out.println("==========문자와 정수의 연산==========");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 5);
        System.out.println('a' / 4);
        System.out.println('a' % 3);
        //임의의 문자마다 고유하게 대응되는 숫자들이 존재함.
        //WHY?>>컴퓨터는 문자를 인식하지 못하고 숫자로만 인식하기 때문
        //>> ASCII & UNI code 로 인식.

        /*2-3. 문자와 실수의 연산*/
        /*실수 역시 숫자이므로 정수의 연산과 유사함
        * 단 결과값은 실수로 나타남.*/

        System.out.println("==========문자와 실수의 연산==========");
        System.out.println('a' + 1.5);
        System.out.println('a' - 2.0);
        System.out.println('a' * 5.7);
        System.out.println('a' / 4.2);
        System.out.println('a' % 3.6);

        /*3. 문자열의 연산*/
        /*3-1. 문자열 간의 연산*/
        System.out.println("==========문자열 간의 연산==========");
        System.out.println("Hello" + "World");
        /*System.out.println("Hello" - "World");
        >> Error */
        //이후 곱하기, 나누기, % 전부 실행 시 Error.
        /* >>> "문자열 간의 연산은 더하기만 가능하다."
        이때 '+'의 의미는 문자열 합치기(이어붙이기) 역할을 수행한다.
         */

        /*3-2. 문자열과 다른 형태의 값과의 연산*/
        /*문자열이 포함된 연산은 ONLY '+'만 가능하다.*/
        System.out.println("==========문자열과 다른 형태의 값과의 연산==========");
        /*3-2-1. 문자열과 정수의 연산*/
        System.out.println("helloworld" + 123);
        /*3-2-2. 문자열과 실수의 연산*/
        System.out.println("helloworld" + 12.3);
        /*3-2-3. 문자열과 문자의 연산*/
        System.out.println("helloworld" + 'A');
        /*3-2-4. 문자열과 논리값의 연산*/
        System.out.println("helloworld" + true);
        /*주의 - 숫자로 된 문자열 형태의 값은 '+'의 결과가
                 문자열 합치기의 결과가 되는 것에 유의할 것.*/
        System.out.println("==========문자열 형태의 숫자값의 '+' 연산==========");
        System.out.println("123" + "456");
        /*사칙연산의 더하기 값이 아닌 문자열 이어붙이기의 결과*/

        /*4. 논리값 연산*/
        /*4-1. 논리값 간의 연산*/
        //System.out.println(true + false);
        //System.out.println(true - false);
        //System.out.println(true * false);
        //System.out.println(true / false);
        //System.out.println(true % false);
        //>> boolean - error
        /*논리값끼리의 연산은 모든 연산자 사용 불가*/

        /*4-2. 논리값과 정수의 연산*/
        /*System.out.println(true + 1);
        System.out.println(true - 1);
        System.out.println(true * 1);
        System.out.println(true / 1);
        System.out.println(true % 1);*/
        // >> 얘네도 전부 연산자 사용 불가능 (boolean 발생)

        //실수도 똑같다. boolean 발생
        //참고) 정수는 int, 실수는 double 형태.

        /*4-4. 논리값과 문자의 연산*/
/*
        System.out.println(true + 'A');
        System.out.println(true - 'A');
        System.out.println(true * 'A');
        System.out.println(true / 'A');
        System.out.println(true % 'A');
*/
        /*위에서 언급했듯 컴퓨터에서의 문자는
           아스키 코드 등에 의해 숫자로 취급하기 때문에
           모든 연산자 사용 불가능.*/

        /*4-5. 논리값과 문자열의 연산*/
        System.out.println("===========논리값과 문자열의 연산==========");
        System.out.println(true + "A"); // 앞서 했던 문자열 합치기 기능 수행.
/*
        System.out.println(true - "A");
        System.out.println(true * "A");
        System.out.println(true / "A");
        System.out.println(true % "A");
*/      /* 그 외 사칙연산 부호는 수행 불가능.
            앞서 실행한 문자열과 다른 형태의 값들 간의 합치기 원리와 동일.
            */







    }
}