package com.lawshiga.factoryPattern;

public class JaguarModel implements CarModel{

    protected String carColour;

    @Override
    public String getColor() {
        return "RED";
    }

    @Override
    public void getCar(){
        System.out.println("Jaguar :2020");
    }
}
