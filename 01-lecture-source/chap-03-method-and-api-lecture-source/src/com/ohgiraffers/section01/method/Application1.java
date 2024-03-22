package com.ohgiraffers.section01.method;

public class Application1 {

    public static void main(String[] args) {

        /* 수업 목표 : 메소드의 호출 흐름을 이해할 수 있다. */
        /*
         * Method 란?
         * >> 어떤 특정 작업을 수행하기 위한 명령문의 집합
         *
         * 사용목적
         * 1. 중복되는 코드를 메소드로 만들어 코드의 반복 사용을 피할 수 있다.
         * 2. 코드의 가독성이 좋아진다.
         * 3. 기능변경이 필요할 경우 메소드 부분만 수정하면 되기 때문에
               손쉬운 유지 보수가 가능하다.
         * ex) 위에 main 도 method 임.
         * */

        System.out.println("main() 시작...");

        /* 1. main method 밖 하단에 methodA라는 메소드를 추가한다.
         * 2. 작성한 메소드르 호출하는 부분을 작성한다. */

        /* 메소드의 호출 방법 */
        /* 클래스명 사용할 이름 = new 클래스명();        //객체 생성
         * 사용할 이름.메소드명();                     //메소드 호출
         *  */

        Application1 app = new Application1();

        app.methodA();

        System.out.println("main() 끝...");


    }

    public void methodA(){

        System.out.println("유니장 출근ㅡㅡ");


        methodB();


        System.out.println("유니장 퇴근ㅋㅋ");

    }

    public void methodB(){

        System.out.println("09시 30분 수업 시작ㅠㅠ");

        methodC();

        System.out.println("18시 20분 수업 종료^^");
    }

    public void methodC(){

        System.out.println("점심시간 시작 13시 20분 :)");

        System.out.println("점심시간 종료 14시 30분 :(");



    }

}
