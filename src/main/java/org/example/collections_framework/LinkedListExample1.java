package org.example.collections_framework;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample1
{
    public static void main(String[] args)
    {
        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("vikash");
        linkedList1.add("yuvraj");
        linkedList1.add("vikash");
        linkedList1.add("yogesh");
        System.out.println(linkedList1);
        //linkedList1.removeLastOccurrence("vikash");
        linkedList1.removeLast();
        System.out.println("----------");
        LinkedList<String> linkedList2;
        linkedList2 = (LinkedList<String>) linkedList1.clone();
        System.out.println(linkedList1);
        System.out.println(linkedList2);
        linkedList1.removeLast();
        System.out.println("linkedList1: "+linkedList1);
        System.out.println("linkedList2: "+linkedList2);
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("vikash");

    }
}
