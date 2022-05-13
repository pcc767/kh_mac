package com.kh.study.ex02.io_basic;

import java.io.*;


public class FileCopy2_1 {

    public static void main(String[] args) throws IOException {

        File file = new File("//Users/kooki/Documents/newfile.txt");
        if(!file.exists())
            file.createNewFile();
    }

}


