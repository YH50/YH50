package com.ohgiraffers.section05.parameter;

public class ParameterTest {

    public void testPrimaryType(int num){
        System.out.println("매개변수로 전달 받은 값 : "+ num);
    }

    public void testPrimaryTypeArray(int[] iarr){

        System.out.println("매개변수로 전달 받은 값 : "+ iarr);

        System.out.print("배열의 값 출력 : ");
        for(int i = 0; i < iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        iarr[0] = 99;

        System.out.print("변경된 배열의 값 출력 : ");
        for(int i = 0; i < iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }

    public void testClassType(RectAngle rect){

        System.out.println("매개변수로 전달받은 값 : " + rect);

        System.out.println("사각형의 넓이와 둘레==================");
        rect.calcArea();
        rect.calcRound();

        rect.setHeight(25);
        rect.setWidth(61);

        System.out.println("변경된 사각형의 넓이와 둘레==================");
        rect.calcArea();
        rect.calcRound();
    }


    public void testVariableLengthArray(String name, String ...hobby){
        //점점점 : 가변 배열 활용해서 넘겨준다는 표기
        /// >> 무조건 뒤에다가 써야함. 받아들여라.

        System.out.println("이름 : " +name);
        System.out.println("취미의 개수 : " + hobby.length);
        System.out.print("취미 : ");
        for(int i = 0; i < hobby.length; ++i){
            System.out.print(hobby[i] + " ");
        }
        System.out.println();

    }

/*    public void testVariableLengthArray(String ...hobby){



        System.out.println("취미의 개수 : " + hobby.length);
        System.out.print("취미 : ");
        for(int i = 0; i < hobby.length; ++i){
            System.out.print(hobby[i] + " ");
        }
        System.out.println();

    }       >>> 가변 인자에 들어갈 값의 주체가 정해지지 않았기 때문에 이렇게는 작성 불가
*/

}
