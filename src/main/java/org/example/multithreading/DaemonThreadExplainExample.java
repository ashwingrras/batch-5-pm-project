package org.example.multithreading;


public class DaemonThreadExplainExample {

    static boolean isThreadRunning = true;

    public static void main(String[] args)
    {
        Thread nonDaemonThread = new Thread(new NonDaemonTask(), "NonDaemon Thread");
        // Create a daemon thread
        Thread daemonThread = new Thread(new DaemonTask(), "Daemon Thread");

        // daemon thread will depend on non-daemon thread
        // when non-daemon thread terminated, it also terminated
        daemonThread.setDaemon(true);

        daemonThread.start();
        nonDaemonThread.start();

        try {
            //Thread.sleep(11000);
            //daemonThread.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("daemonThread state: "+daemonThread.getState());
        System.out.println("nonDaemonThread state: "+nonDaemonThread.getState());
        System.out.println("Main thread ending.");
    }
}

class NonDaemonTask implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " started.");
            for (int i = 1; i <= 5; i++)
            {
                //System.out.println(DaemonThreadExplainExample.isThreadRunning);
                System.out.println(Thread.currentThread().getName() + " is running: " + i);
                Thread.sleep(1000);
                if(i == 3)
                {
                    DaemonThreadExplainExample.isThreadRunning = false;
                }
            }
            System.out.println(Thread.currentThread().getName() + " completed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class DaemonTask implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " started.");
            for (int i = 1; i <= 10; i++)
            {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " is running: " + i);
                //System.out.println(DaemonThreadExplainExample.isThreadRunning);
            }
            System.out.println(Thread.currentThread().getName() + " completed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + " at finally completed.");
        }
    }
}

