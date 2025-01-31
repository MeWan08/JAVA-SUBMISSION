// Main.java

import java.util.*;

class Main{
	public static void main(String[] args)
	{
		/*
		//Input using scanner
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Pleaase enter the first number:");
		int first_num = sc.nextInt();
		System.out.println("Please enter the second number:");
		int second_num = sc.nextInt();
		int result = first_num +second_num;
		System.out.println("The sum is " +result);
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println();
		// command line propts using the Integer class also called a wrapper class
		int first_num = Integer.parseInt(args[0]);
		
		int second_num = Integer.parseInt(args[1]);
		int result = first_num +second_num;
		System.out.println("The sum is " +result);
	}
}