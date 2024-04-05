package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application1 {

    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
//            et.checkEnoughMoney(-50000, 10000);
            et.checkEnoughMoney(30000, 50000);
//            et.checkEnoughMoney(-50000, 50000);
//            et.checkEnoughMoney(60000, 40000);

        } catch (Exception e) {     //더 큰 상위타입으로 빼서 후손 클래스들 타고 가서 거기다가 메시지를 빼주겠다는 뜻
            e.printStackTrace();
        }

    }
}
