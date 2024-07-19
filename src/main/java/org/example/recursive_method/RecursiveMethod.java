package org.example.recursive_method;

public class RecursiveMethod
{
    int value = 5;
    int fact;
    public static void main(String[] args)
    {
        //
        System.out.println("at Recursive method example");
        RecursiveMethod recursiveMethod = new RecursiveMethod();
        //recursiveMethod.iterateTable(1);
        //System.out.println(recursiveMethod.factorial(5));
        //recursiveMethod.reverseTable(100);
        int value = 150;
        //System.out.println(getFactorial(5));
        //recursiveMethod.decreaseNumberBy10(value);
        recursiveMethod.decreaseNumberBy10Recursive(100);
        //System.out.println("method call "+recursiveMethod.decreaseNumberBy10Recursive(100));

    }

    static int getFactorial(int n)
    {
        System.out.println("at getFactorial method");
        if(n==1)
        {
            System.out.println(" if n == 1");
            return 1;
        }
        else
        {
            System.out.println(" else n != 1 ");
            return n * getFactorial(n - 1);
        }
    }

    static int sumOfTwo(int a, int b)
    {
        System.out.println("at sumOfTwo method");
        return a + b;
    }

    public void decreaseNumberBy10(int number)
    {
        System.out.println(number);
        number -= 10;// 90, 80, 70, 10
        if(number >= 0)
        {
            decreaseNumberBy10(number);
        }
    }

    public int decreaseNumberBy10Recursive(int number)
    {
        System.out.println("number is "+number);
        if(number >= 0)
        {
            return decreaseNumberBy10Recursive(number - 10);
        }
        else
        {
            return 1;
        }
    }

    public void iterateTable(int counter)
    {
        //System.out.println("at iterateTable, couter "+counter); // 1
        int multiply = value * counter; // 1
        System.out.println(multiply);
        if(counter < 10)
        {
            counter++;
            iterateTable(counter);
        }
    }

    int factorial(int n)
    {
        if (n == 0)
        {
            return 1;
        }
        else
        {
            return(n * factorial(n-1));
            // 5 * 4: 20
        }

    }

    public void reverseTable(int counter)
    {
        int fact = 5;
    }



}
