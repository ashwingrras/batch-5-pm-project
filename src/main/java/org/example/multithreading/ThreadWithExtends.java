package org.example.multithreading;

public class ThreadWithExtends extends Thread
{

    @Override
    public void run()
    {
        System.out.println(" at ThreadWithExtends run method start");
        String name = "";
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" at ThreadWithExtends run method, before for loop");
        for(int i =0; i < 100000; i++)
        {
            name +=i;
        }
        System.out.println(" at ThreadWithExtends run method, after for loop");
        System.out.println(" at ThreadWithExtends run method end");
    }

}
