package org.example.loop_example;

public class SeriesWithLoop1
{
    public static void main(String[] args) 
    {
        // Day 1 task:
        // Question 1.  1, 3, 4, 6, 7, 9, 10, 12, 13, 15
        // Question 2.  1, 3, 6, 10, 15, 21, 28, 36, 45, 55
        // Question 3.  1, 3, 6, 10, 15, 13, 10, 6, 1     
        // Question 4.  30, 27, 25, 22, 20, 17, 15, 12, 10, 7, 5, 2, 0
        // Question 5.  2, 4, 12, 24, 72, 144
        // Question 6.  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55


        // Day 2 task:
        // Question 1.   20, 17, 15, 12, 10, 7, 5, 2, 0
        // Question 2.   70, 65, 59, 52, 44, 35, 25, 14, 2

        // Question 3.   1, 3, 5, 7, 9,  2, 5, 8, 11, 14, 17, 20, 3, 7, 11, 15, 19, 23, 27
        // Question 4.  1, 3, 5, 7, 9,   2, 5, 8,  3, 7, 4, 9, 5,
        // Question 5.  1, 2, 3, 2, 4, 6, 3, 6, 9, 4, 8, 12, 5, 10, 15, 6, 12, 18, 7, 14, 21, 8, 16, 24, 9, 18, 27, 10, 20, 30


        int tillValue = 15;
        int add = 0;
        for (int i=0; i < tillValue; i++)
        {
            add += i % 2 == 0 ? 1 : 2;
            /*
            if (i % 2 == 0) 
            {
                add = add + 1;  // even  
            }
            else
            {
                add = add + 2; // odd
            }
            */
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
