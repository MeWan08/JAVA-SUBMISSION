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
	int product(){
		UserInput ui = new UserInput();
		int[] numbers = ui.userInput();
		int product = numbers[0] * numbers[1];
		return product;
	}
	int quotient(){
		UserInput ui = new UserInput();
		int[] numbers = ui.userInput();
		int quo = numbers[0] / numbers[1];
		return quo;
	}
	void fibonacci(int n){
		int a =0, b=1, c;
		for(int i=0;i<n;i++){
			System.out.println(a+ "");
			c = a+b;
			a=b;
			b=c;
		}
		System.out.println();
	}
	double sumOfArray(double[] array){
		double sum = 0;
		for(double num:array){
			sum += num;
		}
		return sum;
	}
}