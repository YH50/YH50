package test2;

import test1.TestMethod;

public class Application {

    public static void main(String[] args) {

        TestMethod app = new TestMethod();

        app.calculator(2, 5);

        System.out.println("========================");

        System.out.println("원의 넓이는 " + TestMethod.CircleArea() + "입니다.");

        System.out.println("========================");






    }




}
