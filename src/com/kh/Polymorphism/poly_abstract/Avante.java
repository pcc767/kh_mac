package com.kh.Polymorphism.poly_abstract;

public class Avante extends HyundaiCar {

    public Avante(){
        super(1600);
    }

    @Override
    public void oiling() {
        System.out.println("휘발유 주유중입니다..");
    }

    @Override
    public void nickName() {
        System.out.println("아방이.");
    }

}
