package org.example.multithreading;

public class WaitingStateExample
{
    private static final Object anshika = new Object();
    public static void main(String[] args)
    {
        Thread waitingThread = new Thread(new WaitingTask(), "WaitingThread");
        Thread notifyingThread = new Thread(new NotifyingTask(), "NotifyingThread");

        waitingThread.start();
        try {
            Thread.sleep(1000);
            System.out.println("thread state: "+waitingThread.getState());
            //waitingThread.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        notifyingThread.start();
    }

    static class WaitingTask implements Runnable {
        @Override
        public void run() {

            synchronized (anshika) {
                try {
                    System.out.println(Thread.currentThread().getName() + " is going to wait.");
                    anshika.wait(); // This will put the thread in waiting state
                    System.out.println(Thread.currentThread().getName() + " is resumed.");
                } catch (Exception e) {
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }
            }
        }
    }

    static class NotifyingTask implements Runnable {
        @Override
        public void run() {
            // Adding sleep to ensure WaitingTask runs first and enters the waiting state
            try {
                Thread.sleep(1000); // Sleep for a bit to ensure the waiting thread gets to wait()
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }

            synchronized (anshika)
            {
                System.out.println(Thread.currentThread().getName() + " is going to notify.");
                anshika.notify(); // This will wake up the waiting thread
                System.out.println(Thread.currentThread().getName() + " has notified.");
            }
        }
    }
}
