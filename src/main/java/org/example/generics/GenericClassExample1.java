package org.example.generics;

public class GenericClassExample1<V, T>
{
    V value1;

    T value2;

    public V getValue1() {
        return value1;
    }

    public void setValue1(V value1) {
        this.value1 = value1;
    }

    public T getValue2() {
        return value2;
    }

    public void setValue2(T value2) {
        this.value2 = value2;
    }
}
