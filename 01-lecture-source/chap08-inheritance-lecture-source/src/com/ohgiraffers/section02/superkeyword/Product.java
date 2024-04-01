package com.ohgiraffers.section02.superkeyword;

public class Product {

  private String code;  //상품코드
  private String brand;  //제조사명
  private String name;  //상품명
  private int price;  //가격
  private Date manufacturingDate;  //제조일자

  public Product(){
    System.out.println("Product 클래스 기본 생성자 호출함...");
  }

  // 변수 다 포함한 생성자 만들어주기

  public Product(String code, String brand, String name, int price, Date ManufacturingDate){
    this.code = code;
    this.brand = brand;
    this.name = name;
    this.price = price;
    this.manufacturingDate = manufacturingDate;
    System.out.println("Product 클래스의 매개변수 있는 생성자 호출함...");
  }
// getter-setter 만들어주기
  
  


    
  
}
