//ArrayInput.java
import java.util.*;
class ArrayInput{
	 int[] userInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of the array:");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter" + n +  "numbers:");
		for(int i = 0;i<n;i++){
			array[i] = sc.nextInt();
		}
		return array;	
	}
	}
}