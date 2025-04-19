package Threads;

/*
Name: John Doe
PRN: 1234567890
Batch: 2023
*/

/**
 * This class creates and starts two threads to demonstrate concurrent execution.
 */
public class Main {
    public static void main(String[] args) {
        // Create Runnable instances for number and letter printing
        Runnable numberTask = new NumberPrinter();
        Runnable letterTask = new LetterPrinter();

        // Create thread objects
        Thread thread1 = new Thread(numberTask, "NumberThread");
        Thread thread2 = new Thread(letterTask, "LetterThread");
    }
}