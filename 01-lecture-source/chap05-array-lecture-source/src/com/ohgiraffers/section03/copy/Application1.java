package com.ohgiraffers.section03.copy;

public class Application1 {

    public static void main(String[] args) {
        /* 수업 목표 : 배열의 복사 개념 중 얕은 복사에 대해 이해할 수 있다.*/
        /*
        * 배열의 복사 - 크게 두 종류      //얕은 복사, 깊은 복사
        * 1, 얕은 복사 : stack의 주소값만 복사     //통으로 복사
        * 2. 깊은 복사 : heap의 배열에 저장한 값을 복사       //안에 내용만 복사
        * */

        /* 얕은 복사 - stack에 저장되어 있는 배열의 주소값만 복사한다는 점
        * 따라서 두 개의 래퍼런스 변수는 동일한 배열의 주소값을 가지고 있다.
        * 하나의 래퍼런스 변수에 저장된 주소값을 가지고 배열의 내용을 수정(or 값 변경) 시
        *          다른 래퍼런스 변수로 배열에 접근했을 때에도 동일 배열을 가리키고 있기 때문에
        *                        변경된 값이 반영되어있다.
        * */
        
        int[] originArr = {1,2,3,4,5};
        
        int[] copy = originArr;         //얕은 복사
        System.out.println("originArr = " + originArr.hashCode());      //1283928880
        System.out.println("copy.hashCode() = " + copy.hashCode());     //1283928880

        for(int i = 0; i < originArr.length; i++){
            System.out.print(originArr[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < copy.length; i++){
            System.out.print(copy[i] + " ");
        }
        System.out.println();

        //배열의 값 변경 후 출력

        copy[0] = 99;

        for(int i = 0; i < originArr.length; i++){
            System.out.print(originArr[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < copy.length; i++){
            System.out.print(copy[i] + " ");
        }
        System.out.println();
        //1 대신 99로 바꿨을때 복사도 그대로 99로 들어옴.



    }
}
