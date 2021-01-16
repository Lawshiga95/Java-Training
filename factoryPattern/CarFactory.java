package com.lawshiga.factoryPattern;

public class CarFactory {
    public static CarModel getCarModel(ModelCode modelCode){
        switch (modelCode){
            case HONDA:
                return new HondaModel();
            case TATA:
                return new TataModel();
            case JAGUAR:
                return new JaguarModel();
            case MERCEDES:
                return new MecedesModel();
            default:
                return null;
        }
    }
}
