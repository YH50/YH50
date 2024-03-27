package com.ohgiraffers.section04.sort;

public class Application4 {

    public static void main(String[] args) {
        /*
        * 버블 정렬에 대해 이해하고 적용할 수 있다.
        * 인접한 두 개의 원소를 검사하여 정렬하는 방법.
        * 장점 - 구현이 쉽고 이미 정렬된 데이터를 정렬할 때 가장 빠름.
        * 단점 - 정렬에 비해 속도가 느림, 역순으로 정렬 시 가장 느림.
        * */
        // 따로 찾아보면서 복습 제대로 해라....


        int[] iarr = {2,5,4,6,1,3};

        int temp;

        for(int i = iarr.length - 1; i >= 0; i--){
            for(int j = 0; j < i; j++) {

                if(iarr[j] > iarr[j + 1]) {

                    temp = iarr[j];
                    iarr[j] = iarr[j + 1];
                    iarr[j+1] = temp;
                }
            }
        }

        /* 설명. 값 출력용 반복문 */
        for(int i = 0; i < iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
    }
}
