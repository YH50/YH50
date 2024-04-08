package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application3 {

    public static void main(String[] args) {

        /*
        * 외부 데이터로부터 읽어오는 데이터를 바이트형 정수, 문자, 문자열로만 읽어오는 등
        * 여러 데이터 타입을 취급하는 경우에는 별도로 처릴르 해 주어야 한다.
        *
        * ex) 정수를 입력받아 처리를 하려면 parsing 처리를 해야함.
        * */

        /*
        * 데이터 자료형 별로 처리하는 기능이 추가된 보조스트림을 제공하고 있음.
        * >> DataInputStream/ DataOutputStream
        * */

        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream("src/com/ohgiraffers/section03/filterstream/score.txt"));

            dos.writeUTF("홍길동");
            dos.writeInt(95);
            dos.writeChar('A');
            dos.writeUTF("이순신");
            dos.writeInt(88);
            dos.writeChar('B');
            dos.writeUTF("뉴진스");
            dos.writeInt(77);
            dos.writeChar('S');

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(dos != null) {
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        DataInputStream dis = null;

        try {
            dis = new DataInputStream(new FileInputStream("src/com/ohgiraffers/section03/filterstream/score.txt"));

            while(true){
                //순서대로 읽어와야 에러가 발생하지 않음
                System.out.println(dis.readUTF() + ", " + dis.readInt() + ", " + dis.readChar());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
            /* 파일 읽기 완료 찍기 > 캐치 하나 더 만들어줘야함 */
        catch (EOFException e){
            System.out.println("파일 읽기 완료");
        }
        catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(dis != null){
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
