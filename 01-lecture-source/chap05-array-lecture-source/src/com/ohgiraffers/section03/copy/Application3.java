package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application3 {

    public static void main(String[] args) {

        /* 수업 목표 : 깊은 복사에 대하여 이해할 수 있다. */
        /*
        * 깊은 복사: heap에 생성된 배열이 가지고 있는 값을
        *       또 다른 배열에 복사를 해놓은 것.
        * 서로 다른 값을 가지고 있으나 두 배열은 서로 다른 배열이기 때문에
        * 하나의 배열을 바꾸더라도 다른 배열에는 영향을 주지 않음.
        *
        * */

        /* 깊은 복사를 하는 방법 (총 4가지)
        * 1. for문을 이용한 동일한 인덱스 값 복사
        * 2. Object의 clone()을 이용한 복사
        * 3. System의 arraycopy()를 이용한 복사
        * 4. Arrays의 copyOf()를 이용한 복사
        * 4.   >>이 중에 가장 높은 성능을 보이는 것 : 3번의 arraycopy() 메소드
        *                                   >> 순수 배열의 복사를 위해 만들어진 메소드
        *   >> 가장 많이 사용되는 방식 :copyOf() 메소드 >> 좀 더 유연한 방식
        * clone() : 이전 배열과 동일한 배열 밖에 만들 수 없음.
        * 나머지 3가지 방법의 특징으로는 복사하는 배열의 길이를 마음대로 조절할 수 있음.
        * */

        int[] originArr = new int[]{1,2,3,4,5};     //1283928880

        print(originArr);

        /* 1. for문을 통해서 동일한 인덱스 값 복사*/
        int[] copyArr = new int[10];        //1989780873

        for (int i = 0; i < originArr.length; i++){
            copyArr[i] = originArr[i];
        }

        print(copyArr);

        /* 2. Object의 clone()을 이용한 복사 */
        int[] copyArr2 = originArr.clone();     //1480010240

        print(copyArr2);

        /* 3. System의 arraycopy()을 이용한 복사 */
        int[] copyArr3 = new int[10];       //81628611
        //기본 형태
        /* >> 원본 배열. 복사를 시작할 인덱스, 복사할 배열, 복사를 시작할 인덱스, 복사할 길이의 의미를 가진다. */
        System.arraycopy(originArr, 0, copyArr3, 3, originArr.length);

        print(copyArr3);

        /* 4. Array의copyOf를 이용한 복사 */
        int[] copyArr4 = Arrays.copyOf(originArr, 7);       //1828972342

        print(copyArr4);

    }

    public static void print(int[] iarr){

        System.out.println("iarr.hashCode() = " + iarr.hashCode());
        for(int i = 0; i < iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }
}
