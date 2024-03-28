package com.ohgiraffers.section02.encapsulation.problem4;


public class Application {

    public static void main(String[] args) {
        /* 수업 목표 : 접근제한자에 대해 이해하고 필드에 접근하지 못하게 강제화 할 수 있다. */

        /*1. private로 필드에 직접 접근하여 compile error가 발생하는지 확인 */
        Monster mon1 = new Monster();
/*        mon1.kinds = "피카츄";
          mon1.hp = 200;*/                //private : 에러 발생
//

        /* 2. public 메소드를 이용하여 필드에 간접 접근 */
        mon1.setKinds("피카츄");
        mon1.setHp(200);

        System.out.println("mon1.getInfo() = " + mon1.getInfo());

        /* 캡슐화는 유지보수성을 증가시키기 위해 직접 접근을 제한하고
        *  public 메소드를 이용하여 간접적으로 접근하여 사용할 수 있도록 만든 기술
        *  클래스 작성 시 특별한 목적이 아닌 이상 캡슐화를 기본 원칙으로 사용되고 있음.
        * */




    }
}
