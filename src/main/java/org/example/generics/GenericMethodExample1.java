package org.example.generics;

public class GenericMethodExample1 {

    public static void main(String[] args)

    {

        System.out.println("GenericMethodExample1");
        System.out.println(sum(1.0f,5.9));
    }

    //
    public static <P extends Number> double sumNew(P num1, P num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
    //

    public <T> T[] getFirstElement(T[] array)
    {
        return array;
    }

    public static  <P extends Number> double sum(P a, P b)
    {

        ///int sum = ((Integer) a).intValue() + ((Integer) b).intValue();
        double ab = a.doubleValue();
        double bb = b.doubleValue();
        //double sum = (Double) a + (Double) b;
        return ab + bb;
    }

}
