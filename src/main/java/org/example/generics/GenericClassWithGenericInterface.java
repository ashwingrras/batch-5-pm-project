package org.example.generics;

public class GenericClassWithGenericInterface<T> implements GenericInterfaceExample1<T>
{
    @Override
    public T sum(T a, T b) {
        Integer aa = (Integer) a;
        Integer bb = (Integer) b;
        Integer cc = aa + bb;
        return (T) cc;
    }
}
