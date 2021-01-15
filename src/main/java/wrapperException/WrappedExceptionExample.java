package wrapperException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WrappedExceptionExample {

    public static void main(String args[]) {

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try{
            fileReader = new FileReader("C:\text.txt");
        } catch(FileNotFoundException exc){
            throw new CustomRuntimeException("File not exit or not found");
        }
        try{
            bufferedReader = new BufferedReader(fileReader);
            for(int i=0; i<10; i++) {
                System.out.println(bufferedReader.readLine());
            }
        } catch(IOException exc) {
            throw new CustomRuntimeException("I/O error occured");
        }

    }
}
