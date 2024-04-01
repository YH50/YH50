package com.ohgiraffers.section01.init;

public class Application {

    public static void main(String[] args) {


        /*
         * 객체 배열에 대해 이해할 수 있다.
         *
         * "객체 배열" >> 레퍼런스 변수에 대한 배열
         *  생성한 인스턴스도 배열을 이용하여 관리하면
         *  동일한 타입의 여러 인스턴스를 각각 취급하지 않고 연속으로 처리할 수 있어서 유용함.
         *  또한 반환값은 1개의 값만 반환할 수 있기 때문에
         *  동일한 타입의 여러 인스턴스를 반환해야 하는 경우 객체 배열을 이용할 수 있다.
         *  */

        Car c1 = new Car("맥라렌", 280);   //선언과 동시에 초기화
        Car c2 = new Car("부가티", 400);
        Car c3 = new Car("페라리", 300);
        Car c4 = new Car("그돈씨", 240);
        Car c5 = new Car("과학5호기", 500);

        c1.driverMaxSpeed();
        c2.driverMaxSpeed();
        c3.driverMaxSpeed();
        c4.driverMaxSpeed();
        c5.driverMaxSpeed();
        System.out.println();

        Car[] carArray = new Car[5];    // car 타입의 인스턴스 보관소 5칸 확보

        carArray[0] = new Car("사인스", 280);
        carArray[1] = new Car("베르스타펜", 400);
        carArray[2] = new Car("피아스트리", 300);
        carArray[3] = new Car("알론소", 240);
        carArray[4] = new Car("르끌레르", 500);

        for(int i = 0; i < carArray.length; ++i){
            carArray[i].driverMaxSpeed();
        }
        System.out.println();

        Car[] carArray2 = {

                new Car("사인스", 280),
                new Car ("마티즈", 200),
                new Car ("소나타", 300),
                new Car ("아반떼", 260),
                new Car ("그랜저", 270),
        };




    }

}
