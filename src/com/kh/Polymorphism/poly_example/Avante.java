package com.kh.Polymorphism.poly_example;

public class Avante extends Car{

    public Avante(){
        super(1600);
    }

    @Override
    public void oiling() {
        System.out.println("휘발유 주유중입니다..");
    }

    public void avanteNickName(){
        System.out.println("아방이.");
    }
}
