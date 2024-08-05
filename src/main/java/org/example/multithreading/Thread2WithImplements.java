package org.example.multithreading;

public class Thread2WithImplements implements Runnable
{
    @Override
    public void run()
    {
        System.out.println(" at 22222222 Thread2WithImplements rum method, start ");
        int number = 6;
        for(int i =1; i <= 10; i++)
        {
            System.out.println("number "+number+" * "+i +" = "+i*number +", at thread "+Thread.currentThread().getName());
            try
            {
                if(i == 10)
                {
                    i = 0;
                    Thread.sleep(2000);
                    //System.out.println("at run method: "+Thread.currentThread().getState());
                    number++;
                }
                if(number > 10)
                {
                    break;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(" at 2222222 Thread2WithImplements rum method, end");
    }
}
