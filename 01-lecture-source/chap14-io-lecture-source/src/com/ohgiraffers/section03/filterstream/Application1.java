package com.ohgiraffers.section03.filterstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Application1 {

    public static void main(String[] args) {
        /*
        * java.io 패키지의 입출력 스트림 >> 기본 스트림과 필터 스트림으로 분류
        * 기본 스트림 : 외부 데이터에 직접 연결되는 스트림
        * 필터 스트림 : 외부 데이터에 직접 연결이 아닌 기본 스트림에 추가로 사용할 수 있는 스트림
        * > 주로 성능을 향상시키는 목적으로 사용함.
        *
        */

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("src/com/ohgiraffers/section03/filterstream/testBuffered.txt"));

            bw.write("안녕하세요.\n");
            bw.write("반갑습니다.\n");

            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
