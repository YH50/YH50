package com.ohgiraffers.section02.superkeyword;

public class Application {

  /* 수업 목표 : super와 super()에 대해 이해할 수 있다.*/

  /* super : 자식 클래스를 이용해서 객체를 생성할 때 부모 생성자를 호출하여
  부모 클래스의 인스턴스도 함께 생성하게 되는데 이때 생성한 부모의 인스턴스 주소를
  보관하는 래퍼런스 변수로 자식 클래스내의 모든 생성자와 메소드 내에서 선언하지 않고도
  사용할 수 있는 레퍼런스 변수를 super 라고 한다. */
  /* super() : 부모 생성자를 호출하는 구문으로 인자와 매개변수 타입, 개수, 순서가 일치하는 부모 생성자를 호출하게 된다.
      this() 가 해당 클래스 내에 다른 생성자를 호출하는 구문이라면 super()는 부모 클래스가 가지는 생성자를 제외한
            나머지 생성자를 호출할 수 있도록 하는 구문이다.

}
