package com.ohgiraffers.section03.branching;

    public class A_break {

        public void testSimpleBreakStatement1(){

    /* 수업 목표 : break문 사용에 대한 흐름을 이해하고 적용할 수 있다.
    *
    * break문 - 반복문 내에서 사용.
    * 해당 반복문을 빠져나올 때 사용하며, 반복문의 조건문 판단 결과와 상관없이
                                    반복문을 빠져나올 때 사용함.
    * 일반적으로 if(조건식) {break;} 처럼 사용.
    * 단 switch 문은 반복문이 아니지만 예외적으로 사용함.
    * */

    /* break 문을 이용하여 무한루프를 활용한 1~100까지의 합 구하기 */

    int sum = 0;
    int i = 1;
    while(true){

        sum += i;

        if(i == 100) {

            break;
        }
        i++;

        }
            System.out.println("1부터 100까지의 합은 " +sum+ "입니다.");

    }


    public void testSimpleBreakStatement2(){

        /* 수업 목표 : 중첩 반복문 내 break문 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* break문 - 모든 반복문을 종료하는 것이 아닌
        *           자신에게 가장 인접한 반복문의 실행을 정지시킴. */

        /*
        * 구구단 2-9단까지 출력
        * 단, 각 단의 수가 5보다 큰 경우 해당 반복문을 빠져나온다. (출력을 생략함)
        * */

        for(int dan = 2; dan < 10; dan++){

            for(int su = 1; su < 10; su++){         //break문은 여기만 적용됨.
                                                    //>>위에 dan 부분은 계속 돌아감.
                if(su > 5){                         //가장 인접한 반복문만 해당되니까

                    break;
                }

                System.out.println(dan + " * " +su+ " = " +(dan*su));

            }
            System.out.println();

        }

    }

}
