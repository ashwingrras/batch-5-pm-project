package org.example.collections_framework;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeExample
{
    public static void main(String[] args)
    {
        ArrayDeque<String> arrayDeque1 = new ArrayDeque<>();
        arrayDeque1.add("vikash");
        arrayDeque1.add("yogesh");
        arrayDeque1.add("yuvraj");
        arrayDeque1.add("jahanvi");
        arrayDeque1.add("ashwin");
        System.out.println(arrayDeque1);
        Iterator<String> iterator = arrayDeque1.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        ArrayDeque<Integer> arrayDeque2 = new ArrayDeque<>();
        arrayDeque2.add(3);
        arrayDeque2.add(4);
        arrayDeque2.add(1);
        arrayDeque2.add(5);
        arrayDeque2.add(2);
        System.out.println(arrayDeque2);
    }
}
