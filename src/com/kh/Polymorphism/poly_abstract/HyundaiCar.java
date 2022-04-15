package com.kh.Polymorphism.poly_abstract;

public abstract class HyundaiCar extends Car{

    public HyundaiCar(int cc) {
        super(cc);
    }

    public String serviceName = "블루헨즈";

    abstract public void nickName();

    public void service(){
        System.out.println(serviceName+"블루헨즈로 출발합니다..");
    }




}
