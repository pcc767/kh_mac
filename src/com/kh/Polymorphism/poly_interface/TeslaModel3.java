package com.kh.Polymorphism.poly_interface;

public class TeslaModel3 extends TeslaCar implements ElectricType, OverseasType {

    public TeslaModel3() {
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

    @Override
    public void buyBitCoin() {
        System.out.println("1 비트코인으로 구매합니다.");
    }


    @Override
    public void charge() {
        System.out.println("전기차를 충전합니다.");
        System.out.println("충전까지 1시간 남았습니다.");
    }

    @Override
    public void origin() {
        System.out.println("Made in china");
    }
}
