//ArrayFunctions.java
import java.util.*;
class ArrayFunctions{
	void display(int[] array){
		System.out.println("Array is:" + Arrays.toString(array));
	}
	void OddEven(int[] array){
		int[] even = new int[5];
		int[] odd = new int[5];
		int odd_index =0;
		int even_index = 0;
		for(int i=0;i<array.length;i++){
			if(array[i]%2==0){
				even[even_index] = array[i];
				even_index++;		
			}
			else{
				odd[odd_index] = array[i];
				odd_index++;	
			}
		}
		display(even);
		display(odd);
	}
}