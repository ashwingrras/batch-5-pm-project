package org.example.generics;

import java.util.Arrays;

public class MainClass
{
    public static void main(String[] args)
    {
        GenericClassExample1 genericClassExample1 = new GenericClassExample1();
        genericClassExample1.setValue1("vikash");
        genericClassExample1.setValue2(22);
        System.out.println(genericClassExample1.getValue1());
        System.out.println(genericClassExample1.getValue2());
        genericClassExample1.setValue1(55.55);
        genericClassExample1.setValue2("PH.D in java");
        String degree = (String) genericClassExample1.getValue2();
        System.out.println(degree);
        System.out.println(genericClassExample1.getValue1());
        System.out.println(genericClassExample1.getValue2());
        genericClassExample1.setValue2(new String[]{"4", "6"});
        String[] arr = (String[]) genericClassExample1.getValue2();
        System.out.println(Arrays.toString(arr));

        GenericClassExample1<String, String> genericClassExample2 = new GenericClassExample1<>();
        genericClassExample2.setValue1("yuvraj");
        genericClassExample2.setValue2("italy");
        GenericClassExample1<String, Integer> genericClassExample3 = new GenericClassExample1<>();
        genericClassExample3.setValue1("rohit");
        genericClassExample3.setValue2(12);
        GenericClassExample1<Integer, String > genericClassExample4 = new GenericClassExample1<>();
        genericClassExample4.setValue1(100);
        genericClassExample4.setValue2("Police");

        //////
        GenericClassExample2<String> genericClassExample2_1 = new GenericClassExample2<>();
        genericClassExample2_1.setValue("yogesh");
        GenericClassExample2<Integer> genericClassExample2_2 = new GenericClassExample2<>();
        genericClassExample2_2.setValue(50);

        //
        GenericInterfaceExample2<Double> genericInterfaceExample1 = new Class1WithGenericInterface();
        System.out.println(genericInterfaceExample1.multiply(2.5, 2.0));
        System.out.println(multiply(2, 4));

        GenericInterfaceExample1<Integer> genericInterfaceExample11 = new GenericClassWithGenericInterface<>();
        System.out.println(genericInterfaceExample11.sum(3, 5));

        GenericInterfaceExample1<Double> genericInterfaceExample12 = new GenericClassWithGenericInterface<>();
        System.out.println(genericInterfaceExample12.sum(2.0, 9.0));

    }

    public static   double multiply(double a, double b)
    {
        return  a * b;
    }
}
