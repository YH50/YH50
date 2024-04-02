package com.ohgiraffers.section01.polymorphism;

public class Application1 {

    public static void main(String[] args) {

        /* 수업 목표 : 다형성과 형변환에 대해 이해할 수 있다. */
        /*
        * 다형성이란?
        * >> 하나의 인스턴스가 여러 가지 타입을 가질 수 있는 것을 의미함.
        * >>> 하나의 타입으로 여러 타입의 인스턴스를 처리할 수 있기도 하고
        *     하나의 메소드 호출로 객체별로 각기 다른 방법으로 동작할 수 있다.
        * */

        /*
        * 다형성 : 객체 지향 프로그래밍의 3대 특징 (캡슐화, 상속, 다형성) 중 하나 ( 추상화까지 하면 4대 특징)
        * 객체 지향 프로그램의 꽃이라고 불러올 정도로 활용성이 높고 장점이 많다.
        * BUT 학습하기가 어렵다는 단점.
        * */

        /*
        * 다형성의 장점
        * 1. 여러 타입의 객체를 하나의 타입으로 관리할 수 있기 때문에 유지보수성과 생산성이 증가함.
        * 2. 상속을 기반으로 한 기술이기 때문에 상속관계에 있는 모든 객체는 통일된 메시지를 수신할 수 있다.
        *     이러한 통일된 메시지를 수신받아 처리하는 내용을 객체별로 다르게 할 수 있다는 장점이 있음.
        *   ( 다양한 기능을 사용하는 데 있어서 관리해야할 메시지 종류가 줄어들게 된다.)
        *   "하나의 호출로 여러가지 동작을 수행할 수 있다는 점" 에서 오버라이딩을 다형성 측면으로 보기도 함.
        *                                                   >> 다형성 이해하기 위한 가장 좋은 예시
        *                                        BUT 이견이 많아 다형성을 이해하는데 참고로만 활용할 것.
        * 3. 확장성이 좋은 코드를 작성할 수 있음.
        * 4. 결합도를 낮춰 유지보수성을 증가시킬 수 있음.
        * */
//        *****************************************************************************************

        /* 1. Animal, Rabbit, Tiger 클래스를 만들기. */

        /* 2. Animal 인스턴스 생성 후 메소드 호출 확인하기 */
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();
        System.out.println("==========================================");

        /* 3. 토끼 인스턴스 생성 후 메소드 호출 확인하기 */
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();
        System.out.println("==========================================");

        /* 4. 호랑이 인스턴스 생성 후 메소드 호출 확인하기 */
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();
        System.out.println("==========================================");

        /* 5. 부모 타입으로 자식 인스턴스 주소값 저장 */

        Animal a1 = new Rabbit();
        Animal a2 = new Tiger();

        /* 6. 동적 바인딩 확인 */
        /* 동적 바인딩이란?
        *  >> 컴파일 당시에는 해당 타입의 메소드와 연결돼있다가
        *   런타임 당시의 실제 객체가 가진 오버라이딩된 메소드로 바인딩이 바뀌어서 동작하는 것을 의미함.*/

        a1.cry();
        a2.cry();

//        a1.jump();
//        a2.bite();        >> 모두 에러남. (상속되지 않은 값이기 떄문)

        /* 7. 타입형 변환 */
        System.out.println("====================타입 형 변환 확인============================");
        ((Rabbit)a1).jump();
        ((Tiger)a2).bite();

//        ((Tiger)a1).bite();         // 코드 작성 시엔 오류가 없으나 실행 시 오류 발생
                                // > 토끼는 호랑이가 될 수 없다..!

        /* 8. instanceof 연산자 사용 확인 */
        System.out.println("==========instanceof=================");
        System.out.println("a1이 Tiger 타입인지 확인 : " + (a1 instanceof Tiger));
        System.out.println("a1이 Rabbit 타입인지 확인 : " + (a1 instanceof Rabbit));
        System.out.println("a1이 Animal 타입인지 확인 : " + (a1 instanceof Animal));
        System.out.println("a1이 Object 타입인지 확인 : " + (a1 instanceof Object));

        if(a1 instanceof Rabbit){
            ((Rabbit)a1).jump();
        }
        if(a1 instanceof Tiger){
            ((Tiger)a1).bite();
        }
        /* 9. 클래스의 업캐스팅, 다운캐스팅 */

        /*
        * 클래스 형변환 : up, down casting으로 구분할 수 있다.
        * 업캐스팅 : 상위 타입으로의 형변환
        * 다운캐스팅 : 하위 타입으로의 형변환
        * 또한 작성 여부에 따라 명시적, 묵시적 두 가지로도 구분할 수 있음.
        * */


        Animal animal1 = new Rabbit();  // 업캐스팅의 묵시적 형 변환
        Animal animal2 = (Animal) new Rabbit();     //업캐스팅의 명시적 형변환

        Rabbit rabbit1 = (Rabbit) animal1;  //다운캐스팅의 명시적 형변환
        // Rabbit rabbit2 = animal2;   >> 다운캐스팅의 묵시적 형변환 불가능







    }

}
