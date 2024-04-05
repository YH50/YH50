package com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application1 {

    public static void main(String[] args) {

        /*
        * Map 인터페이스의 특징
        * >> Collection 인터페이스와 다른 저장 방식을 가진다.
        * 키(Key) & 값 (Value)을 하나의 쌍으로 저장하는 방식을 사용.
        *
        */

        /*
        * 키 (Key)
        * >> 값 (value)을 찾기 위한 이름 역할을 하는 객체를 의미함.
        * 1. 요소의 저장 순서를 허락하지 않음.
        * 2. 키는 중복 허용하지 않으나 키가 다르면 중복되는 값을 저장 가능하게 함.
        *
        */

        /*
        * HashMap : 검색 속도가 매우 빠름.
        */

        HashMap hashMap = new HashMap();
        hashMap.put("one", new Date());
        hashMap.put(12, "red apple");
        hashMap.put(33, 123);
        
        System.out.println("hashMap = " + hashMap);     //12-apple
        
        hashMap.put(12, "banana");
        System.out.println("hashMap = " + hashMap);     //12-banana (apple 사라짐 : 중복 저장 x)

        hashMap.put(11, "banana");
        hashMap.put(9, "banana");
        System.out.println("hashMap = " + hashMap);     //키가 다르기 때문에 바나나 3개 입력 완료.

        System.out.println("9키의 객체 값 = " + hashMap.get(9));     // 9 - banana

        hashMap.remove(9);
        System.out.println("hashMap = " + hashMap);     // 9 - banana 삭제함
        System.out.println("hashMap.size() = " + hashMap.size());

        HashMap<String, String> hmap2 = new HashMap<>();
        hmap2.put("one", "java");
        hmap2.put("two", "oracle");
        hmap2.put("three", "jdbc");
        hmap2.put("four", "html");
        hmap2.put("five", "css");

        Iterator<String> keIter = hmap2.keySet().iterator();        //반복자 : 키셋을 이용하여 처리

        while (keIter.hasNext()){
            String key = (String)keIter.next();
            String value = (String)hmap2.get(key);
            System.out.println(key + " = " + value);
        }

        Collection<String> values = hmap2.values();
        
        Iterator<String> valueIter = values.iterator();
        while (valueIter.hasNext()){
            System.out.println("valueIter.next() = " + valueIter.next());       //값만 출력
        }
        
        Object[] valuearr = values.toArray();
        for(int i = 0; i< valuearr.length; ++i){
            System.out.println(i + " : valuearr[i] = "+ valuearr[i]);       //배열로 만들어서 처리

        }

        Set<Map.Entry<String, String>> set = hmap2.entrySet();

        Iterator<Map.Entry<String, String>> entryIter = set.iterator();
        while(entryIter.hasNext()){
            Map.Entry<String, String> entry = entryIter.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }           //내부에서 정의된 엔트리로 키와 객체를 쌍으로 묶어서 처리




    }
}
