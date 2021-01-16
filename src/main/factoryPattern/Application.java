package com.lawshiga.factoryPattern;

public class Application {

    public static void main(String args[]) {
        CarModel carModel1 = CarFactory.getCarModel(ModelCode.HONDA);
        System.out.println(carModel1.getColor());
        carModel1.getCar();

    CarModel carModel2 = CarFactory.getCarModel(ModelCode.TATA);
        System.out.println(carModel2.getColor());
        carModel2.getCar();
    }
}
