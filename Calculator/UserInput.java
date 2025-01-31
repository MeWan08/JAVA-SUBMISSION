// UserInput.java
import java.util.*; 
class UserInput{
	int[] userInput(){
	int[] numbers = new int[2];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number:");
	numbers[0] = sc.nextInt();
	System.out.println("Enter the second number:");
	numbers[1] = sc.nextInt();
	return numbers;
	}
}	