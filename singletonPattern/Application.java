package com.lawshiga.singletonPattern;

public class Application {
    public static void main(String args[]) {
        Printer printerInstance = Printer.getPrinter();
        System.out.println(printerInstance);

        Printer printerInstance1 = Printer.getPrinter();
        System.out.println(printerInstance1);
    }
}
