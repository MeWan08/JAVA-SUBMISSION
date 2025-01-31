// Calculator.java
import java.util.*;
class Calculator{
	int sum(){
		UserInput ui = new UserInput();
		int[] numbers = ui.userInput();
		int sum = numbers[0] + numbers[1];
		return sum;	
	}
	int difference(){
		UserInput ui = new UserInput();
		int[] numbers = ui.userInput();
		int diff = numbers[1] - numbers[0];
		return diff;
	}
}