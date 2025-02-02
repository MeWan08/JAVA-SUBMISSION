//Main.java
import java.util.*;
/*
Kartik Mehta
23070126056
AIML A3
*/
class Main{
	public static void main(String[] args){
		ArrayInput ai = new ArrayInput();
		ArrayFunctions af = new ArrayFunctions();
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			System.out.println("Please select one fo the following array operations:");
			System.out.println("1. Separate odd and even members in an array");
			System.out.println("2. Separate odd and even members in an array");
			System.out.println("3. Finding the closest neighbour");
			System.out.println("4. Conversion of Array List to an Array or vice versa");
			System.out.println("5. Exit");
			choice = sc.nextInt();
			switch(choice){
				case 1:
					af.OddEven(ai.userInput());
					break;
				case 2:
					af.OddEvenList(ai.userInput());
					break;
				case 3:
					int neighbour = af.ClosestNeighbour(ai.userInput());
					System.out.println("The closest neighbours in the given array are at index " + neighbour + "and " + (neighbour+1));
					break;
				case 4: 
					System.out.println("Select one of the following:");
					System.out.println("1. Convert ArrayList to an Array.");
					System.out.println("2. Convert an Array to an ArrayList.");
					int operation = sc.nextInt();
					switch(operation){
						case 1:
							af.arraylisttoArray(ai.userInputList());
							break;
						case 2:
							af.arraytoArrayList(ai.userInput());
							break;
						default:
							System.out.println("Invalid choice!");
                					break;		
					}
					break;
				case 5:
					System.out.println("Exiting the program...");
					break;
				default:
					System.out.println("Invalid choice!");
                			break;
			}
			
		}while(choice!=5);
	}
	  
}