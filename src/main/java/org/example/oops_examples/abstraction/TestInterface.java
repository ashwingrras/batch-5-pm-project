package org.example.oops_examples.abstraction;

public interface TestInterface
{
    int multiply(int a, int b);

    default int divide(int a, int b)
    {

        return a / b;
    }

    static void showData()
    {
        System.out.println("at ");
    }

}
