package com.kh.Polymorphism.poly_interface;

public class _Run {
    public static void main(String[] args) {

        Car[] carArrays = new Car[5];
        carArrays[0] = new Avante();
        carArrays[1] = new Sonata();
        carArrays[2] = new Grandure();
        carArrays[3] = new BMW_M5();
        carArrays[4] = new TeslaModel3();


        for(int i=0; i< carArrays.length; i++) {
            printCar(carArrays[i]);
        }

    }

    private static void printCar(Car carArray) {
        System.out.println(carArray.toString());

        carArray.oiling();
        carArray.move();

        if(carArray instanceof HyundaiCar){
            ((HyundaiCar)carArray).nickName();
            ((HyundaiCar)carArray).service();
        }

        if(carArray instanceof BMW_M5){
            ((BMW_M5)carArray).doc3sa();
        }

        if(carArray instanceof TeslaCar){
            ((TeslaCar)carArray).buyBitCoin();
        }

        if(carArray instanceof OverseasType){
            ((OverseasType)carArray).origin();
        }

        if(carArray instanceof ElectricType){
            ((ElectricType)carArray).charge();
        }

        System.out.println("-------------------------------\n");


    }
}
