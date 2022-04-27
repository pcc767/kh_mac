package com.kooki.chap01_poly.controller;

import com.kooki.chap01_poly.model.vo.AniBook;
import com.kooki.chap01_poly.model.vo.Book;
import com.kooki.chap01_poly.model.vo.CookBook;
import com.kooki.chap01_poly.model.vo.Member;

import java.util.Arrays;

public class LibraryController {

    private Member mem = null;
    Book[] bList = new Book[5];

    {
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN",true);
        bList[1] = new AniBook("탑의 신", "소고기", "내이놈",17);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan",12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학",false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책",true);
    }

    public void insertMember(Member mem) {
        this.mem = mem;
    }

    public Member myInfo() {
        return this.mem;
    }

    public Book[] selectAll(){
        return bList;
    }

    public Book[] searchBook(String keyword) {

        Book[] tempBooks = new Book[5];
        int count = 0;

        for(int i=0; i< bList.length; i++){
            if(bList[i].getTitle().contains(keyword)) {
                tempBooks[count] = bList[i];
                count++;
            }
        }

        Book[] neoBooks = new Book[count];
        neoBooks = Arrays.copyOf(tempBooks,count);

        return neoBooks;
    }

    public int rentBook(int index){
        int result = 0;

        if(bList[index] instanceof AniBook){
            if(((AniBook)bList[index]).getAccessAge() > mem.getAge())
                result = 1;
        }

        if(bList[index] instanceof CookBook){
            if(((CookBook)bList[index]).isCoupon()) {
                mem.setCouponCount(mem.getCouponCount() + 1);
                result = 2;
            }
        }

        return result;

    }

}
