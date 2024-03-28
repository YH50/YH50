package com.ohgiraffers.section01.user_type;

public class Application {

    public static void main(String[] args) {

        /* 클래스가 무엇인지 이해하고 작성할 수 있다. */

        /* 1. 변수를 이용한 회원 데이터 관리 */
        String id = "user01";
        String pwd = "pass01";
        String name = "이인복";
        int age = 35;
        char gd = '남';
        String[] hobby = new String[]{"야구", "축구", "배구"};

        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gd = " + gd);
        System.out.print("hobby = ");

        for(int i = 0; i < hobby.length; i++){
            System.out.print(hobby[i] + " ");
        }
        System.out.println();
        System.out.println();


        /* 이렇게 사용하면 단점이 있음.
         * 1. 변수명을 일일이 관리해야 하는 어려움
         * 2. 모든 회원 정보를 인자로 메소드를 호출 시 값을 전달하려면
         *       너무 많은 값들을 인자로 전달해야해서 한 눈에 들어오지 않는다.
         * 3. 리턴은 하나의 값만 가능하기 때문에 회원정보를 묶어서 리턴값으로 사용할 수 없다.
         *       ( 서로 다른 자료형이기 때문에!!)
         * */

        /* 사용자 정의의 자료형 사용하기 */
        /* 2-1. 변수 선언 및 객체 생성 */
        /* 자료형 변수명 = new 클래스명(); >>> 여태 사용한 구문 = 객체(인스턴스)를 생성하는 구문
         * 사용자 정의 자료형인 클래스를 이용하기 위해서는 new 연산자로 heap에 할당해야 한다.
         * 아이디, 비번, 이름, 나이, 성별, 취미를 연속된 메모리 주소에 사용하도록
         *   heap에 공간을 만들어준다.
         * */

        Member mem = new Member();         //객체의 생성(사용자 정의 변수명)

        /* 2-2. 생성된 인스턴스의 초기값 확인하기.*/
        /*
         *
         *
         * 필드에 접근을 하기 위해서는 래퍼런스명, 필드명
         * '-'을 참조 연산자라 하는데 래퍼런스 변수가 사용하는 주소로 접근한다는 의미를 가짐.
         * 각 공간은 필드명으로 접근함.
         *
         * */

        System.out.println("mem.id = " + mem.id);
        System.out.println("mem.pw = " + mem.pw);
        System.out.println("mem.name = " + mem.name);
        System.out.println("mem.age = " + mem.age);
        System.out.println("mem.gd = " + mem.gd);
        System.out.println("mem.hobby = " + mem.hobby);

        mem.id = "user02";
        mem.pw = "pass02";
        mem.name = "강해린";
        mem.age = 17;
        mem.gd = '여';
        mem.hobby = new String[]{"축구", "야구", "배구"};   //>> 위에처럼 변수 선언
                                                        //노가다 안 뛰고 편하게 할 수 있다 이말이야

        System.out.println("변경 후 mem.id = " + mem.id);
        System.out.println("변경 후 mem.pw = " + mem.pw);
        System.out.println("변경 후 mem.name = " + mem.name);
        System.out.println("변경 후 mem.age = " + mem.age);
        System.out.println("변경 후 mem.gd = " + mem.gd);
        System.out.print("변경 후 mem.hobby = ");

        for(int i = 0; i < mem.hobby.length; i++){
            System.out.print(mem.hobby[i] + " ");
        }
        System.out.println();

    }









}











