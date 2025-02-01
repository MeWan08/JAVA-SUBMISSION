import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);
        UserInput ui = new UserInput();
        
        int choice;
        do {
            System.out.println("Select one of the following:");
            System.out.println("1. Addition"); 
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Fibonacci Sequence");
            System.out.println("6. Sum of Array");
            System.out.println("7. Mean of Array");
            System.out.println("8. Variance of Array");
            System.out.println("9. Standard Deviation of Array");
            System.out.println("10. Exit");
            
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    // Addition
                    int additionResult = cal.sum();
                    System.out.println("Addition result: " + additionResult);
                    break;

                case 2:
                    // Subtraction
                   
                    int subtractionResult = cal.difference();
                    System.out.println("Subtraction result: " + subtractionResult);
                    break;

                case 3:
                    // Multiplication
                    int multiplicationResult = cal.product();
                    System.out.println("Multiplication result: " + multiplicationResult);
                    break;

                case 4:
                    // Division
                    double divisionResult = cal.quotient();
                    System.out.println("Division result: " + divisionResult);
                    break;

		case 5:
                    // Fibonacci Sequence
                    int n = sc.nextInt();
                    cal.fibonacci(n);
                    break;

                case 6:
                    // Sum of Array
                    double[] sumInputs = ui.getArrayInput();
                    double sumResult = cal.sumOfArray(sumInputs);
                    System.out.println("Sum of Array: " + sumResult);
                    break;

                case 7:
                    // Mean of Array
                    double[] meanInputs = ui.getArrayInput();
                    double meanResult = cal.meanOfArray(meanInputs);
                    System.out.println("Mean of Array: " + meanResult);
                    break;

                case 8:
                    // Variance of Array
                    double[] varianceInputs = ui.getArrayInput();
                    double varianceResult = cal.varianceOfArray(varianceInputs);
                    System.out.println("Variance of Array: " + varianceResult);
                    break;

                case 9:
                    // Standard Deviation of Array
                    double[] stddevInputs = ui.getArrayInput();
                    double stddevResult = cal.stdDeviationOfArray(stddevInputs);
                    System.out.println("Standard Deviation of Array: " + stddevResult);
                    break;
              

                case 10:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid operation choice!");
                    break;
            }
        } while(choice != 10);
        sc.close();
    }
}
