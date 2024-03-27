package com.ohgiraffers.section04.sort;

public class Application1 {

    public static void main(String[] args) {
        /* 변수의 두 값을 변경하는 방법에 대해 이해할 수 있다. */
        /* 변수의 두 값 변경하기 */
        int no1 = 10;
        int no2 = 20;

        System.out.println("no1 = " + no1);
        System.out.println("no2 = " + no2);

        int temp;
        temp = no1;         //no1이었던 공간은 비어있게 됨.
        no1 = no2;          //빈 no1에 no2의 값을 넣음 >> no2의 공간은 비어있게 됨
        no2 = temp;         //빈 no2에 temp의 값을 넣음.

        System.out.println("no1 = " + no1);
        System.out.println("no2 = " + no2);

        int[] arr = {2,1,3};
        int temp2;
        temp2 = arr[0];
        arr[0] = arr[1];
        arr[1] = temp2;

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i : arr){
            System.out.print(i + " ");      //향상된 for 문에는 선언한 변수(i)를 넣어줘야함
        }


    }
}
