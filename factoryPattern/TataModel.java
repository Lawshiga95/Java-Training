package com.lawshiga.factoryPattern;

public class TataModel implements CarModel{
    @Override
    public String getColor() {
        return "WHITE";
    }

    @Override
    public void getCar(){
        System.out.println("Tata :2018");
    }
}
