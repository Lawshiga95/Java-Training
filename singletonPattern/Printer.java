package com.lawshiga.singletonPattern;
//Getting single instance of printer shared by different computers
public class Printer {

    public static volatile Printer printer;

    public static Printer getPrinter(){
        if(printer == null) {
            synchronized (Printer.class) {
                if(printer == null) {
                    printer = new Printer();
                }
            }
        }
        return printer;
    }
}
