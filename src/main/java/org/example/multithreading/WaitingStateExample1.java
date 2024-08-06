package org.example.multithreading;

class MyTask implements Runnable {
    private Object lock;

    public MyTask(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " is waiting");
            try {
                if(Thread.currentThread().getName().equals("Thread 1"))
                {
                    lock.wait(); // Thread enters the waiting state
                }
                //Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " is awake");
        }
    }
}

public class WaitingStateExample1 {
    public static void main(String[] args) {
        Object lock = new Object();

        Thread thread1 = new Thread(new MyTask(lock), "Thread 1");
        Thread thread2 = new Thread(new MyTask(lock), "Thread 2");

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(2000); // Sleep for 2 seconds to ensure both threads are waiting
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("thread1 state: "+thread1.getState());
        System.out.println("thread2 state: "+thread2.getState());
        synchronized (lock) {
            lock.notifyAll(); // Notify all waiting threads
        }

    }
}

