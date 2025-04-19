/**
 * This class contains static methods to perform various arithmetic operations.
 * Each method handles specific exceptions and throws them for the caller to catch.
 */
public class CalculatorOperations {

    // Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    // Square
    public static double square(double a) {
        return a * a;
    }

    // Cube
    public static double cube(double a) {
        return a * a * a;
    }
}