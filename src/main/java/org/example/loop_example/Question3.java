package org.example.loop_example;

public class Question3
{
    public static void main(String[] args) 
    {
        // 6
        // 1, 3, 6, 10, 15, 21, 19, 16, 12, 7, 1
        //Question 3.  1, 3, 6, 10, 15, 13, 10, 6, 1         
        int counter = 2;
        int number = 1;
        for (int i = 1; i < 10; i++) 
        {
            System.out.println(number);
            if (number == 15)
            {
                counter = 2;
            }
            number = i >= 5 ? (number -= counter) : (number += counter);
            /*
            if (i >= 5) 
            {
                number -= counter;    
            }
            else
            {
                number += counter;   
            }
            */
            counter++;
            //testData(number += counter, number -= counter);
        }

    }

    public static  void testData(int numbe1, int number2)
    {
        
    }
    
}
