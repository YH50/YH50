package com.ohgiraffers.section03.dto;

public class MemberDTO {

    private int no;     //회원 번호

    private String name;       //회원 이름

    private int age;    //회원의 나이
    private char gd;    //성별
    private double height;  //키

    private boolean isActivated;    //회원 탈퇴(활성화) 여부

    /*
     *  설정자(setter)/접근자(getter)의 경우 실무에서 암묵적으로 통용되는 작성 규칙이 존재한다.
     *  설정자(setter) 작성 규칙
     *  : 필드값을 변경할 목적의 매개변수를 변경하려는 필드와 같은 자료형으로 선언하고
     *    호출 당시 전달되는 매개변수의 값을 이용하여 필드의 값을 변경한다.
     *  [표현식]
     *  public void set필드명(매개변수) {  //호출해서 값 넣어줘야 하기 때문에 매개변수 필수
     *      필드 = 매개변수;
     *  }
     *  [작성예시]
     *  public void setName(String name) {
     *      this.name = name;
     *  }
     * */

    /*
     *  접근자(getter) 작성 규칙
     *  : 필드의 값을 반환받을 목적의 메소드 집함을 의미한다.
     *    각 접근자는 하나의 필드에만 접근하도록 한다.
     *    필드에 접근해서 기록된 값을 return을 이용하여 반환하며,
     *    이 때 반환타입은 반환하려는 값의 자료형과 일치시킨다.
     *  [표현식]
     *  public 반환형 get필드명() {
     *      return 반환값;
     *  }
     *  [작성예시]
     *  public void getName() {
     *      return this.name;
     *  }
     * */

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGd(char gd) {
        this.gd = gd;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;    //boolean은 this가 아니라 is~ 형태로 표시함.
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGd() {
        return gd;
    }

    public double getHeight() {
        return height;
    }

    //여기도 마찬가지로 boolean의 접근자는 get 시작이 아닌 is~ 형태 시작이 일반적인 관례.
    public boolean isActivated() {
        return isActivated;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gd=" + gd +
                ", height=" + height +
                ", isActivated=" + isActivated +
                '}';
    }
}
