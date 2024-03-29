package com.ohgiraffers.section08.intblock;

public class Product {

    /* 1. 필드를 초기화하지 않으면 JVM이 정한 기본값으로 객체가 생성됨. */

/*    private String name;
    private int price;
    private static String brand;
    */

    /* 2. 명시적 초기화 */

    private String name = "아이폰12 프로";
    private int price = 770000;
    private static String brand = "애뿔";

    /* 인스턴스 초기화 블럭 */
    {
        name = "범고래";
        price = 130000;

        /* 주의 사항
        * 인스턴스 초기화 블럭에서는 static 필드를 초기화할 수 없다. (그렇게는 보이겠지만)
        * >> 클래스가 로드될 때 이미 기본값으로 초기화가 되어있기 때문.
        * >> 인스턴스 초기화 블럭이 동작하는 시점에는 이미 초기화가 진행된 정적 필드에
        *    인스턴스 초기화 블럭에서 대입한 겂으로 덮어쓰기 해주는 거임.
        * */
        brand = "나이끼";
        System.out.println("인스턴스 초기화 블럭 작동함...");

    }

    static {
        /* 주의사항
        * static 초기화 블럭에서는 non-static 필드를 초기화하지 못함.
        * 정적 초기화 블럭은 클래스 로드 시에 동작하기 때문에
        * 정적 초기화 블럭의 동작 시점에는 인스턴스엔 아무것도 담겨 있지 않아서
        * 존재하지 않는 인스턴스 변수에 초기화하는 것은 시기상으로 불가능함.
        * */

        //name = "패라뤼";
        //price = 120000000;

        brand = "벤츄";
        System.out.println("정적 초기화 블럭 작동함...");
    }

    //기본생성자 만들어야함
    public Product(){
        System.out.println("기본 생성자 호출됨...");
    }
    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매개변수 있는 생성자 호출됨...");
    }

    public String getInformation(){

        return "Product [name = " +this.name+ ", price = " +this.price+ ", brand = " +Product.brand+"]";
    }
}
