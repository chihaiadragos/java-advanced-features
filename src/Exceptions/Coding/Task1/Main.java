package Exceptions.Coding.Task1;
public class Main {

    public static void main(String[] args) {


        try {
            double result = divide(10, 2);
            System.out.println("Result: " + result);

            result = divide(8, 0);
            System.out.println("Result: " + result);
        } catch (CannotDivideByZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double divide(double numerator, double denominator) throws CannotDivideByZeroException {
        if (denominator == 0) {
            throw new CannotDivideByZeroException("Cannot divide by zero");
        }
        return numerator / denominator;
    }

    public static class CannotDivideByZeroException extends Exception {
        public CannotDivideByZeroException(String message) {
            super(message);
        }
    }
}