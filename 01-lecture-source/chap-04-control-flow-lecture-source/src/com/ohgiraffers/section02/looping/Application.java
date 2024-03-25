package com.ohgiraffers.section02.looping;

import com.ohgiraffers.section01.conditional.A_if;

public class Application {

    public static void main(String[] args) {

        A_for a = new A_for();
        //a.testSimpleForStatement();
        //a.testForExample3();
        //a.printSimpleGugudan();

        A_nestedFor a2 = new A_nestedFor();
        //a2.printStarInputRowTimes();

        B_while b = new B_while();
        //b.testWhileExample2();

        C_doWhile c = new C_doWhile();
        //c.testSimpleDoWhileStatement();
        c.testSimpleDoWhileExample();
    }
}
