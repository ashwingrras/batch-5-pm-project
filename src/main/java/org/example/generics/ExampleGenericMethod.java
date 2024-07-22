package org.example.generics;

import java.util.Arrays;

public class ExampleGenericMethod
{
    public static void main(String[] args)
    {
     String[] strArray = {"d","a","b","c"};
     Integer[] intArray = {8, 4, 3, 1, 9};
     System.out.println(Arrays.toString(getArray(strArray)));
     System.out.println(getArrayFirstElement(strArray));
     System.out.println(getArrayFirstElement(intArray));
     sum(1.3, 4);
    }
    public static  <T> T[] getArray(T[] array)
    {
        return array;
    }

    public static  <T> T getArrayFirstElement(T[] array)
    {
        return array[0];
    }

    public static  <P extends Number> double sum(P a, P b)
    {
        double ab = a.doubleValue();
        double bb = b.doubleValue();
        return ab + bb;
    }
}
