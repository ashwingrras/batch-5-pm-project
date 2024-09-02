package org.example.collections_framework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamUniqueCollectingExample {
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        Set<Integer> uniqueNumbers = numbers.stream()
                .collect(Collectors.toSet());

        System.out.println(uniqueNumbers);
    }
}


