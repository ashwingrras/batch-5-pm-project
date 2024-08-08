package org.example.multithreading;

class Thread1Sync extends Thread
{
    Object resource;
    Thread1Sync(Object resource)
    {
        this.resource = resource;
    }
    public void run()
    {
        synchronized(resource)
        {
            System.out.println("at thread1 start");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("at thread1 end");
        }
    }
}

class Thread2Sync extends Thread
{
    Object resource;
    Thread2Sync(Object resource)
    {
        this.resource = resource;
    }
    public void run()
    {
        synchronized(resource)
        {

            System.out.println("at thread2 start");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("at thread2 end");
        }
    }
}
public class SynchronizedWithThreadExtend
{
    public static void main(String[] args)
    {
        Object object = new Object();
        Thread1Sync thread1Sync = new Thread1Sync(object);
        Thread2Sync thread2Sync = new Thread2Sync(object);
        thread1Sync.start();
        thread2Sync.start();
        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("thread1Sync state: "+thread1Sync.getState());
        System.out.println("thread2Sync state: "+thread2Sync.getState());
    }
}
