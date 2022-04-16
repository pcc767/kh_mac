package com.kh.practice.chap01.poly.model.vo;

public class AniBook extends Book{

    private int accessAge;

    public AniBook(){}

    public AniBook(String title, String author, String publish, int accessAge){
        super(title,author,publish);
        this.accessAge = accessAge;
    }

    public int getAccessAge() {
        return accessAge;
    }

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }

    @Override
    public String toString() {
        return "AniBook{" +
                "accessAge=" + accessAge +
                '}';
    }



}
