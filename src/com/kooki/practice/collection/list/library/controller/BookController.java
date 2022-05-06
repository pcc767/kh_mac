package com.kooki.practice.collection.list.library.controller;

import com.kh.practice.list.library.model.vo.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class BookController {

    ArrayList<Book> list = new ArrayList<>();

    public BookController(){
        list.add(new Book("자바의 정석","남궁성", "기타", 20000));
        list.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
        list.add(new Book("대화의 기술", "강보람", "인문", 17500));
        list.add(new Book("암 정복기", "박신우", "의료", 21000));
    }

    public void insertBook(Book bk){
        list.add(bk);
    }

    public ArrayList<Book> selectList(){
        return list;
    }

    public ArrayList<Book> searchBook(String keyword){
        ArrayList<Book> searchBook = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            Book book = list.get(i);
            if(book.getTitle().contains(keyword))
                searchBook.add(list.get(i));
        }
        return searchBook;
    }

    public Book deleteBook(String title, String author){
        Book removeBook = null;
        for(int i=0; i< list.size(); i++){
            Book book = list.get(i);
            if(book.getTitle().equals(title)) {
                if (book.getAuthor().equals(author))
                    removeBook = list.remove(i);
            }
        }
        return removeBook;
    }

    public int ascBook(){
        list.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        return 1;
    }

}
