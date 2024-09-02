package org.example.collections_framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*

    Product:
    1. name
    2. price
    3. description
    4. Rating
    5. Size: s, l, xl, xxl, m,

 */

public class SetExample1
{
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("vikash");
        set.add("ashwin");
        set.add("yuvraj");
        set.add("anshika");
        set.add("gunjan");
        set.add("anshika");
        set.add("vikash");
        System.out.println("set: "+set);

        LinkedHashSet<Integer> setInteger = new LinkedHashSet<>();
        setInteger.add(90);
        setInteger.add(75);
        setInteger.add(100);
        setInteger.add(99);
        setInteger.add(101);
        setInteger.add(102);
        setInteger.add(100);
        setInteger.add(103);
        setInteger.add(1004);
        setInteger.add(10);
        setInteger.add(15);

        setInteger.addFirst(150);


        System.out.println("setInteger: "+setInteger);
        if(set.contains("ansh"))
        {
            System.out.println("ansh found in set");
        }
        else
        {
            System.out.println("ansh not found in set");
        }
        if(setInteger.contains(101))
        {
            System.out.println("101 found in set integer");
        }

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("vikash");
        treeSet.add("ashwin");
        treeSet.add("yuvraj");
        treeSet.add("anshika");
        treeSet.add("gunjan");
        treeSet.add("anshika");
        treeSet.add("vikash");
        System.out.println("treeSet: "+treeSet);

        treeSet.pollFirst();
        System.out.println("treeSet: "+treeSet);
        System.out.println(treeSet.higher("vikash"));
        System.out.println("treeSet: "+treeSet);
        System.out.println(treeSet.ceiling("vikash"));
        System.out.println(treeSet.floor("vikash"));

        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        treeSetInteger.add(10);
        treeSetInteger.add(20);
        treeSetInteger.add(30);
        System.out.println(treeSetInteger.ceiling(25));
        System.out.println(treeSetInteger.floor(25));
    }
}
