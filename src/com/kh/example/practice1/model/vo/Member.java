package com.kh.example.practice1.model.vo;

public class Member {

    private String member;
    private String memberPwd;
    private String memberName;
    private int age;
    private char gender;
    private String phone;
    private String email;

    public Member(){

    }

    public void changeName(String memberName){
        this.memberName = memberName;
    }

    public String printName() {
        return memberName;
    }


}
