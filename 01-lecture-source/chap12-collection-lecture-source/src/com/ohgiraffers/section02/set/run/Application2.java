package com.ohgiraffers.section02.set.run;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application2 {

    public static void main(String[] args) {
        
        /*
        * LinkedHashSet 클래스
        * >> HashSet의 모든 기능 + 추가로 저장 순서를 유지하는 기능까지 탑재.
        * 
        */

        LinkedHashSet<String> lhset = new LinkedHashSet<>();
        lhset.add("java");
        lhset.add("oracle");
        lhset.add("jdbc");
        lhset.add("html");
        lhset.add("css");

        System.out.println("lhset = " + lhset);

        TreeSet<String> tset = new TreeSet<>(lhset);        //오름차순으로 정렬해줌
        System.out.println("tset = " + tset);

    }
}
