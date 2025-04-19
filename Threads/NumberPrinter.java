package Threads;

/**
  * This class implements Runnable to print numbers from 1 to 5 with delays.
  */
public class NumberPrinter implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                Thread.sleep(300); // Simulate work with delay
            }
        } catch (InterruptedException e) {
            System.out.println("Number printer interrupted: " + e.getMessage());
        }
    }
}