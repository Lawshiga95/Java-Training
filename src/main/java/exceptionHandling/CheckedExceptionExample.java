package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {

    public static void main(String args[]) throws IOException {

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try{
            fileReader = new FileReader("C:\text.txt");
        } catch(FileNotFoundException exc){
            exc.printStackTrace();
        }
        try{
            bufferedReader = new BufferedReader(fileReader);
            for(int i=0; i<10; i++) {
                System.out.println(bufferedReader.readLine());
            }
        } catch(IOException exc) {
            System.out.println("I/O error occurred :" + exc);
        }

    }
}
