package com.ohgiraffers.section03.map.run;

import java.util.Properties;

public class Application2 {

    public static void main(String[] args) {
        /*
        * Properties 란?
        * >> HashMap을 구현하여 사용 방법이 거의 유사하나 모두 문자열만 사용할 수 있는 자료 구조.
        * 설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용.
        * */
        
        Properties prop = new Properties();
        
        prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
        prop.setProperty("url", "jdbc:oracle:thin:@127.0.0.1:1521:xe");
        prop.setProperty("user", "student");
        prop.setProperty("password", "student");

        System.out.println("prop = " + prop);



/*        Properties prop2 = new Properties();


        prop2.list(System.out);     //Properties 의 모든 키값의 목록을 내보내기 함.*/

        System.out.println(prop.getProperty("driver"));
        System.out.println(prop.getProperty("url"));
        System.out.println(prop.getProperty("user"));
        System.out.println(prop.getProperty("password"));
        //위에 태그 벗겨내고 prop2로 출력하면 싹 다 null 나옴, 지금은 그냥 그대로 값만 출력함.

    }
}
