package org.example.oops_examples.inheritance;

public class ParentClass extends GrandParent
{

    String name = "ashwin";
    int age = 32;

    String jobProfile = "java developer";

    String address = "balitmore";

    ParentClass() // constructor
    {
        System.out.println("at ParentClass Constructor");
        System.out.println(hobby);
        super.sum(10,10);
    }

    public String getName()
    {
        return name;
    }

    public int sum(int a, int b)
    {
        System.out.println("at ParentClass sum method");
        return  a + b;
    }

    public int subtract(int a, int b)
    {
        return  a - b;
    }

}
