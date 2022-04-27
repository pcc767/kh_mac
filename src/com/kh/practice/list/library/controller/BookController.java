package com.kh.practice.list.library.controller;


import com.kh.practice.list.library.model.vo.Book;

import java.util.*;

public class BookController {

    List<Book> list = new ArrayList<>();

    public BookController(){
        list.add(new Book("자바의 정석", "낭궁성", "기타", 20000));
        list.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
        list.add(new Book("대화의 기술", "강보람", "인문", 17500));
        list.add(new Book("암 정복기", "박신우", "의료", 21000));
    }

    public void insertBook(Book bk){
        list.add(bk);

    }

    public ArrayList selectList(){
        return (ArrayList) list;
    }

    public ArrayList searchBook(String keyword){
        ArrayList<Book> searchList = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getTitle().contains(keyword))
                searchList.add(list.get(i));
        }
        return searchList;
    }

    public boolean deleteBook(String title, String author){
        Book removeBook = null;
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getTitle().contains(title)) {
                if (list.get(i).getAuthor().contains(author))
                    list.remove(i);
                return true;
            }
        }
        return false;
    }

    public int ascBook(){

        list.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                int result = o1.getTitle().compareTo(o2.getTitle());
                return result;
            }
        });
        return 1;
    }


}
