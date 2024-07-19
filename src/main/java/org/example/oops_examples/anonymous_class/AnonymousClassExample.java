package org.example.oops_examples.anonymous_class;

public class AnonymousClassExample
{
    public static void main(String[] args)
    {

        TestInterface testInterface = new TestInterface() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        testInterface.sum(3, 4);
    }
}
