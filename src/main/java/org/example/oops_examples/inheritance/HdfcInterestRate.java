package org.example.oops_examples.inheritance;

public class HdfcInterestRate extends HomeLoanInterestRate{
    @Override
    public double getInterestRate() {
        return 10;
    }
}
