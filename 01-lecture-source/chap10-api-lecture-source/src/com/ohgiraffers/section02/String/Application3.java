package com.ohgiraffers.section02.String;

import java.util.StringTokenizer;

public class Application3 {

    public static void main(String[] args) {
        /* 문자열의 분리에 대해 이해하고 적용할 수 있다.*/
        /*
        * 문자열을 구분자로 하여 분리한 문자열을 반환하는 기능을 한다.
        * split() : 정규표현식을 사용하여 문자열을 분리.
        *           > 비정형화된 문자열을 분리할 때 좋으나 (공백문자열 포함)
        *           정규표현식을 사용하기 때문에 속도가 느리다는 단점이 있다.
        *
        * StringTokenizer : 문자열의 모든 문자들을 구분자로 하여 문자열을 분리.
        *                  정형화된 문자열 패턴을 분리할 때 사용하기 좋음. (공백문자열 무시)
        *                  split() 보다 속도 면에서 더 빠름
        *                  구분자를 생략하는 경우 공백이 구분자 역할.
        * */

        String emp1 = "100/이대호/부산/영업부";     //모든 값 존재
        String emp2 = "200/강민호//영업부";       //주소 없음
        String emp3 = "300/손아섭/창원/";         //부서 없음

        String[] empArray1 = emp1.split("/");
        String[] empArray2 = emp2.split("/");
        String[] empArray3 = emp3.split("/");

        for(int i = 0; i < empArray1.length; ++i){
            System.out.println("empArray1["+i+"] : " + empArray1[i]);
        }
        System.out.println();
        for(int i = 0; i < empArray2.length; ++i){
            System.out.println("empArray2["+i+"] : " + empArray2[i]);
        }
        System.out.println();
        for(int i = 0; i < empArray3.length; ++i){
            System.out.println("empArray3["+i+"] : " + empArray3[i]);
        }
        System.out.println();


        String[] empArray4 = emp3.split("/", -1);

        for(int i = 0; i < empArray4.length; ++i){
            System.out.println("empArray4["+i+"] : " + empArray4[i]);
        }

        StringTokenizer st1 = new StringTokenizer(emp1, "/");
        StringTokenizer st2 = new StringTokenizer(emp2, "/");
        StringTokenizer st3 = new StringTokenizer(emp3, "/");

//*********************************************************************************
        while (st1.hasMoreTokens()) {
            System.out.println("st1 = " + st1.nextToken());
        }
        System.out.println(

        );
        while (st2.hasMoreTokens()) {
            System.out.println("st2 = " + st2.nextToken());
        }
        System.out.println(

        );
        while (st3.hasMoreTokens()) {
            System.out.println("st3 = " + st3.nextToken());
        }
        System.out.println();

        /*토큰은 한번 쓰면 다시 재출력 못함. 이미 사용한걸로 쳐서 두번 출력 안됨!!!*/

        String colorStr = "red*orange#blue/yellow green";

//        String[] color = colorStr.split("*#/ ");  >> *# 뭐 저런 식 자체를 취급안함
        String[] color = colorStr.split("[*#/ ]");      //대괄호 넣어주면 됨

        for (int i = 0; i < color.length; ++i){
            System.out.println("color[" +i+ "] : " +color[i]);
        }
        System.out.println();


        StringTokenizer colorTokenizer = new StringTokenizer(colorStr, "*#/ ");
        //정규표현식이 아니라서 얘는 위에같이 구분할 기호 다 때려박아도 사용 가능.

        while (colorTokenizer.hasMoreTokens()){
            System.out.println(colorTokenizer.nextToken());
        }




    }
}
