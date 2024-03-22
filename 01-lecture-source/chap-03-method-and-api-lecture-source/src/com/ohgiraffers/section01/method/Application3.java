package com.ohgiraffers.section01.method;

public class Application3 {

    public static void main(String[] args) {

    /* 수업 목표 : 메소드 전달인자와 매개변수에 대해 이해하고
                 메소드 호출 시 사용할 수 있다. */
    /*
    * 전달인자(argument)와 매개변수(parameter)를 이용한 메소드 호출
    * 여태 배운 변수 >> 지역변수에 해당.
    * */

    /* 변수의 종류
    * 1. 지역 변수
    * 2. 매개 변수
    * 3. 전역 변수 (필드)
    * 4. 클래스 변수 (static)
    * */

    /* 지역 변수란? : 선언한 메소드 블럭 내부에서 사용 가능.
                    >> "지역변수의 스코프" 라고 칭함.
     * 다른 메소드 간 서로 공유해야하는 값이 존재하는 경우 메소드를 호출 시
                        괄호를 이용하여 값을 전달할 수 있다.
     * 이때의 전달하는 값을 전달인자(argument)라 부르고
       메소드 선언부 괄호 내에 전달인자를 받기 위해 선언하는 변수를 "매개변수(parameter)"라고 한다.
     */

        Application3 app3 = new Application3();
        /* 전달인자와 매개변수를 이용한 메소드 호출 테스트 */
        /* 1. 전달인자로 값 전달 테스트 */
        app3.testMethod(27);
        //app3.testMethod("28");    >> 괄호 안에는 int 형태가 들어가야 하는데
                                    //전달 받은 인자는 String 형태라 오류 발생.
//        app3.testMethod(20,25,31); >> 매개변수는 int 이지만 인자는 3개라 오류 발생.

    /* 2. 변수에 저장한 값 전달 테스트 */
        /* 2-1. 변수에 저장한 값을 이용하여 값을 전달할 수 있다. */
        int age = 25;
        app3.testMethod(age);


        /* 2-2. 자동형변환을 이용하여 값을 전달할 수 있다. */
        byte byteAge = 19;
        app3.testMethod(byteAge);

        /* 2-3. 강제형변환을 이용하여 값을 전달할 수 있다. */
        long longAge = 99;
        //app3.testMethod(longAge)  >> 자동형변환 불가능 > 에러
        app3.testMethod((int)longAge);

        /*2-4. 연산결과를 이용해서 값을 전달할 수 있다. */
        app3.testMethod(age + 5);
    }

    public void testMethod(int age){

        System.out.println("당신의 나이는 "+ age +"세 입니다.");


    }
}
