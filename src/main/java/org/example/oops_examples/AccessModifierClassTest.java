package org.example.oops_examples;


import org.example.oops_examples.testpackage.TestAccessModifier;
import org.example.oops_examples.testpackage.TestAccessModifier2;

public class AccessModifierClassTest extends TestAccessModifier2
{
    public static void main(String[] args)
    {
        TestAccessModifier testAccessModifier = new TestAccessModifier();
        testAccessModifier.subtract();

        AccessModifierClassTest testAccessModifier2 = new AccessModifierClassTest();
        //testAccessModifier2.testDefaultMethod();
        testAccessModifier2.testProtected();

    }

    public void sum()
    {
        System.out.println("at sum method");
    }

}
