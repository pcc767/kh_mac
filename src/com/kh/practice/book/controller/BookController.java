package com.kh.practice.book.controller;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

import java.io.File;
import java.io.IOException;

public class BookController {

    private BookDAO bd = new BookDAO();

    public void makeFile(){

        File file = new File("book.txt");

        try {
            if(!file.exists())
                file.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void fileSave(Book[] bArr){
        bd.fileSave(bArr);
    }

    public Book[] fileRead(){
        return bd.fileRead();
    }



}
