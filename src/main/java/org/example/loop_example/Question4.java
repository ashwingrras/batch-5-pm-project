package org.example.loop_example;

public class Question4
{
    //30, 27, 25, 22, 20, 17, 15, 12, 10, 7, 5, 2, 0
    //40, 36, 33, 29, 26, 22, 19, 15, 12, 8, 5, 1, 
    //50, 45, 41, 36, 32, 27, 23, 18, 14, 9, 5, 0
    
    public static void main(String[] args) 
    {
        int index = 0;
        int no = 30;
        int counter1 = no / 10;
        int counter2 = counter1 - 1;
        while(no >= 0) 
        {
            System.out.println(no);
            if (index % 2 == 0) 
            {
                no -= counter1;
            }
            else
            {
                no -= counter2;
            }
            index++;
        }
    }    
}
