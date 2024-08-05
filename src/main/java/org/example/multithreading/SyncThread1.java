package org.example.multithreading;

public class SyncThread1 implements Runnable
{

    @Override
    synchronized public void run() {
        System.out.println(" at Sync thread start : "+Thread.currentThread().getName());
        for(int i =1; i <= 5; i++)
        {
            System.out.println("i: "+i+", at thread "+Thread.currentThread().getName());
            try
            {
                //Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(" at Sync thread end : "+Thread.currentThread().getName());
    }
}
