package com.kh.study.ex02.io_basic;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamIO {

    // Stream?
    //  : Binary(이진) 데이터를 다루는 Stream = 1Byte씩 처리 가능.
    //  : 활용 - 이미지나 동여상 파일, 네트워크, 프로그램간 데이터 전송.

    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;

         try{
             // 도입부
             is = System.in;
             os = System.out;

             // 동작부
             System.out.print("숫자를 입력해 주세요 : ");
             int read = is.read();
             os.write(read);    // write는 실제 쓰기를 보장하지 않는다.
             os.flush();        // write 도중 중간에 데이터를 강제로 밀어냐야할때 명시적으로 사용

         } catch (IOException e) {
             e.printStackTrace();
         } finally {
             try {
                 is.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }

             try {
                 os.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }

         }
    }

}
