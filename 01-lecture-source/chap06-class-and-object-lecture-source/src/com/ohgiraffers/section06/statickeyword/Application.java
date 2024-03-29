package com.ohgiraffers.section06.statickeyword;

public class Application {

    public static void main(String[] args) {
        /* static 키워드를 이해할 수 있다.*/
        /* static 
        * : 정적 메모리 영역에 프로그램이 start 될 때 할당하는 키워드
        * 인스턴스를 생성하지 않고도 사용할 클래스의 멤버(필드, 메소드)를* 지정할 수 있다.
        * 여러 인스턴스가 공유해서 사용할 목적의 공간.
        * BUT static 키워드의 남발은 유지보수와 추적이 힘든 코드를 작성하게 되어
        *                                               피해야 할 방식이다.
        * 명확한 목적이 존재하지 않는 이상 static 키워드 사용은 자제할 것.
        * 의도적으로 static 키워드를 사용하는 대표적 예 >> singleton 객체 생성할 경우
        * */
        
        
        /* 1. static 키워드를 필드에서 사용 */
        StaticFieldTest sft = new StaticFieldTest();

        System.out.println("non-static field = " + sft.getNonStaticCount()); //0
        System.out.println("static field = " + sft.getStaticCount());   //0

        sft.increaseNonStaticCount();
        sft.increaseStaticCount();

        System.out.println("non-static field = " + sft.getNonStaticCount()); //1
        System.out.println("static field = " + sft.getStaticCount());   //1

        StaticFieldTest sft2 = new StaticFieldTest();

        System.out.println("non-static field = " + sft2.getNonStaticCount()); //0
        System.out.println("static field = " + sft2.getStaticCount());   //1

        /*
        * 인스턴스 변수의 경우에는 sft & sft2 두 인스턴스가 서로의 값을 공유하지 못하고
        * 인스턴스를 생성할 때마다 0으로 초기화 된다.
        * static 필드의 경우에는 클래스 변수 자체가 프로그램이 종료할 때까지 유지되고 있기 때문에
        * 값을 유지하고 있다.
        * >>> 따라서 여러 개의 인스턴스가 같은 값(공간)을 공유할 목적으로 static 키워드를 사용한다.
        *
        * */

        StaticMethodTest smt = new StaticMethodTest();
        smt.nonStaticMethod();

        //smt.staticMethod();     권장하지 않음 >> 되긴 함
        StaticMethodTest.staticMethod();    //이게 바람직함
    }
    
}
