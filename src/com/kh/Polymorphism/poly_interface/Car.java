package com.kh.Polymorphism.poly_interface;

public abstract class Car {

    protected int cc = 0;

    public Car(int cc) {
        this.cc = cc;
    }

    public void oiling(){
        System.out.println("주유중입니다..");
    }

    public void move(){
        System.out.println("부릉부릉..");
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Name : "+ this.getClass().getSimpleName());
        sb.append(", cc : "+cc);
        return sb.toString();
    }
}
