package org.example.oops_examples.inheritance;

class A
{
    A()
    {
        System.out.println("at A class constructor");
    }
}

// hierarchical
class B extends  A
{
    B()
    {
        System.out.println("at B class constructor");
    }
}

class C extends  A
{
    C()
    {
        System.out.println("at C class constructor");
    }
}

public class HierarchicalInheritance

{

    public static void main(String[] args)
    {
        System.out.println("at HybridInheritance");
        B b = new B();
        C c = new C();

    }
}