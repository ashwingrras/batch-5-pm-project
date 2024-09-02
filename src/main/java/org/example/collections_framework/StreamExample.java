package org.example.collections_framework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("count: "+evenNumbers.stream().count());
        System.out.println(evenNumbers);
    }
}


