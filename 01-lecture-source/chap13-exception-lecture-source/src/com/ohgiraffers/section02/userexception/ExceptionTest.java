package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {

    public void checkEnoughMoney (int price, int money) throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {
//        public void checkEnoughMoney (int price, int money) throws Exception {  //이렇게도 된다.

        if(price < 0){

            throw new PriceNegativeException("상품 가격이 음수가 말이 되냐");

        }
        if (money < 0){

            throw new MoneyNegativeException("가진 돈이 음수가 말이 되냐");

        }

        if(money < price){

            throw new NotEnoughMoneyException("가진 돈보다 상품 가격이 더 비쌈");

        }

        System.out.println("금액이 충분합니다. 즐거운 쇼핑 되세요");
    }
}
