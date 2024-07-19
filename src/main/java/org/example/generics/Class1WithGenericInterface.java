package org.example.generics;

public class Class1WithGenericInterface implements GenericInterfaceExample1<Integer>, GenericInterfaceExample2<Double>
{
    @Override
    public Integer sum(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Double multiply(Double a, Double b) {
        return a * b;
    }
}
