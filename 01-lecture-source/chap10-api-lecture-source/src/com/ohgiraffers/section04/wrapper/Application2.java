package com.ohgiraffers.section04.wrapper;

public class Application2 {

    public static void main(String[] args) {
        /* 문자열 파싱 (parsing)에 대해 이해할 수 있다.*/
        /*
        * parsing : 문자열(String) 값을 기본 자료형 값으로 변경하는 것.
        * */

        byte b = Byte.parseByte("1");
        short s = Short.parseShort("2");
        int i = Integer.parseInt("4");
        long l = Long.parseLong("8");   //8L 안됨!!
        float f = Float.parseFloat("4.0f"); //float는 됨
        double d = Double.parseDouble("5.0");
        boolean bl = Boolean.parseBoolean("true");
        char c = "abc".charAt(0);

        System.out.println();
    }

}
