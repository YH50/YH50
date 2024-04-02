package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class Application2 {

    public static void main(String[] args) {
        /* Object 클래스의 equal() 메소드의 오버라이딩의 목적을 이해하고 활용할 수 있다.*/

        /*
         * equals() 메소드는 매개변수로 전달받은 인스턴스와 == 연산을 하여 true.false 반환함
         * "동일한 인스턴스인지를 비교하는 기능.
         *
         * 동일객체 & 동등객체
         * 동일객체 : 주소가 동일한 인스턴스
         * 동등객체 : 주소는 다르더라도 필드값이 동일한 객체
         * */


        Book book1 = new Book(1,"홍길동", "허균", 50000);
        Book book2  = new Book(1,"홍길동", "허균", 50000);

        System.out.println("두 인스턴스의 == 비교 : " + (book1 == book2));
        System.out.println("두 인스턴스의 equals() 비교 : "+ (book1.equals(book2)));

    }

}
