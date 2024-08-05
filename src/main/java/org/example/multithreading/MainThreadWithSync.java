package org.example.multithreading;

import java.util.Date;

public class MainThreadWithSync
{
    public static void main(String[] args)
    {
        try
        {
            SyncThread1 syncThread1 = new SyncThread1();
            Thread thread1 = new Thread(syncThread1);
            Thread thread2 = new Thread(syncThread1);
            thread1.setName("Thread 1");
            thread2.setName("Thread 2");
            System.out.println(new Date());
            thread1.start();
            thread2.start();
            System.out.println("18, thread1 state: "+thread1.getState());
            System.out.println("21, thread2 state: "+thread2.getState());
            System.out.println(new Date());
            Thread.sleep(5000);
            System.out.println("20, thread1 state: "+thread1.getState());
            System.out.println("21, thread2 state: "+thread2.getState());
            //thread1.join();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
