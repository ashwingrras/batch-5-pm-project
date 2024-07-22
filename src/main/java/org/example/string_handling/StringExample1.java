package org.example.string_handling;

import java.util.Arrays;

public class StringExample1
{
    public static void main(String[] args)
    {
        // primitive data type is mutable, a is mutable
        int a = 10;
        a = 5;
        // String in immutable in java
        String s = "vikash";
        s =  s.concat(" saini");
        System.out.println(s);
        ////
        String name1 = "gunjan";
        String name2 = new String("gunjan");
        System.out.println(" == "+name1 == name2); // java check reference here
        System.out.println("equals: "+name1.equals(name2)); //java check value here
        String name3 = name2.intern();
        System.out.println(" == "+name2 == name3);
        System.out.println("contains: "+name2.contains("j"));
        char[] chars = new char[name1.length()];
        System.out.println("chars "+ Arrays.toString(chars));
        name3.getChars(0, 6, chars, 0);
        System.out.println("chars "+ Arrays.toString(chars));
        // vikash
        // aakash
        // ashwin
    }
}
