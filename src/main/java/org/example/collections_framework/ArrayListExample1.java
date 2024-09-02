package org.example.collections_framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1
{
    public static void main(String[] args)
    {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(101);
        arrayList.add(102);
        arrayList.add(1,106);
        arrayList.add(103);
        arrayList.add(104);
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);
        List<Integer> arrayList2 = new ArrayList<>();
        arrayList2.addAll(arrayList);
        System.out.println(arrayList2);
    }
}
