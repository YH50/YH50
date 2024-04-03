package com.ohgiraffers.section03.StringBuilder;

public class Application1 {

    public static void main(String[] args) {
        /* 수업 목표 : String과 StringBuilder 의 차이점을 이해하고 사용할 수 있다.*/
        /*
        * 두 클래스는 스레드 동기화 기능의 제공 여부에 따라 차이점이 존재.
        * StringBuilder : 동기화 기능 X
        *                 동기화 처리를 고려하지 않는 상황에서 StringBuffer보다 성능이 좋음.
        * StringBuffer : 스레드 동기화 기능 O
        *                 성능 면에서는 StringBuilder보다 느림.
        *   두 개의 차이 : 스레드 동기화 유무, 현 시점에서는 스레드를 고려하지 않기 때문에
        *   StringBuilder를 이용할 것.
        * */

        /*
        * String vs StringBuilder
        * String : 불변이라는 특징을 가지고 있다.
        *          문자열에 + 연산을 합치기 하는 경우 기존 인스턴스를 수정하지 않고 새로운 인스턴스를 반환한다.
        *           따라서 문자열 변경이 잦은 경우에는 성능 면에서 좋지 않다.
        *           BUT 변하지 않는 문자열을 자주 읽어들이는 경우에는 좋은 성능을 기대할 수 있다.
        * 
        * StringBuilder : 가변성의 특징을 가지고 있음.
        *                  문자열에 append()메소드를 이용하여 합치기 하는 경우
        *                  기존 인스턴스를 수정하기 때문에 새로운 인스턴스를 생성하지 않는다.
        *                  따라서 문자열 변경이 잦은 경우 String보다 성능이 좋다.
        * */
        
        StringBuilder sb = new StringBuilder("java");
        System.out.println("sb = " + sb);
        
        /*
        * hashCode는 오버라이딩 되어있지 않음.
        * >> 같은 값을 가지는 경우 같은 해시코드를 반환하는 것이 아닌
        *    <<인스턴스>> 가 같아야 같은 해시코드를 반환한다.
        * */

        System.out.println("sb.hashCode() = " + sb.hashCode());     //1096979270
        
        sb.append("oracle");
        System.out.println("sb = " + sb);

        System.out.println("sb.hashCode() = " + sb.hashCode());     //1096979270
        /*  30열에서 선언한 인스턴스를 같이 공유하고 oracle만 붙여놨기 때문에 해시코드는 똑같다!!! */

    }
}
