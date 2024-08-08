package org.example.multithreading;

import java.util.Date;

public class SynchronizedWithLambda
{
    public static String resources = "vikash";
    public static void main(String[] args)
    {
        Thread thread1 = new Thread(() -> {

            synchronized(resources)
            {
                System.out.println("at thread1 start");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("at thread1 end");
            }
        });


        Thread thread2 = new Thread(() ->
        {
            synchronized(resources)
            {

                System.out.println("at thread2 start");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("at thread2 end");
            }
        });

        thread1.start();
        thread2.start();
        try
        {
            Thread.sleep(1000);
            System.out.println(" thread1 state "+thread1.getState());
            System.out.println(" thread2 state "+thread2.getState());
            thread1.join();
            thread2.join();
        } catch (InterruptedException e)
        {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
