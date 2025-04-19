package Threads;

/**
 * This class implements Runnable to print letters A-E with delays.
 */
public class LetterPrinter implements Runnable {
    @Override
    public void run() {
        try {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println(Thread.currentThread().getName() + ": " + c);
                Thread.sleep(300); // Simulate work with delay
            }
        } catch (InterruptedException e) {
            System.out.println("Letter printer interrupted: " + e.getMessage());
        }
    }
}