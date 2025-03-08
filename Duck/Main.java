/*
Name: Kartik Mehta
PRN: 23070126056
Batch: AIML A3
*/

// Main class to demonstrate Duck behaviors
public class Main {
    public static void main(String[] args) {
        // Create ducks
        Duck mallardDuck = new MallardDuck();
        Duck redheadDuck = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();
        Duck decoyDuck = new DecoyDuck();

        // Display and perform behaviors
        System.out.println("Mallard Duck:");
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performSwim();

        System.out.println("\nRedhead Duck:");
        redheadDuck.display();
        redheadDuck.performFly();
        redheadDuck.performSwim();

        System.out.println("\nRubber Duck:");
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performSwim();

        System.out.println("\nDecoy Duck:");
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performSwim();
    }
}