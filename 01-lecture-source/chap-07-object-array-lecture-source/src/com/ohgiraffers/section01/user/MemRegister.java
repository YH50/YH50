package com.ohgiraffers.section01.user;

public class MemRegister {

    public void regist(Mem[] mems){
        System.out.println("회원을 등록합니다.");

        for(int i = 0; i < mems.length; ++i){
            System.out.println(mems[i].getName() + "님이 등록에 성공하였습니다.");
        }
        if(MemRepository.store(mems)){

            System.out.println("총" + mems.length + "명의 회원 등록에 성공하였습니다.");

        }
    }
}
