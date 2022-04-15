package com.kh.Polymorphism.poly_example;

public class Grandure extends Car{

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

    public void grandureNickName(){
        System.out.println("각그렌저");
    }

}
