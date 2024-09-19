package org.example.loop_example;/*
 Looping statement:

 1. for
 2. while
 3. do while
 4. enhanced for loop

 */

public class LoopingStatement 
{

    public static void main(String[] args) 
    {
        // FOR LOOP
        System.out.println("for loop start");
        // ( variable ; condition; increment/decrement)
        // 1. initialize: one time only
        // 2. condition: on every iteration
        // 3. increment/decrement: on every end of loop statment
        // 4. condition: on every iteration
        for (int i = 0; i < 5; i++) //
        { // loop start
            //System.out.println(i);
            System.out.println("inside loop, i: "+i);
        } // loop end   
        System.out.println("for loop end");

        // break: 
        // 1. loop break
        // 2. switch statement break


        // continue

        //WHILE LOOP
        int i = 0;
        System.out.println("while loop start");
        while (true) // condition
        {
            System.out.println("inside loop, i: "+i);
            //i++;
            if (i == 5) 
            {
                break;    
            }
            i++;
        }
        System.out.println("while loop end");
        // DO WHILE LOOP
        System.out.println(" i: "+i);
        System.out.println(" do while loop start");
        do
        {
            System.out.println(" at do while block");
            if (i == 5) 
            {
                break;
            }
        }
        while(true); // condition
        System.out.println(" do while loop end");
        String[] names = {"vikash","rohit","manoj","vakul"}; // 4
        int[] values = {1,2,3,4,5};
        for(int j=0; j < names.length; j++) 
        {
            System.out.println(names[j]);
        }
        System.out.println("-------------");
        // enhanced  for, for each loop
        for (String j : names) 
        {
            System.out.println(j);
        }
        System.out.println(" now using continue");
        // continue
        for (int j = 0; j < 5; j++) 
        {
            System.out.println(j);  
            if (j == 2 || j == 3) 
            {
                continue;
            }
            System.out.println("after break");
        }
        System.out.println(" after/outside loop ");

        int number = 4;
        int[] numbers = {4,3,6,2};
        System.out.println("numbers: "+numbers);
        System.out.println("numbers index[0]: "+numbers[0]);
        // array index start from zero (0)
        /*
         numbers[0]: 4
         numbers[1]: 3
         numbers[2]: 6
         numbers[3]: 2
        */
        System.out.println("numbers array length: "+numbers.length);
        // normal loop
        int numbersArrayLength = numbers.length;
        for (int k=0; k < numbersArrayLength; k++) 
        {
            System.out.println("numbers[k]: "+numbers[k]);
        }
        // enhanced for loop
        for (int numberValue : numbers) 
        {
            if(numberValue == 3)
            {
            continue;
            }
            System.out.println("numberValue "+numberValue);
        }


        ////Vakul Enhanced practice code/////
        /*
        System.out.println("---------------------ehanced for-----------------------------------------------");  
   
       String[] str1 = {"hello" ,  "world!!" , "i" , "am" , "vakul"};        

       for(String st : str1)  // object st is local 
       {
           System.out.print(" "+st); // print complete array
         //System.out.println(" "+st[1]); // not allowed

         System.out.println(str1); // name of array se only reference print hoga
         System.out.println(Arrays.toString(str1));  // array to string and then print  

         System.out.println("hii"); // it prints number of times the elements in array 
             
 
       }

    System.out.println("---------------------------------------------------------------------------");  
     
       String[] str2 = {"i" ,  "live" , "in" , "jaipur" , "rajasthan"};  // 5      
       // str2[2] = in
       for(String st : str2)
       {
          if(str2[2].equals("in")) // complete for loop is not working here?????????
          {break;}
     
          System.out.print(" index are : "+ str2[1]); 
          System.out.println(" "+st); // print "object" se hogi
          

           if(str2[2] == "in") // -------never goes below this?------should break at "in" but breaking after first iteration?
          {break;}   

          System.out.println(Arrays.toString(str2));  // array to string and then print    
  
       }

    System.out.println("---------------------------------------------------------------------------");  

       int[] number = {1,2,3,4,5};
       // number[2]: 3 == 3
       for(int num : number)
       {
          if(number[2] == 3)  // complete for loop is not working?????????
          {
             continue;
          }   
          
          System.out.print("-------------index are : "+ number[1]); // print values at index --------how to print incrementing index?????
          

          System.out.println(" "+num); // print "object" se hogi
          
          
          if(number[2] == 3)  // not working ------never go below this  ????????????
          {
             continue;
          } 

           System.out.println("testing");         
              
       }

        System.out.println("---------------------------------------------------------------------------");
        */
    }
}
