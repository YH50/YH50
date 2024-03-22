package com.ohgiraffers.section05.logical;

public class Application3 {

    public static void main(String[] args) {

        /* 수업 목표 : 논리연결연산자의 진리표에 대해 이해할 수 있다. */

        /*
        * AND 연산과 OR 연산의 특징
        * 논리식 && 논리식 : 앞의 결과가 false 이면 뒤를 실행하지 않음.
        * 논리식 || 논리식 : 앞의 결과가 true 이면 뒤를 실행하지 않음.
        * */

        /* 1. 논리식 && 논리식 : 앞의 결과가 false 이면 뒤를 실행하지 않음. */
        /*
        * >> 조건식 2개가 모두 만족되어야만 true 반환.
        * >> 앞에 false 가 먼저 나오면 뒷 조건 확인 안 함.
        * >>> 연산 횟수를 줄이기 위해서는 &&의 경우
                false 가 나올 확률이 높은 조건을 쓰는 것이 좋다.
        */

        int n1 = 10;

        int res1 = (false && ++n1 > 0 )? n1 : n1;

        System.out.println("&& 실행값 확인 : " + res1);

        /* 2. 논리식 || 논리식 : 앞의 결과가 true 이면 뒤를 실행하지 않음.
        *       >> 둘 중 하나라도 true 이면 true 반환이므로
        *  앞에서 미리 true 가 나오게 되면 뒷 조건 확인하지 않음.
        *  >>> 연산 횟수를 줄일여면 ||의 경우
                true 가 나올 확률이 높은 조건을 쓰는 것이 좋다.
        */

        int n2 = 11;

        int res2 = (true || ++n2 > 0)? n2 : n2;

        System.out.println("|| 실행값 확인 : " + res2);
    }
}
