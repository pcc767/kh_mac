package com.kh.Polymorphism.poly_interface;

public abstract class TeslaCar extends Car{

    public TeslaCar(int cc) {
        super(0);
        this.khw = khw;
    }

    protected double khw = 0;

    @Override
    public void move() {
        System.out.println("(거의 무음)위위위잉~~~!!");
    }

    public abstract void buyBitCoin();

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Name : "+ this.getClass().getSimpleName());
        sb.append(", Brand : Tesla");
        sb.append(", kWh : "+ khw);
        return sb.toString();
    }



}
