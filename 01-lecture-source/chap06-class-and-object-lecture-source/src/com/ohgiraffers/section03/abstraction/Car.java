package com.ohgiraffers.section03.abstraction;

public class Car {      //기능을 수행할 객체

    private boolean isOn;   // 초기 시동이 꺼진 상태(false)

    private int speed;


    /* 시동이 걸려있는 상태인 경우 어떠한 동작도 일어나지 않고
        시동이 걸려있지 않은 경우 시동을 건다. */

    public void startUp(){      //시동걸기

       if(isOn){
           System.out.println("이미 시동이 걸려 있습니다.");
       }else{

           this.isOn = true;
           System.out.println("시동을 걸었습니다. 출발할 준비가 완료되었습니다.");
       }

    }

    public void go(){       //악셀밟기
        if(isOn){
            System.out.println("차가 앞으로 움직입니다.");
            this.speed += 10;
            System.out.println("현재 주행 속도는 " + this.speed + "km/h 입니다.");
        }else{      //isOn인 상태가 아니라면?
            System.out.println("차의 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.");
        }
    }

    public void stop(){     //브레이크 밟기
        if(isOn) {
            if (this.speed > 0) {
                this.speed = 0;
                System.out.println("브레이크를 밟았습니다. 차를 멈춥니다.");
            } else {    //이미 speed = 0인 상태라면?
                System.out.println("차가 멈춰있는 상태입니다.");
            }
        }else{  //isOn인 상태도 아니라면?
            System.out.println("차의 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.");
        }
    }

    public void off(){      //시동 끄기
        if (isOn){
            if(speed > 0){
                System.out.println("달리는 중 시동을 끌 수 없습니다. 차량을 정차해주세요.");
            }else{      //달리고 있지 않는 상태라면?
                this.isOn = false;
                System.out.println("시동을 끄겠습니다. 다시 운행하려면 시동을 걸어주세요.");
            }
        }else{      //isOn인 상태도 아니라면?
            System.out.println("이미 시동이 꺼져 있습니다. 시동 상태를 확인해주세요.");
        }
    }




}
