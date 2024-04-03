package com.ohgiraffers.section05.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Application2 {

    public static void main(String[] args) {


        /* java.util.Calendar 클래스 사용법을 이해하고 사용할 수 있다.*/
        /*
         * By API 문서 : Calendar 클래스는 abstact 클래스로 작성됨.
         *  따라서 Calendar 클래스를 이용하여 인스턴스를 생성하는 것은 불가능함.
         * */

        /* Calendar 클래스를 이용한 인스턴스 생성 방법 >> 크게 두 가지 방법
         * 1. getInstance() static 메소드를 이용해서 인스턴스를 반환받는 방법
         * 2. 후손 클래스에 GregorianCalendar 클래스를 이용하여 인스턴스를 생성하는 방법
         * */

//  1. getInstance() static 메소드를 이용해서 인스턴스를 반환받는 방법
        Calendar calendar = Calendar.getInstance();

        System.out.println("calendar = " + calendar);
        
//  2. 후손 클래스에 GregorianCalendar 클래스를 이용하여 인스턴스를 생성하는 방법
        Calendar gregorianCalendar = new GregorianCalendar();

        System.out.println("gregorianCalendar = " + gregorianCalendar);
        
        int year = 2024;
        int month = 8;  //이거 9월임 (0부터 11까지 쓰니까 0이 1월임)
        int dayOfMonth = 18;
        int hour = 16;
        int min = 42;
        int second = 0;
        
        Calendar birthDay = new GregorianCalendar(year, month, dayOfMonth, hour, min, second);
        System.out.println("birthDay = " + birthDay);
        
    }

}
