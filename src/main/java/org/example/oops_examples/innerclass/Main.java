package org.example.oops_examples.innerclass;

import java.util.Scanner;

public class Main
{
    int ab= 10;
    public static void main(String[] args)
    {
        /*
        MainInnerClassesExample nonStaticInnerClass = new MainInnerClassesExample();
        nonStaticInnerClass.sum(1,3);
        MainInnerClassesExample.InnerClassNonStatic innerClassNonStatic1 = nonStaticInnerClass.new InnerClassNonStatic();
        */
        //
        MainInnerClassesExample.InnerClassNonStatic innerClassNonStatic2 = new MainInnerClassesExample().new InnerClassNonStatic();
        innerClassNonStatic2.showData();
        innerClassNonStatic2.sum(4, 5);
        innerClassNonStatic2.divide(6,2);
        //
        // static inner class
        //
        MainInnerClassesExample.InnerClassStatic classStatic =  new MainInnerClassesExample.InnerClassStatic();
        classStatic.showData();
        //
    }
}
