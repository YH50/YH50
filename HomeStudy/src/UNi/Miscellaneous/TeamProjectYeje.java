package UNi.Miscellaneous;

import java.util.Scanner;

public class TeamProjectYeje {

    public void yejeNextIfElseIfStatement(){

        //볼 스피드 별로 등급 나누기

        Scanner sc = new Scanner(System.in);
        System.out.print("선수 이름 입력 : ");
        String name = sc.nextLine();
        System.out.print("선수 구속 입력 : ");
        int point = sc.nextInt();
        String grade = "";

        if(point >=150 && point <=160){
            System.out.println("등급 : 국가대표");
        }else if(point >=155){
            System.out.println("등급 : 메이저리거");
        }
        if(point >= 140 && point < 150){
            System.out.println("등급 : 주전");
        }else if(point >=145) {
            System.out.println("등급 : 에이스");
        }
        if(point >= 130 && point < 140){
            System.out.println("등급 : 4-5선발");
        }else if(point >=135) {
            System.out.println("등급 : 레귤러");
        }
        else{
             System.out.println("등급 : 퓨쳐스");
        }

      System.out.println(name + " 선수의 구속은 " + point + "km/h이고, 등급은 " + grade + "입니다.");
      System.out.println("프로그램을 종료합니다.");
   }


        









    }




}
