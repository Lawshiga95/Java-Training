package exceptionHandling;

public class IllegalCalculationException extends RuntimeException{

    public IllegalCalculationException () {
        super("Cannot perform division by zero");
    }
}
