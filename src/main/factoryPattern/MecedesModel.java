package com.lawshiga.factoryPattern;

public class MecedesModel implements CarModel{
    @Override
    public String getColor() {
        return "BLACK";
    }

    @Override
    public void getCar(){
        System.out.println("Mercedes :2019");
    }
}
