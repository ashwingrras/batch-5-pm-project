package org.example.loop_example;

public class Question1
{
    public static void main(String[] args) 
    {
        // Question 1.  1, 3, 4, 6, 7, 9, 10, 12, 13, 15
        int tillValue = 15;
        int add = 0;
        for (int i=0; i < tillValue; i++)
        {
            add += i % 2 == 0 ? 1 : 2;
            if (add <= tillValue) 
            {
                System.out.println(add);     
            }
            if (tillValue == add)
            {
                break;    
            }
        }    
    }
    
}
