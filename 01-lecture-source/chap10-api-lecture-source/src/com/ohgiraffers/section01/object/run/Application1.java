package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class Application1 {

    public static void main(String[] args) {
        /*수업 목표 : Object 클래스의 toString() 메소드 오버라이딩 목적을 이해하고 활용할 수 있다. */

        /*
        * 모든 클래스는 Object 클래스의 후손,
        * 따라서 Object 클래스가 가진 메소드를 자신의 것처럼 사용할 수 있다.
        * 또한 부모 클래스가 가지는 메소드를 오버라이딩하여 사용할 수도 있다..
        * */

        /*
        * Object 클래스의 메소드 중 관례상 많이 오버라이딩하여 사용하는 메소드들이 있다.
        * >>> toString(), equals(), hashCode().
        * */

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(2, "훈민정음", "세종", 1500000);
        Book book3 = new Book(3, "목민심서", "정약용", 70000);

        System.out.println("book1 = " + book1.toString());
        System.out.println("book2 = " + book2.toString());
        System.out.println("book3 = " + book3.toString());

        System.out.println("book1  = " + book1);
        System.out.println("book2  = " + book2);
        System.out.println("book1  = " + book3);




    }
}
