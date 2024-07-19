package org.example.oops_examples.inheritance;

/*

    multiple inheritance
 */

import org.example.oops_examples.inheritance.GrandParent;
import org.example.oops_examples.inheritance.ParentClass;

public class ChildrenClass extends ParentClass
{

    String name = "himaksh";
    int age = 5;

    String course = "java full stack";

    String address = "jaipur";

    ChildrenClass()
    {
        System.out.println("at ChildrenClass constructor");
        sum(10 , 10);
        super.sum(20,20);
        subtract(15, 5);
        System.out.println(jobProfile);
        System.out.println(course);
        System.out.println(address);
        System.out.println(super.address);
        System.out.println(hobby);
        super.sum(10,19);
        // Q 1. is it possible to call grandparent sum method from children class?
        // Q 2. how to use multiple inheritance in java
        new GrandParent().sum(10,9);
        ((GrandParent)this).sum(9, 8);
    }

    public int sum(int a, int b)
    {
        System.out.println("at ChildrenClass sum method");
        return  a + b;
    }

    public int multiply(int a, int b)
    {
        return  a * b;
    }


}
