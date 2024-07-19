package org.example.oops_examples.abstraction;

import org.example.oops_examples.abstraction.AbstractClassExample1;
import org.example.oops_examples.abstraction.TestInterface;

public class InheritAbstractClass extends AbstractClassExample1 implements TestInterface
{
    @Override
    int sum(int a, int b)
    {
        System.out.println(" at InheritAbstractClass sum() method");
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        System.out.println(" at InheritAbstractClass subtract() method");
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
}
