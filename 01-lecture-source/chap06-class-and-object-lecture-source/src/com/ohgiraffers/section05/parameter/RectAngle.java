package com.ohgiraffers.section05.parameter;

public class RectAngle {

    private double width;
    private double height;          //변수 선언

    public RectAngle(double width, double height) {
        this.width = width;
        this.height = height;
    }                                   //생성자

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }                                       //setter (설정자)
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }                                       //getter (접근자)

    public void calcArea(){

        double area = width * height;

        System.out.println("이 사각형의 넓이는 " + area+ "입니다.");
    }
    public void calcRound(){

        double cir = (width + height) * 2;

        System.out.println("이 사각형의 둘레는 " +cir+ "입니다.");
    }
}
