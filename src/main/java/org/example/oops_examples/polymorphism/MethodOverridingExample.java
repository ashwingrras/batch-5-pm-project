package org.example.oops_examples.polymorphism;

/*
    method overriding : same name same argument but in different class with child, parent
    relation

 */


import org.example.oops_examples.inheritance.GrandParent;

class A
{

    A()
    {
        System.out.println("at A class constructor");
        // it will call class B method, when we create B class object
        //this.subtract(4,3);
    }
    public int sum(int a, int b)
    {
        System.out.println(" at AAAAAAAAAA class sum method ");
        return a + b;
    }

    public int subtract(int a, int b)
    {
        System.out.println(" at AAAAAAAAAA class subtract method ");
        return a + b;
    }

    public int divide(int a, int b)
    {
        System.out.println(" at A class divide method");
        return a / b;
    }

    public int modulus(int a, int b)
    {
        System.out.println(" at A class modulus method");
        return a % b;
    }
}

class B extends A
{
    B()
    {
        System.out.println(" at B class constructor");
        //sum(9,5);
        //subtract(6,6);
        ////super.sum(3, 4);
    }

    public int callParentSum()
    {
        return super.sum(1,4);
    }

    @Override
    public int sum(int a, int b)
    {
        System.out.println(" at BBBBBBBB class sum method ");
        return a + b;
    }

    @Override
    public int subtract(int a, int b)
    {
        System.out.println(" at BBBBBBBB class subtract method ");
        return a + b;
    }

    public int divide(int a, int b)
    {
        System.out.println(" at B class divide method");
        return a / b;
    }
}

class C extends B
{

    C()
    {
        System.out.println(" at C class constructor");
    }

    public int subtract(int a, int b)
    {
        System.out.println(" at CCCCCC class subtract method ");
        return a + b;
    }
}

public class MethodOverridingExample
{
    public static void main(String[] args)
    {
        /*
        A a = new B();//upcasting
        a.divide(4, 2);
        a.modulus(10,5);
        */
        //a.callParentSum();
        B b = new C(); // upcasting
        b.subtract(5, 2);
    }
}
