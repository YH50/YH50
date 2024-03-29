package com.ohgiraffers.section06.finalkeyword;

public class FinalFieldTest {

    /* final 키워드에 대해 이해할 수 있다. */
    /*
    * final
    * :final >> 종단의 의미를 가지는 키워드
    * final 키워드를 사용할 수 있는 위치는 다양한 편이며 의미가 약간은 다르나,
    * 결국 변경이 불가하다는 뜻을 가진다.
    * 1. 지역 변수 : 초기화 이후 값 변경 불가
    * 2. 매개 변수 : 호출 시 전당한 인자 변경 불가
    * 3. 전역 변수 : 인스턴스 생성 후 초기화 이후 값 변경 불가
    * 4. 클래스(static) 변수 : 프로그램 start 이후 값 변경 불가
    * 5. non-static 메소드 : 메소드 재작성 불가
    * 6. static 메소드 : 메소드 재작성 불가
    * 7. 클래스 : 상속 불가
    * */

    /* 1. non-static 필드에 final 사용 */
    /*
    * final은 변경 불가의 의미를 가진다
    * 따라서 초기 인스턴스가 생성되고 나면 기본값 0이 필드에 들어가는데
    * 이 초기화 이후 값을 변경할 수 있기 때문에 선언을 하면서 바로 초기화를 해줘야 함.
    * 안그러면 compile error 발생.
    * */

   // private final int NON_STATIC_NO;     /* 선언만 해버리면 에러남*/
    private final int NON_STATIC_NO = 1;    //이렇게 해야함

    /* 생성자를 이용하여 초기화 */     //** Constructor = 생성자
    private final String NON_STATIC_NAME;

    public FinalFieldTest(String NON_STATIC_NAME) {
        this.NON_STATIC_NAME = NON_STATIC_NAME;
    }


    /* 2. static 필드에 final 사용 */
    /*
    *
    * static에서도 자바에서 지정한 기본값이 대입되기 때문에
    *       final 키워드 사용 시 초기화가 없으면 에러 발생함.
    * */

    //private static final int STATIC_NO;      /* 0으로 초기화되기 때문에 값 변경 불가 */
    private static final int STATIC_NO = 1;
    private static final double STATIC_DOUBLE;      //이걸 단독으로 쓰면 에러남.

/*    public FinalFieldTest(int STATIC_NO){
        this.STATIC_NO = STATIC_NO;
    }*/                                         //final 설정 >> 에러

    /*
    * 생성자를 이용한 초기화 불가능
    * 생성자 >> 인스턴스가 생성되는 시점에서 호출이 되기 때문에 그 전에는 초기화가 이루어지지 못함.
    * BUT static은 프로그램이 start 될 때 할당되기 때문에 초기화가 되지 않은 상태로 선언된 것과 동일하여
    * 기본값으로 초기화된 후에 값을 변경하지 못하기 때문에 에러가 발생한다.
    * */

    /* 초기화 블럭으로는 가능함. */
    static{
        STATIC_DOUBLE = 0.8;
    }


}
