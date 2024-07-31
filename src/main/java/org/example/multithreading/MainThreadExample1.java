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
    1. New
    2. Runnable
    3. Timed_Waiting
    4. Waiting
    5. Blocked
    6. Terminated

 */

public class MainThreadExample1
{
    public static void main(String[] args) throws InterruptedException {
        //First Way
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
        //Second Way
        ThreadWithImplements threadWithImplements = new ThreadWithImplements();
        Thread thread = new Thread(threadWithImplements);
        thread.start();
        //Third way
        Thread threadWithLambda = new Thread(() -> {
            System.out.println(" at threadWithLambda start");
        });
        threadWithLambda.start();
    }
}
