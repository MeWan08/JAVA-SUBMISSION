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
	public double[] getArrayInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();
        
        double[] array = new double[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextDouble();
        }

        return array;
    }
}	