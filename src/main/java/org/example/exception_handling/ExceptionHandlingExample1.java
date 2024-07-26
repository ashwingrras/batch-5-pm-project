package org.example.exception_handling;

/*

    Exception Types;
    1. Checked Exception / compile time exception: java checks while compile
    FileNotFoundException, SqlException, ParseException, IOException,
    InterruptedException, ClassNotFoundException
    2. Unchecked Exception / run time exception: will come while running program
        ArrayIndexOutOfBound, NumberFormatException, ArithmeticException,
        NullPointerException,

    all types of exceptions parent class: Exception

    Errors: StackOverflow, MemoryOutOfBounds, DiskIOFailure

 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ExceptionHandlingExample1
{
    public static void main(String[] args)
    {
        System.out.println("vikash");
        int[] a = new int[5];
        //a[9]= 2;
        System.out.println("rohit");
        sum("1","1.");
        File file = new File("abcd");
        file.mkdir();
        /*
        try {
            FileInputStream fileInputStream = new FileInputStream("abcd");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        */
        System.out.println(Integer.parseInt("123"));

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String invalidDate = "2023-13-45";
        Date parsedDate = null;
        try {
            parsedDate = dateFormat.parse(invalidDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Parsed date: " + parsedDate);




    }

    public static int sum(String a, String b)
    {
        int sum = Integer.MIN_VALUE;
        try
        {
            sum = Integer.parseInt(a + b);
        }
        catch (NumberFormatException exec)
        {
            System.out.println(" at exception block");
            System.out.println("message: "+exec.getMessage());
            //System.out.println("cause: "+ Arrays.toString(exec.getStackTrace()));
            exec.printStackTrace();

        }
        catch (Exception e)
        {
        }
        return sum;
    }

}
