package com.ohgiraffers.section02.encapsulation.problem3;


public class Application {

    public static void main(String[] args) {
        /* 수업 목표 : 필드에 직접 접근할 때 발생하는 문제를 해결하는 방법 */

        Monster mon1 = new Monster();
        mon1.setinfo("피카츄");
        mon1.setHp(200);


        Monster mon2 = new Monster();
        mon2.setinfo("파이리");
        mon2.setHp(100);

        Monster mon3 = new Monster();
        mon3.setinfo("디아루가");
        mon3.setHp(300);

        System.out.println("mon1 = " + mon1.getInfo());
        System.out.println("mon2 = " + mon2.getInfo());
        System.out.println("mon3 = " + mon3.getInfo());



    }

}
