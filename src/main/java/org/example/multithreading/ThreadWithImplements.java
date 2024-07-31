package org.example.multithreading;

public class ThreadWithImplements implements Runnable
{

    @Override
    public void run()
    {
        System.out.println(" at ThreadWithImplements run method start");
    }
}
