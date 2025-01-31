//Main.java

class Main{
	public static void main(String[] args){
		ArrayInput ai = new ArrayInput();
		ArrayFunctions af = new ArrayFunctions();
		af.display(ai.userInput());
		af.OddEven(ai.userInput());
		af.OddEvenList(ai.userInput());
	}
	  
}