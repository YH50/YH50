package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application3 {

    public static void main(String[] args) {
        ExceptionTest st = new ExceptionTest();

        try {
            st.checkEnoughMoney(-20000, 30000);

        } catch (PriceNegativeException |MoneyNegativeException e) {

            System.out.println(e.getClass() + "발생!!!");       //예외가 발생한 클래스 이름 식별 가능.
            System.out.println(e.getMessage());

        } catch (NotEnoughMoneyException e) {
            /*예외 클래스명, 예외 발생 위치, 예외 메시지를 stack 호출 역순으로
            * 빨간색 글씨를 이용하여 로그 형태로 출력해주는 기능*/
            e.printStackTrace();

        }finally{
            System.out.println("finally 블럭 작동...");
        }
        System.out.println("프로그램 종료");
    }
}
