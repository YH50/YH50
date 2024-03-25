package com.ohgiraffers.section01.conditional;

public class Application {

    public static void main(String[] args) {

        A_if a = new A_if();
        /* 단독 if 문 흐름 확인용 메소드 출력 */
        //a.testSimpleIfStatement();

        /* 중첩된 if문 흐름 확인용 메소드 출력 */
        //a.testNextIfStatement();

        B_ifElse b = new B_ifElse();
        /* 단독 if-else 문 흐름 확인용 메소드 호출 */
        //b.simpleTestIfElseStatement();

        /* 중첩 if-else 문 흐름 확인용 메소드 호출 */
        //b.testNeatedIfStatement();

        /* if-else-if 문 흐름 확인용 메소드 호출 */
        C_ifElseif c = new C_ifElseif();
        //c.testSimpleIfElseIfStatement();

        //예제 실행 메소드 호출
        c.testNextIfElseIfStatement();



    }
}
