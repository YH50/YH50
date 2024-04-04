package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.List;

public class Application3 {

    public static void main(String[] args) {
        /*
        * LinkedList
        * ArrayList와 사용하는 방식은 유사하나 내부적으로 요소를 저장하는 방법에서 차이 존재.
        * 내부는 이중 연결 리스트로 구현되어있음.
        *
        * [ 단일 연결 리스트 ] : 저장한 요소가 순서를 유지하지 않고 저장되어
        *                      이러한 요소 사이를 링크로 연결하여 구성하며
        *                      마치 연결된 리스트 형태인것처럼 만든 자료 구조.
        *
        * [ 이중 연결 리스트 ] : 단일 연결 리스트는 다음 요소만 링크하는 반면
        *                      이중 연결 리스트는 이전 요소까지 링크하여
        *                      이전 요소로 접근하기 쉽게 고안된 자료 구조.
        * */

        List<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("lemon");
        linkedList.add("mango");

        System.out.println(linkedList.size());

        for(int i = 0; i < linkedList.size(); ++i){     //size : ~번째 말하는거임. (배열 아님!!)
            System.out.println(i + " : " + linkedList.get(i));
        }

        linkedList.remove(1);
        System.out.println(linkedList);

        System.out.println(linkedList.isEmpty());       //비어있는가 여부 : false

        linkedList.clear();                             // 리스트 안에 있는거 다 날리겠다는거
        System.out.println(linkedList.isEmpty());       // 다 비웠으니까 true



    }
}
