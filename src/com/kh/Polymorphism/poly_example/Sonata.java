package com.kh.Polymorphism.poly_example;

public class Sonata extends Car{
    public Sonata() {
        super(2000);
    }

    @Override
    public void oiling() {
        System.out.println("휘발유 주유중입니다..");
    }

    @Override
    public void move() {
        System.out.println("소나타가 부르르르르릉~~");
    }

    public void sonataNickName(){
        System.out.println("소나 타는 차");
    }
}
