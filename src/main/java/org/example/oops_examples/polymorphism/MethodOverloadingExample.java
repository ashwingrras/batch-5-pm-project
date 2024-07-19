package org.example.oops_examples.polymorphism;


/*
    method overloading: same name different argument

 */
public class MethodOverloadingExample
{
    public static void main(String[] args)
    {
        System.out.println(" at MethodOverloadingExample");
        MethodOverloadingExample methodOverloadingExample = new MethodOverloadingExample();
        methodOverloadingExample.sum(1, 2);
        methodOverloadingExample.sum(1.5, 2);
        methodOverloadingExample.sum(1.5f, 2f);
        methodOverloadingExample.sum("2", "5");
        String[] values = {"2","1","4","3"};
        double[] valuesDouble = {3.4, 3,1, 3.2};
    }

    public int sum(int a, int b)
    {
        return a + b;
    }

    public double sum(double a, double b)
    {
        return  a + b;
    }

    public float sum(float a, float b)
    {
        return  a + b;
    }

    public int sum(String a, String b)
    {
        return Integer.parseInt(a + b);
    }

}

