package com.ohgiraffers.section03.StringBuilder;

public class Application2 {

    public static void main(String[] args) {
        /* 수업 목표 : StringBuilder 에서 자주 사용되는 메소드의 용법을 확인할 수 있다. */

        StringBuilder sb1 = new StringBuilder();

        /* capacity() : 용량(현재 버퍼의 크기)을 정수형으로 반환하는 메소드 (문자열 길이 + 16 기본 용량)*/
        System.out.println("sb1.capacity() = " + sb1.capacity());   //16 : 기본 용량임

        /*
        * append() : 인자로 전달한 값을 문자열로 변환 후 기본 문자의 마지막에 추가한다.
        * 기본 용량 초과 시 (기존 문자열 + 1) * 2를 하여 용량을 확장시킨다.
        * */

/*        for(int i = 0; i < 50; i++) {
            sb1.append(i);

            System.out.println("sb1 : " + sb1);
            System.out.println("capacity : " + sb1.capacity());		//2n + 2씩 증가함
            System.out.println("hashcode : " + sb1.hashCode());		//동일 인스턴스임
        }*/     // 좀 걸거치는데 나중에 볼거면 풀어서 봐라.
        
        StringBuilder sb2 = new StringBuilder("javaoracle");
        /*
        * delete() : 시작 인덱스와 종료 인덱스를 이용하여 문자열에서 원하는 부분의 문자열을 제거함.
        * deleteCharAt() : 문자열 인덱스를 이용하여 문자 "하나" 를 제거함.
        * >>> *********  둘 다 원본에 영향을 미친다. **********
        * */

        System.out.println("sb2.delete(2,5) = " + sb2.delete(2,5));     //jaracle
        //현 시점부로 sb2는 javaoracle 이 아니라 jaracle임.
        System.out.println("sb2.deleteCharAt() = " + sb2.deleteCharAt(0));  //aracle
        //현 시점부로 sb2는 aracle임.

        /* insert() : 인자로 전달된 값을 문자열로 변환 후 지정된 인덱스 위치에 추가함. */
        System.out.println("sb2.insert() = " + sb2.insert(1,"vao"));    //avaoracle
        System.out.println("sb2.insert() = " + sb2.insert(0, "j"));     //javaoracle
        /* 인덱스 번호가 문자열 길이와 같은 경우 append()와 같은 역할을 함.*/

        System.out.println("insert() : " + sb2.insert(sb2.length(), "jdbc"));   //javaoraclejdbc
        
        
        /*
        * reverse() : 문자열의 인덱스 순번을 역순으로 재배열.
        * */

        System.out.println("sb2.reverse() = " + sb2.reverse());     //cbdjelcaroavaj
        System.out.println("sb2 = " + sb2);         //cbdjelcaroavaj
        // reverse() 도 원본에 영향을 준다!!

        /*
        * String 클래스와 동일한 메소드
        * >> CharAt(), indexOf()/lastIndexOf(), length(), replace(), subString(), toString()
        * */
    }
}
