package com.kh.hw2.member.controller;

import com.kh.hw2.member.model.vo.Member;

import java.util.Arrays;

public class MemberController {

    private Member[] memberArrays = new Member[MAX_SIZE];
    public static int MAX_SIZE = 10;
    private int size = 0;       //현재 배열의 크기를 저장하는 변수

    //현제 데이터가 있는 멤버의 수
    public int existMemberNum(){
        return size;
    }

    private int searchIdForIndex(String id){
        for(int i=0; i<size; i++){
            if(memberArrays[i].getId().equals(id))
                return i;
        }
        return -1;
    }

    public boolean checkId(String inputId) {
        int index = searchIdForIndex(inputId);
        if(index >= 0)
            return true;
        else
            return false;
    }

    public Member searchId(String inputId){
        int index = searchIdForIndex(inputId);
        if(index >= 0)
            return memberArrays[index];
        else
            return null;
    }

    public Member[] searchName(String name) {
        Member[] tempArrays = new Member[size];
        int count = 0;
        for(int i=0; i<size; i++){
            if(memberArrays[i].getName().equals(name))
                tempArrays[count++] = memberArrays[i];
        }
        return Arrays.copyOf(tempArrays, count);
    }

    public Member[] searchEmail(String email) {
        Member[] tempArrays = new Member[size];
        int count = 0;
        for(int i=0; i<size; i++){
            if(memberArrays[i].getEmail().equals(email))
                tempArrays[count++] = memberArrays[i];
        }
        return Arrays.copyOf(tempArrays, count);
    }

    public void insertMember(Member member) {
        if(size+1 >= MAX_SIZE){
            MAX_SIZE = MAX_SIZE*2;
            memberArrays = Arrays.copyOf(memberArrays, MAX_SIZE);
        }
        memberArrays[size++] = member;
    }

    // 검색한 사람을 삭제하고 배열을 땡기는 코드
    public boolean delete(String id){
        int index = searchIdForIndex(id);
        if(index == -1)
            return false;

        for(int i=index; i<size-1; i++){
            memberArrays[i] = memberArrays[i+1];
        }
        memberArrays[size-1] = null;
        size--;
        return true;
    }

    public void delete() {
        MAX_SIZE = 10;
        size = 0;
        memberArrays = new Member[MAX_SIZE];
    }

    public boolean updatePassword(String id, String password) {
        int index = searchIdForIndex(id);
        if(index == -1)
            return false;
        memberArrays[index].setPassword(password);
        return true;
    }

    public boolean updateName(String id, String name){
        int index = searchIdForIndex(name);
        if(index == -1)
            return false;
        memberArrays[index].setName(name);
        return true;
    }

    public boolean updateEmail(String id, String email){
        int index = searchIdForIndex(email);
        if(index == -1)
            return false;
        memberArrays[index].setEmail(email);
        return true;
    }

    public Member[] printAll(){
        return Arrays.copyOf(memberArrays,size);

    }




}
