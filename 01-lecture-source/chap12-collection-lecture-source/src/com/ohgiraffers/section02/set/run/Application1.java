package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;

public class Application1 {

    public static void main(String[] args) {

        /*
        * Set 인터페이스를 구현한 Set 컬렉션 클래스의 특징
        * 1. 요소의 저장 순서를 유지하지 않음.
        * 2. 같은 요소의 중복 저장을 허용하지 않음. (null 값도 중복되지 않게 하나의 null만 저장함)
        *
        */

        /*
        * HashSet 클래스
        * >> Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나.
        * JDK 1.2 부터 제공, 알고리즘을 사용하여 검색 속도가 빠르다는 장점.
        * */

        HashSet<String> hset = new HashSet<>();
        
        hset.add("java");
        hset.add("oracle");
        hset.add("jdbc");
        hset.add("html");
        hset.add("css");

        System.out.println("hset = " + hset);       //입력된 순서대로 출력 안됨 (임의 순서)

        hset.add(new String ("java"));

        System.out.println("hset = " + hset);       //위에 자바 새로 넣으려 한거 안들어감.
        System.out.println("hset.size() 저장된 객체 수 = " + hset.size());
        System.out.println("hset = 포함 확인 : " + hset.contains(new String("oracle")));


        /*1. toArray() 배열로 바꾸고 for loop를 사용함. */
        Object[] arr = hset.toArray(new String[0]);
        for(int i = 0; i < arr.length; ++i){
            System.out.println(i + "arr[i] = " + arr[i]);
        }

        /*Iterator()를 이용하여 목록 만들고 연속 처리*/
        Iterator<String> iter = hset.iterator();
        
        while(iter.hasNext()){
            System.out.println("iter.next() = " + iter.next());
        }
        
        hset.clear();                       // 다 비워주기
        System.out.println("hset.isEmpty() = " + hset.isEmpty());       //다 비워져있냐? > true


    }
}
