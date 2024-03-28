package com.ohgiraffers.section04.constructor;

public class User {

    private String id;
    private String pw;
    private String name;
    private java.util.Date enrollDate;

    /*
    * 생성자의 작성 위치
    * 작성 위치 : 문법 상으로는 클래스 내부에 작성하면 되지만
    * 통상적으로 필드 선언부와 메소드 선언부 사이에 작성하는 것이 관례적.
    * */

    /*
     *  생성자의 사용 목적
     *  1. 인스턴스 생성 시점에 수행할 명령이 있는 경우 사용한다.
     *  2. 매개변수 있는 생성자의 경우 매개변수로 전달받은 값으로 필드를 초기화하며
     *     인스턴스를 생성할 목적으로 주로 사용된다.
     *  3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않겠다는 의미를 가진다.
     *     >>> 인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용할 수 도 있다. (초기값 전달 강제화)
     * */

    /*
     *  생성자 작성 방법
     *  [표현식]
     *  접근제한자 클래스명(매개변수) {
     *      인스턴스 생성 시점에 수행할 명령 기술 (주로 필드를 초기화)
     *      this.필드명 = 매개변수;		//설정자(setter) 여러 개의 기능을 한 번의 호출로 수행할 수 있다.
     *  }
     * */

    /* 생성자 작성 시 유의할 점*/
    /* 1. 생성자 메소드는 반드시 클래스 이름과 동일해야 한다.
    *     >> 대,소문자 전부 같아야 함.
    *  2. 생성자 메소드는 반환형을 작성하지 않는다. (작성 시 메소드로 인식함)
    * */

    /* 1. 기본 생성자(default constructor) */

    public User(){      //클래스 이름으로 사용한다!!
        /*
        * 수행할 내용이 아무것도 존재하지 않음
        * 호출 확인을 위한 출력 구문만 작성해보기
        * 메소드와 같이 수행할 명령들을 작성할 수 있다.
        * */

        System.out.println("기본 생성자 호출함...");        // 이거 안쓰면 에러남


    }
    /* 주의사항 : 동일한 이름의 생성자 혹은 메소드를 한 클래스 내에서 작성하는 것은 불가능.>>컴파일 에러*/

    //public User(){} >> error

    /* 2. 매개변수가 존재하는 생성자 */
    /* id, pwd, name의 초기화를 담당할 생성자 */

    public User(String id, String pw, String name){
        this.id = id;
        this.pw = pw;
        this.name = name;

        System.out.println("id, pw, name을 초기화하는 생성자 호출됨...");
    }



    public String getinformation() {
        return "User{" +
                "id='" + this.id + '\'' +
                ", pw='" + this.pw + '\'' +
                ", name='" + this.name + '\'' +
                ", enrollDate=" + this.enrollDate +
                '}';
    }
}













