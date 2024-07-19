package org.example.oops_examples.singleton_class;

import static org.example.oops_examples.singleton_class.MainClass.name;

public class SingletonClass
{

    static SingletonClass singletonClass;

    private SingletonClass()
    {

    }

    public static SingletonClass getSingletonClassInstance()
    {
        name = "vikash";
        if(singletonClass == null)
        {
            singletonClass =  new SingletonClass();
        }
        return singletonClass;
    }

}
