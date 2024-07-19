package org.example.oops_examples.innerclass;

public class MainInnerClassesExample
{

    MainInnerClassesExample()
    {
        System.out.println(" at MainInnerClassesExample constructor");
    }
    int a = 16;
    int b = 5;
    static int c = 21;
    public int sum(int a, int b)
    {
        System.out.println("at MainInnerClassesExample sum method");
        return a + b;
    }
    public int multiply(int a, int b)
    {
        System.out.println("at MainInnerClassesExample multiply method");
        return a * b;
    }
    ////////// INNER CLASS NON STATIC ///////////
    class InnerClassNonStatic
    {
        static int g = 21;
        {
            System.out.println(", b = "+b+", c = "+c);
        }
        InnerClassNonStatic()
        {
            System.out.println("at InnerClassNonStatic constructor");
            multiply(2,4);
        }
        public int sum(int a, int b)
        {
            System.out.println("at InnerClassNonStatic sum method");
            return a + b;
        }

        public int divide(int a, int b)
        {
            System.out.println("at InnerClassNonStatic divide method");
            return a / b;
        }

        int a = 10;
        public void showData()
        {
            System.out.println("a ="+a+", b = "+b);
        }
    }

    ////////// INNER CLASS STATIC ///////////
    static class InnerClassStatic
    {
        int d = 18;
        static int f = 11;
        InnerClassStatic()
        {

            System.out.println("at InnerClassStatic constructor");
            sum(3, 4);
        }
        public int sum(int a, int b)
        {
            System.out.println("at InnerClassStatic sum method");
            return a + b;
        }
        int a = 10;
        public void showData()
        {
            System.out.println("a ="+a+", c="+c);
        }
    }

}
