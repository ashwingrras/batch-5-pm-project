package org.example.generics;

public class GenericClassExample2<T>
{
    T value;
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
