package com.ohgiraffers.section01.method;

public class Application9 {

    public static void main(String[] args) {

        /* 수업 목표 : 다른 클래스에 작성한 메소드를 호출할 수 있다. */
        /* 다른 클래스에 작성한 메소드 호출 */

        /* 최댓값, 최솟값을 비교할 두 정수를 변수로 선언 */
        int x = 100;
        int y = 50;

        /* non-static 메소드의 경우
        * >> 클래스가 다르더라도 사용하는 방법은 동일함.
        * 클래스명, 사용할 이름 = new 클래스명();        ///중요하니까 계속 보고 이해하세요
        * 사용할 이름.메소드명();
        * */

        Calculator cal = new Calculator();
        int min = cal.minNumOf(x, y);

        System.out.println("두 수 중 최솟값은? : " + min);

        /* static 메소드인 경우 */
        /* 다른 클래스에 작성한 static 메소드의 경우 호출 시 클래스명을 "MUST" 명시해줘야 함.
        * 클래스명, 메소드명();
        * */
        //int max = maxNumOf(x, y);   //클래스명 생략하면 에러 발생.
        int max = Calculator.maxNumOf(x, y);    //static > 클래스명 가져오고 method 가져오기

        System.out.println("두 수 중 최댓값은? : " + max);
        /*
        * static 메소드는 non-static 메소드처럼 호출은 되지만 권장사항은 아님.
        * WHY? >> 이미 메모리에 로딩되어있는 static 메소드는 여러 객체가 공유하게 되기 때문.
        * 이 때 객체로 접근하게 되면 인스턴스가 가진 값으로 공유된 값에
                예상치 못하는 동작을 유발할 수 있기 때문에 사용을 제한해달라는 경고가 뜨는데, 시스템이 복잡할수록 유지보수에 악영향을 줌.
        * */

        int max2 = cal.maxNumOf(x, y);      //이게 non-static 메소드 호출 방식.

    }
}
