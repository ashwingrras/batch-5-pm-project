package org.example.multithreading;

/*

    multitasking
    1. multiprocessing: different memory and address, heavyweight process
    2. multithreading: lightweight process share memory with multiple task,
    single memory address, share memory, shared resources

    Thread
    1. extends Thread class
    2. implement Runnable interface
    3. lambda

    Thread LifeCycle / thread state:
    1. New : new object
    2. Runnable : when thread start
    3. Timed_Waiting : sleep or wait
    4. Waiting:
    5. Blocked: with synchronized method or block, with one thread was already there, and second thread was started
    6. Terminated: after thread complete

 */

import java.util.Date;

public class MainThreadExample1
{
    public static void main(String[] args) throws InterruptedException {
        //First Way, with thread class extends
        /*
        ThreadWithExtends threadWithExtends = new ThreadWithExtends();
        System.out.println("1111 "+threadWithExtends.getState());
        threadWithExtends.start();
        System.out.println("2222 "+ threadWithExtends.getState());
        Thread.sleep(1000);
        System.out.println("3333 "+threadWithExtends.getState());
        threadWithExtends.join(); // request threadWithExtends to terminate
        System.out.println("4444 "+ threadWithExtends.getState());
        */
        //Second Way, with runnable interface
        ThreadWithImplements threadWithImplements = new ThreadWithImplements();
        Thread thread = new Thread(threadWithImplements);
        System.out.println("44: "+thread.getState()); // NEW
        thread.start();
        System.out.println("46: "+thread.getState()); // RUNNABLE
        //System.out.println(new Date());
        Thread.sleep(200);
        //System.out.println(new Date());
        System.out.println("50: "+thread.getState()); // TIMED_WAITING
        thread.join();
        System.out.println("52: "+thread.getState()); // TERMINATED
        //Third way, lambda expression
        /*Thread threadWithLambda = new Thread(() ->
        {
            System.out.println(" at threadWithLambda start");
        });
        threadWithLambda.start();*/
    }
}
