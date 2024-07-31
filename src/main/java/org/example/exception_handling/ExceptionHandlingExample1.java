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
    static String dob;
    static  int counter = 1;
    public static void main(String[] args){
        System.out.println("vikash");
        int[] a = new int[5];
        //a[9]= 2;
        System.out.println("rohit");
        sum("1","1");
        File file = new File("abcd");
        file.mkdir();

        /*try {
            FileInputStream fileInputStream = new FileInputStream("abcd");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

        System.out.println(Integer.parseInt("123"));

        /*
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String invalidDate = "2023-13-45";
        Date parsedDate = null;
        try {
            // compile time / checked exception
            parsedDate = dateFormat.parse(invalidDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Parsed date: " + parsedDate);
        */

        //TODO calling fetchDate method
        try
        {
            String date = formatDate();
            System.out.println("date: "+date);
        } catch (ParseException e)
        {
            System.out.println("at ParseException block");
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
        try
        {
            System.out.println(divide(6,2));
        }
        catch (Exception e)
        {
            System.out.println("at ArithmeticException block, message "+e.getMessage());
            //e.printStackTrace();
        }

        System.out.println("after divide");
        try
        {
            validate(5);
        }
        catch (Exception e)
        {
            System.out.println("exception message "+e.getMessage());
        }
        System.out.println("after validate");
    }

    public static int sum(String a, String b)
    {
        System.out.println("dob = "+dob);
        boolean isCodeSuccess = false;
        String errorMsg = "";
        int sum = Integer.MIN_VALUE;
        // Runtime / unchecked
        try
        {
            //System.out.println("dob length = "+dob.length());
            int[] numbers = new int[2];
            //numbers[4] = 10;
            try
            {
                sum = Integer.parseInt(a + b);
                System.out.println("after sum, sum: "+sum);
            }
            catch (Exception e)
            {
                errorMsg = e.getMessage();
            }
            isCodeSuccess = true;
            /*
            if(counter == 1)
            {
                counter++;
                sum("4", "5");
            }*/
            // disconnect
        }
        catch (NumberFormatException  | NullPointerException | ArrayIndexOutOfBoundsException exec)
        {
            System.out.println(" at dual exception block");
            errorMsg = exec.getMessage();
            System.out.println("message: "+exec.getMessage());
            //System.out.println("cause: "+ Arrays.toString(exec.getStackTrace()));
            exec.printStackTrace();
        }
        finally {
            System.out.println(" at finally method");
            if(!isCodeSuccess)
            {
                //call api or save it on database
            }
            //
        }
        System.out.println("at end of method");
        return sum;
    }


    public static String formatDate() throws ParseException
    {
        String result = "";
        int i = 10;
        /*if(i == 10)
        {
            throw  new RuntimeException("Hello Vikas");
        }*/
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String invalidDate = "2023-13-45";
        Date parsedDate = null;
        // compile time / checked exception
        parsedDate = dateFormat.parse(invalidDate);
        System.out.println("Parsed date: " + parsedDate);
        result = String.valueOf(parsedDate);
        return result;
    }

    public static int divide(int a, int b) throws NullPointerException
    {
        int result = 0;
        try
        {
            result = a / b;
        }
        catch (ArithmeticException e)
        {
            System.out.println("at divide method divide, message "+e.getMessage());
        }
        return result;

    }

    public static void validate(int age) {

        if(age<18)
        {
            throw new RuntimeException("Person is not eligible to vote");
        }
        else
        {
            System.out.println("Person is eligible to vote!!");
        }
    }

    public static void callingCustomException()
    {
        try
        {
            throw new UserDefinedException("Hello, i am a custom exception");
        } catch (UserDefinedException e)
        {
            throw new RuntimeException(e);
        }

    }


}
