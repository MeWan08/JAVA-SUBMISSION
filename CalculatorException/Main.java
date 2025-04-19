/*
Name: Kartik Mehta
PRN: 23070126056
Batch: AIML A3
*/

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class contains the main method to run the calculator application.
 * It handles user input, displays the menu, and calls appropriate operations.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nCalculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square");
            System.out.println("6. Cube");
            System.out.println("7. Square Root");
            System.out.println("8. Exit");
            System.out.print("Enter your choice (1-8): ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over

                switch (choice) {
                    case 1:
                        performAddition(scanner);
                        break;
                    case 2:
                        performSubtraction(scanner);
                        break;
                    case 3:
                        performMultiplication(scanner);
                        break;
                    case 4:
                        performDivision(scanner);
                        break;
                    case 5:
                        performSquare(scanner);
                        break;
                    case 6:
                        performCube(scanner);
                        break;
                    case 7:
                        performSquareRoot(scanner);
                        break;
                    case 8:
                        exit = true;
                        System.out.println("Exiting the calculator. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a number between 1 and 8.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric choice between 1 and 8.");
                scanner.nextLine(); // Clear the invalid input
            }
        }
        scanner.close();
    }

    private static void performAddition(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            double result = CalculatorOperations.add(num1, num2);
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values.");
            scanner.nextLine();
        }
    }

    private static void performSubtraction(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            double result = CalculatorOperations.subtract(num1, num2);
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values.");
            scanner.nextLine();
        }
    }

    private static void performMultiplication(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            double result = CalculatorOperations.multiply(num1, num2);
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values.");
            scanner.nextLine();
        }
    }

    private static void performDivision(Scanner scanner) {
        try {
            System.out.print("Enter dividend: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter divisor: ");
            double num2 = scanner.nextDouble();
            double result = CalculatorOperations.divide(num1, num2);
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values.");
            scanner.nextLine();
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void performSquare(Scanner scanner) {
        try {
            System.out.print("Enter a number: ");
            double num = scanner.nextDouble();
            double result = CalculatorOperations.square(num);
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.nextLine();
        }
    }

    private static void performCube(Scanner scanner) {
        try {
            System.out.print("Enter a number: ");
            double num = scanner.nextDouble();
            double result = CalculatorOperations.cube(num);
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.nextLine();
        }
    }

}