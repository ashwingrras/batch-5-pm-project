package org.example.oops_examples.inheritance;

public class GrandParent
{
    String name = "manoj";
    int age = 52;

    String address = "bharatpur";

    String hobby = "reading news paper";

    GrandParent()
    {
        System.out.println("at GrandParent constructor");
    }

    public int sum(int a, int b)
    {
        System.out.println("at GrandParent sum method");
        return  a + b;
    }
}
