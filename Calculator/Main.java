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
            }
        } while(choice != 10);
        sc.close();
    }
}
