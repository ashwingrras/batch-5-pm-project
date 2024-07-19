package org.example.oops_examples.abstraction;

import org.example.oops_examples.inheritance.HdfcInterestRate;
import org.example.oops_examples.inheritance.HomeLoanInterestRate;
import org.example.oops_examples.inheritance.SbiInterestRate;

public class AbstractObjectMainClass
{
    public static void main(String[] args)
    {
        AbstractClassExample1 inheritAbstractClass = new InheritAbstractClass();

        inheritAbstractClass.sum(1, 4);

        inheritAbstractClass.subtract(5, 2);
        HomeLoanInterestRate sbiInterestRate = new SbiInterestRate();
        System.out.println("sbi interest rate "+sbiInterestRate.getInterestRate());
        HomeLoanInterestRate hdfcInterestRate = new HdfcInterestRate();
        System.out.println("hdfc interest rate "+hdfcInterestRate.getInterestRate());

        TestInterface testInterface = new InheritAbstractClass();
        System.out.println(testInterface.multiply(3, 3));

    }
}
