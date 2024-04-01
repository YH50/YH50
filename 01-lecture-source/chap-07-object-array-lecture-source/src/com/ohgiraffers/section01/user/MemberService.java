package com.ohgiraffers.section01.user;

public class MemberService {

    public void signUpMember(){
        Mem[] mems = new Mem[5];

        mems[0] = new Mem(1, "user01", "pass01", "김민지", 20, '여');
        mems[1] = new Mem(2, "user02", "pass01", "팜하니", 20, '여');
        mems[2] = new Mem(3, "user03", "pass01", "모지혜", 19, '여');
        mems[3] = new Mem(4, "user04", "pass01", "강해린", 18, '여');
        mems[4] = new Mem(5, "user05", "pass01", "이혜인", 16, '여');

        MemRegister memRegister = new MemRegister();
        memRegister.regist(mems);
    }

    public void showAllMems(){

        MemFinder finder = new MemFinder();
        for(Mem mem : finder.findAllMems()){
            if(mem != null){
                System.out.println(mem.getInformation());
            }
        }
        System.out.println("======================================================");
    }
}
