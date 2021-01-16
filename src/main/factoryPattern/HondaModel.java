package com.lawshiga.factoryPattern;

public class HondaModel implements CarModel{
    @Override
    public String getColor() {
        return "BLUE";
    }

    @Override
    public void getCar(){
        System.out.println("Honda :2020");
    }
}
