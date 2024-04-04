package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application1 {

    public static void main(String[] args) {

        /* 컬렉션 프레임워크에 대해 이해할 수 있다.
        *
        * 컬렉션 프레임워크
        *   > 자바에서 컬렉션 프레임워크는 여러 개의 다양한 데이터를 쉽고 효과적으로 처리할 수 있도록
        *   표준화된 방법을 제공하는 클래식 집합을 의미한다.
        * */

        /*
        * 컬렉션 프레임워크 > 크게 3가지 인터페이스들 중 하나를 상속받아 구현해놓았음.
        *
        * 1. List 인터페이스
        * 2. Set 인터페이스
        * 3. Map 인터페이스
        * */
        /* List 인터페이스 특징
        * 1. 순서가 있는 데이터 집합으로 데이터 중복 저장을 허용
        * 2. Vector, ArrayList, LinkedList, Stack, Queue 등이 있음.
        * 3. 요소의 저장 순서가 유지됨.
        * */
        // < ArrayList >
        /* 배열의 단점을 보완하기 위해 제작됨.
        *  크기를 변경할 수 없고 요소의 추가 및 삭제, 정렬 등이 복잡한 배열의 단점을 보완하기 위해
        *  >> 배열에서 할 수 없는 기능들을 미리 메소드로 구현해서 제공하고 있다.
        * */

        ArrayList arrayList = new ArrayList();

        List list = new ArrayList();

        Collection collection = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add(123);
        arrayList.add(45.67);
        arrayList.add(new Date());

        System.out.println("arrayList = " + arrayList);

        arrayList.size();
        System.out.println("arrayList = " + arrayList.size());

        for (int i = 0; i < arrayList.size(); ++i){
            System.out.println(i + " : " + arrayList.get(i));
        }

        arrayList.add("samsung");
        System.out.println("arrayList = " + arrayList);      //추가 시(1)

        arrayList.add(1, "grape");
        System.out.println("arrayList = " + arrayList);     //추가 시 (2)

        arrayList.remove(2);
        System.out.println("arrayList = " + arrayList);     //삭제 시

//        지정된 위치의 값을 수정할 때에도 인덱스를 활용할 수 있으며 set() 메소드를 사용함.
        arrayList.set(1, Boolean.valueOf(true));
        System.out.println("arrayList = " + arrayList);          //변경 시

//      모든 컬렉션 프레임워크 클래스는 제네릭 클래스로 작성되어있음.
        List<String> strings = new ArrayList<>();

//        제네릭 타입을 지정하면 지정된 타입 외에는 인스턴스를 저장하지 못함.
        strings.add("melon");
//        strings.add(123);     >> string 형태 선언해놔서 이런거는 안됨
        strings.add("orange");
        strings.add("mango");
        strings.add("kiwi");
        strings.add("lemon");

        System.out.println("strings = " + strings);

        Collections.sort(strings);
        // >> Collection 인터페이스가 아닌 클래스이고 static method.
        // 인터페이스명에 s가 붙은 클래스는 관례상 비슷한 방식으로 작성된 클래스를 의미함.

        System.out.println("strings = " + strings);

        /*
        * 다소 복잡하지만 내림차순 정렬도 가능함.
        * BUT 기본적으로 ArrayList는 내림차순 기능 제공 X
        * > 역순 정렬기능은 Linked에 포함, but List로 공간 선언했기 때문에
        * Arraylist에서 LinkedList로 변경할 수 있다.
        *
        * */

        strings = new LinkedList<>(strings);

        /*
        * Iterator 반복자 인터페이스를 활용하여 역순으로 정렬하기
        * LinkedList 타입으로 형변환 후 descendingIterator() 메소드를 사용하면
        * 내림차순으로 정렬된 타입의 목록으로 반환해준다.
        * hasNext() : 다음 요소를 가지고 있는 경우 true, 더 이상 가져올 문서가 없으면 false 출력
        * next() : 다음 요소를 반환
        *
        *
        * Collection 인터페이스의 Iterator() 메소드를 이용해서 인스턴스를 생성할 수 있는데
        * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용.
        * >> 반복자라고 칭하며 반복문을 이용하여 목록을 하나씩 꺼내는 방식으로 사용하기 위함.
        * 인덱스로 관리되는 컬렉션이 아닌 경우 반복문을 사용하여 요소에 하나씩 접근할 수 없기 때문에
        * [[ 인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어주는 역할. ]]
        *
        * */

        Iterator<String> dIter = ((LinkedList<String>)strings).descendingIterator();
//                                      [ 형변환 ]
/*
        while(dIter.hasNext()){
            System.out.println(dIter.next());
        }
        System.out.println("====================================");
        while(dIter.hasNext()){
            System.out.println(dIter.next());
        }           // 여기 결과 출력 안됨 : 한 번 꺼내면 그걸로 끝
*/

        List<String> descList = new ArrayList<>();

        while(dIter.hasNext()){
            descList.add(dIter.next());
        }
        System.out.println("descList : " + descList);








    }
}
