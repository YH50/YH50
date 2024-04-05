package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application2  {

    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();
        try {
            et.checkEnoughMoney(-10000, 80000);
            System.out.println("제대로 돌아가나?");

        } catch (NotEnoughMoneyException e) {
            System.out.println("NotEnoughMoneyException 발생");
            System.out.println(e.getMessage());

        }catch (PriceNegativeException e) {
            System.out.println("PriceNegativeException 발생");
            System.out.println(e.getMessage());
            e.printStackTrace();    //타고 타고 들어간거 오류띄우면서 보여줌

        } catch (MoneyNegativeException e) {                            //멀티 블럭
            System.out.println("MoneyNegativeException 발생");
            System.out.println(e.getMessage());

        }finally{               //예외 발생 여부와 상관없이 실행
            System.out.println("finally 블럭 내용 작동함");
    }
}
}
