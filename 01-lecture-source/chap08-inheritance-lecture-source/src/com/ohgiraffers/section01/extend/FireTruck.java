package com.ohgiraffers.section01.extend;

public class FireTruck extends Car {

    public FireTruck(){

        super();        //부모의 기본 생성자를 호출해줌.
                        // + 자식 클래스에선 super 이거 써줘야댐.

        System.out.println("소방차 클래스 기본 생성자 호출됨...");
    }

    @Override
    public void soundHorn() {

       // super.soundHorn();

        if(isRunning()) {

            System.out.println("애애애애앵애ㅐㅐㅐ애애애애앵");
        }else{
            System.out.println("소방차가 앞으로 갈 수 없습니다. 길을 비켜주십시오!");
        }
    }

    public void sprayWater(){

        System.out.println("화재가 발생한 곳을 발견하여 물을 뿌리겠습니다.====================");
    }


}
