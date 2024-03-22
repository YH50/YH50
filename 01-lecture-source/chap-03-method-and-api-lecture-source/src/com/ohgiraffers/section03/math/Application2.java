package com.ohgiraffers.section03.math;

public class Application2 {

    public static void main(String[] args) {

        /* 사용자 지정 범위 내에서의 난수를 발생시킬 수 있다. */
        /* 난수의 활용
        * Math.random()을 이용해 발생한 난수는 0부터 1 이전까지의 실수 범위 내의 값을 반환함.
        * 필요에 따라 정수 형태의 값을 원하는 범위만큼 발생할 때가 존재함.
        * */

        /* 원하는 범위의 난수를 구하는 공식
        *   >>> (int)(Math.random * 구하려는 난수의 개수) + 구하려는 난수의 최솟값
        * */

        /* 1. 0부터 9까지의 정수로 된 난수 발생 */
        int random1 = (int)(Math.random() * 10 );
        System.out.println("0부터 9 사이의 난수 : " + random1);
        // 소수점 이하 숫자들을 강제로 잘라내기 때문에 데이터 손실 발생하긴 함.

        /* 2. 1부터 10까지의 난수 발생 */
        int random2 = (int)(Math.random() * 10) + 1;
        System.out.println("1부터 10 사이의 난수 : " + random2);

        /* 3. 10부터 15까지의 난수 발생 */
        int random3 = (int)(Math.random() * 6) + 10;
        System.out.println("10부터 15 사이의 난수 : " + random3);





    }
}
