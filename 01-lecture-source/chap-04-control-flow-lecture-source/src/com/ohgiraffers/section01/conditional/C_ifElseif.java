package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseif {


    public void testSimpleIfElseIfStatement(){
        /* 수업목표 : if-else-if 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /*
         * [is-else-if 문 표현식]
         *
         * if(조건식1){
         *          조건식1이 true 일때 실행할 명령문;
         * }else if(조건식2){
         *           조건식이 true 일때 실행할 명령문;
         * }else{
         *       위의 2개의 조건이 모두가 거짓일 경우 실행할 명령문;         *
         * */

        System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 말았다.");
        System.out.println("연못에서 산신령이 나와 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");
        System.out.println("그리고 나무꾼에게 어느 도끼가 자신의 도끼인지 물었다.");

        System.out.print("니꺼 뭐임? (1. 금/ 2. 은/ 3. 쇠 : ");
        Scanner sc = new Scanner(System.in);
        int ax = sc.nextInt();

        if(ax == 1) {
            System.out.println("야이 된장남아 꺼져라");
        }else if(ax == 2){
            System.out.println("어디서 구라질이야 꺼져라");
        }else{
            System.out.println("참 식식한 청년이구나 여기 도끼 다 가져가거라.");
        }
        System.out.println("그러고는 산신령은 다시 연못 속으로 들어갔다. 끝...");

    }

    public void testNextIfElseIfStatement(){

        /* 수업 목표 : 중첩된 if-else-if 문의 흐름을 이해하고 적용할 수 있다. */
            /* 중첩된 if-else-if 문 실행의 흐름 확인 */

        /*
         *  ohgiraffers 대학의 김xx교수님은 학생들 시험 성적을 수기로 계산해서 학점 등급을 매기는 채점방식을 사용하고 있었다.
         *  90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D'를
         *  60점 미만인 경우에는 'F'를 학점 등급으로하는 기준이다.
         *  추가로 각 등급의 중간점수(95, 85, 75..)인 경우 '+'를 붙여서 등급을 세분화 하다보니 신경쓸게 이만 저만이 아니다.
         *  그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름 입력 : ");
        String name = sc.nextLine();
        System.out.print("학생 점수 입력 : ");
        int point = sc.nextInt();

        String grade = "";

        /* 내가 혼자 만들어본거
        if(point >=90 && point <=100){
            System.out.println("학점 : A");
        }else if(point >=95){
            System.out.println("학점 : A+");
        }
        if(point >= 80 && point < 90){
            System.out.println("학점 : B");
        }else if(point >=85) {
            System.out.println("학점 : B+");
        }
        if(point >= 70 && point < 80){
            System.out.println("학점 : C");
        }else if(point >=75) {
            System.out.println("학점 : C+");
        }
        if(point >= 60 && point < 70){
            System.out.println("학점 : D");
        }else if(point >=65) {
            System.out.println("학점 : D+");
        }
        else{
            System.out.println("학점 : F");
        }
        */






    }




}
