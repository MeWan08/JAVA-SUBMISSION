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
	void displayList(ArrayList<Integer> array){
		System.out.println("Array is:" + array);
	}
	void OddEvenList(int[] array){
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();

		for(int i=0;i<array.length;i++){
			if(array[i]%2==0){
				even.add(array[i]);
			
			}
			else{
				odd.add(array[i]);
					
			}
		}
		displayList(even);
		displayList(odd);
	}
	int ClosestNeighbour(int[] array){
			int min = Integer.MAX_VALUE;
			int index = 0;
			for(int i=0;i<array.length-1;i++){
				int difference = Math.abs(array[i+1] - array[i]);
				if(min>difference){
					min = difference;
					index = i;
				}
			}
			return index;
	}
	void arraytoArrayList(int[] array){
		ArrayList<Integer> list = new ArrayList<>();
		for(int i :array){
			list.add(i);
		}
		displayList(list);
	}
}