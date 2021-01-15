package exceptionHandling;

public class UnCheckedExceptionExample {

    public static void main(String args[]){
        int a = 10;
        int b = 0;
        try {

            int c = a/b;
        }
        catch(IllegalCalculationException exc) {
            exc.printStackTrace();
        }
    }
}
