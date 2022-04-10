package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {

    public int SIZE = 10;
    Member[] m = new Member[SIZE];

    public int existMemberNum(){
        int currentMem = 0;
        for(int i = 0; i<currentMem; i++) {
            if(this.m[i] != null){
                currentMem++;
            }
        }
        return currentMem;
    }

    public boolean checkedId(String inputId) {
        boolean current = false;
        for(int i=0; i<m.length; i++){

        }
    }






}
