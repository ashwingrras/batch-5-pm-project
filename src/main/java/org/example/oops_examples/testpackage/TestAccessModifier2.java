package org.example.oops_examples.testpackage;

public class TestAccessModifier2
{

    public void testPublic()
    {
        System.out.println("at testPublic method");
    }

     void testDefaultMethod()
    {
        System.out.println("at testDefaultMethod method");
        testPrivate();
    }

    private void testPrivate()
    {
        System.out.println("at testPrivate method");
    }

    protected void testProtected()
    {
        System.out.println("at testProtected method");
    }

}
