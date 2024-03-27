package test1;

import java.util.Scanner;

public class TestMethod {



    public void calculator(int a, int b){



        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

    }


    public static double CircleArea(){

        final double a = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("반지름 입력 : ");
        double r = sc.nextDouble();
        //System.out.println("입력된 반지름 : " + r);
        double area = r*r*a;


        return area;

    }

 /*   public static String TestRandom(){

        int randomnum = (int)(Math.random() * 10 + 1);
        String result
    }

  */









}
