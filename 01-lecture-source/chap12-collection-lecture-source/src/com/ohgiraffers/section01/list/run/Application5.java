package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {

    public static void main(String[] args) {
        /* Queue 에 대해 이해하고 사용할 수 있다.
        * 
        * >> 선형 메모리 공간에 데이터를 저장하는 
        *    선입선출 방식의 자료 구조
        * 
        * >> 대부분의 경우 LinkedList를 사용
        * 
        * */
        
        /* 얘 자체가 인터페이스이기 때문에 인스턴스 생성이 불가능함 */
        Queue<String> que = new LinkedList<>();
        
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println("que = " + que);

        /*
        * peek() : 해당 큐의 가장 앞에 있는(제일 먼저 들어온) 요소를 반환.
        * poll() : 해당 큐의 가장 앞에 있는 요소를 반환 후 제거
        *
        * */

        System.out.println("que.peek() = " + que.peek());
        System.out.println("que = " + que);

        System.out.println("que.poll() = " + que.poll());   // 1 나가리
        System.out.println("que.poll() = " + que.poll());   // 2 나가리
        System.out.println("que.poll() = " + que.poll());   // 3 나가리
        System.out.println("que.poll() = " + que.poll());   // 4 나가리

        System.out.println("que = " + que);                 // 남아있는건 5 하나



    }
}
