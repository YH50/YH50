package com.ohgiraffers.section05.parameter;

public class Application {

    public static void main(String[] args) {

        /* 메소드의 파라미터에 대해 이해하고 사용할 수 있다.*/

        /*
        * 매개변수로 사용 가능한 자료형
        *
        * 1. 기본자료
        * 2. 기본자료형 "배열"
        * 3. 클래스 자료형
        * 4. 클래스자료형 "배열"
        * 5. 가변 인자
        */

        /* 인스턴스 생성 */
        ParameterTest pt = new ParameterTest();

        /* 1. 기본자료형 전달받는 메소드 호출 확인*/
        int num = 10;
        pt.testPrimaryType(num);

        /* 2. 기본자료형 배열을 전달받는 메소드 호출 확인*/

        int[] iarr = new int[] {1,2,3,3,5};

        System.out.println("인자로 전달하는 값 : " +iarr);
        pt.testPrimaryTypeArray(iarr);

        /* 3. 클래스 자료형 */
        RectAngle r0 = new RectAngle(12.5, 15.5);
        System.out.println("인자로 전달하는 값 : " +r0);
        pt.testClassType(r0);

        System.out.println("변경 후 사각형의 넓이와 둘레==============");
        r0.calcArea();
        r0.calcRound();

        /* 4. 클래스 자료형 배열 : 뒤에서 다룰 예정 */

        /* 5. 가변 인자 */
        //pt.testVariableLengthArray(); >> 매개변수 있어야함
        pt.testVariableLengthArray("강해린");  //가변인자는 전달하지 않아도 됨
        pt.testVariableLengthArray("팜하니", "야구");    //1개도 전달 가능
        pt.testVariableLengthArray("킴민지", "야구","축구","배드민턴");    //여러개 가능
        pt.testVariableLengthArray("모지혜", new String[]{"테니스","수영"});
    }
}
