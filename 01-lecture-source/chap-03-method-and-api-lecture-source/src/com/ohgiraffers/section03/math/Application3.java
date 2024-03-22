package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application3 {

    public static void main(String[] args) {
        /* 수업 목표 : java.util.Random 클래스를 활용하여 사용자 범위 내의 난수 발생시키기. */

        /* java.util.Random 클래스
        * java.util.Random 클래스 nextInt() 메소드를 이용한 난수 발생
        * nextInt(int bound) : 0부터 매개변수로 전달받은 정수 범위까지의 난수를 발생시켜서 정수 형태로 반환.
        * */

        /* 기본 틀 : random.nextInt(구하려는 난수의 개수) + 구하려는 난수의 최솟값 */

        Random random = new Random();

        /* 1. 0부터 9까지 난수 발생 */
        int randomNo = random.nextInt(10);

        System.out.println("0부터 9까지 난수 : " + randomNo);


        /* 1부터 10까지 난수 발생 */

        int randomNo2 = random.nextInt(10) + 1;
        System.out.println("1부터 10까지의 난수 : " + randomNo2);

        /* 3. 20에서 45까지 난수 발생 */

        int randomNo3 = random.nextInt(26) + 20;
        System.out.println("20부터 45까지의 난수 : " + randomNo3);

        /* 4. - 128 ~ 127 사이의 난수 발생 */
        // 위에서 했던 방법 : int randomNo4 = random.nextInt(256) - 128;
        int randomNo4 = new Random().nextInt(256) - 128;
        // >> 객체를 생성하자마자 바로 메소드 호출을 하는 방법.
        System.out.println("- 128부터 127까지의 난수 : " + randomNo4);


    }
}
