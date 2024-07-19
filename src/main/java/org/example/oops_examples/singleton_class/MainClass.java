package org.example.oops_examples.singleton_class;

public class MainClass
{
    public static String name;
    public static void main(String[] args)
    {
        /*
        SingletonClass singletonClass1 = new SingletonClass();
        System.out.println(singletonClass1);
        System.out.println(singletonClass1.hashCode());
        SingletonClass singletonClass2 = new SingletonClass();
        System.out.println(singletonClass2);
        System.out.println(singletonClass2.hashCode());
        */
        SingletonClass singletonClass1 = SingletonClass.getSingletonClassInstance();
        System.out.println(singletonClass1);
        System.out.println(singletonClass1.hashCode());
        SingletonClass singletonClass2 = SingletonClass.getSingletonClassInstance();
        System.out.println(singletonClass2);
        System.out.println(singletonClass2.hashCode());
        System.out.println(name);
    }
}
