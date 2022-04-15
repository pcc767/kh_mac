package com.kh.Polymorphism.poly_abstract;

public class TeslaModel3 extends Car{

    public TeslaModel3(int cc) {
        super(175);
    }

    @Override
    public void oiling() {
        System.out.println("기름 안먹습니다.");
    }

    @Override
    public void move() {
        System.out.println("(조용히)위이이이이이잉~~~");
    }


}
