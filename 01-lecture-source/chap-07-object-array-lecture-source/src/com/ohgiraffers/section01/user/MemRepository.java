package com.ohgiraffers.section01.user;

public class MemRepository {
    
    private final static Mem[] mem;
    private static int count;
    
    static{
        mem = new Mem[10];
    }       //static 초기화 블럭으로 초기화 시킴


    public static boolean store(Mem[] mems) {

        for(int i = 0; i < mems.length; ++i){
            mem[count++] = mems[i];
        }
        return true;
    }

    public static Mem[] findAllMems() {
        return mem;
    }
}
