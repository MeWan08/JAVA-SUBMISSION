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

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("\nBoth threads have finished execution.");
    }
}