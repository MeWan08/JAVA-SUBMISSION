//ArrayInput.java
import java.util.*;
class ArrayInput{
	 int[] userInput(){
		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers:");
		for(int i = 0;i<5;i++){
			array[i] = sc.nextInt();
		}
		return array;
		
	}
}