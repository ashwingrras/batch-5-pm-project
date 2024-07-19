package org.example.generics;

public class Class2WithGenericInterface implements GenericInterfaceExample1<Double>, GenericInterfaceExample2<Integer>{
    @Override
    public Double sum(Double a, Double b) {
        return  (a + b);
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }
}
