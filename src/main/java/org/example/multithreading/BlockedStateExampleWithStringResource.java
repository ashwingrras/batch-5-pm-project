package org.example.multithreading;

public class BlockedStateExampleWithStringResource
{
    public static void main(String[] args)
    {
        //Thread with implements Runnable object
        TaskBlocked task1 = new TaskBlocked("vikash");
        TaskBlocked task2 = new TaskBlocked("vikash");

        //Thread object
        ///Thread thread1 = new Thread(new Task(sharedResource), "Thread-1");
        Thread thread1 = new Thread(task1, "Thread-1");
        ///Thread thread2 = new Thread(new Task(sharedResource), "Thread-2");
        Thread thread2 = new Thread(task2, "Thread-2");
        try
        {
            thread1.start();
            Thread.sleep(1000);
            System.out.println("thread 1 state = "+thread1.getState());
            thread2.start();
            //
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("thread 1 state = "+thread1.getState());
        System.out.println("thread 2 state = "+thread2.getState());
    }
}




class TaskBlocked implements Runnable {
    private final String sharedResource;

    public TaskBlocked(String sharedResource)
    {
        this.sharedResource = sharedResource;
    }

    @Override
    synchronized public void run()
    {
        synchronized (sharedResource)
        {
            System.out.println(Thread.currentThread().getName() + " has acquired the lock and is executing.");
            try
            {
                // sleep for 5 seconds
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " has released the lock.");
        }

    }
}