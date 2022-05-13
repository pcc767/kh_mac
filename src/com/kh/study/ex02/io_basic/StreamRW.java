package com.kh.study.ex02.io_basic;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class StreamRW {

    public static void main(String[] args) {
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;

        try{
            isr = new InputStreamReader(System.in);
            osw = new OutputStreamWriter(System.out);

            osw.append("문자열을 입력해 주세요 : ");
            osw.flush();

            //문자열 읽어오는 부
            char[] temp = new char[10];
            int size = isr.read(temp);

            osw.append("Read size : "+size+"\n");
            osw.append(String.valueOf(temp)+"\n");
            osw.append(Arrays.toString(temp));

            osw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                osw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
