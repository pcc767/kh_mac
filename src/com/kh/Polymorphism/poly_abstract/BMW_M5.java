package com.kh.Polymorphism.poly_abstract;

public class BMW_M5 extends Car {

    public BMW_M5() {
        super(4500);
    }

    @Override
    public void oiling() {
        System.out.println("고급 휘발유 주유중입니다..");
        System.out.println("휘발유 먹는 하마입니다...!");
    }

    @Override
    public void move() {
        System.out.println("(시끄럽게)부르르르르릉!!");
    }

    public void doc3sa(){
        System.out.println("독일에서 온 차입니다.");
    }

}
