package org.example.multithreading;

public class MainThreadExample2
{
    public static void main(String[] args) throws InterruptedException {

        // First
        ThreadWithImplements thread1WithImplements = new ThreadWithImplements();
        Thread thread1 = new Thread(thread1WithImplements, "thread 1");
        // Second
        ThreadWithImplements thread2WithImplements = new ThreadWithImplements();
        Thread thread2 = new Thread(thread2WithImplements,"thread 2");
        //
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("end of main method");
    }
}
