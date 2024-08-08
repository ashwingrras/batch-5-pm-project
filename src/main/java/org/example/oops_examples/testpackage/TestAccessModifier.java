package org.example.oops_examples.testpackage;

public class TestAccessModifier
{

    public static void main(String[] args)
    {

        TestAccessModifier2 testAccessModifier2 = new TestAccessModifier2();
        testAccessModifier2.testDefaultMethod();
        testAccessModifier2.testProtected();

    }

     public void subtract()
    {
        System.out.println("at subtract method");
    }

}
