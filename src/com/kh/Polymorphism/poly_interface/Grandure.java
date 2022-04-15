package com.kh.Polymorphism.poly_interface;

public class Grandure extends HyundaiCar {

    public Grandure() {
        super(3000);
    }

    @Override
    public void oiling() {
        System.out.println("휘발유 주유중입니다..");
    }

    @Override
    public void move() {
        System.out.println("(조용히)부르르르르릉!!");
    }

    @Override
    public void nickName() {
        System.out.println("각그렌저");
    }
}
