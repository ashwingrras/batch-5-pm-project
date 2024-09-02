package org.example.collections_framework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortingExample {
    public static void main(String[] args) {
        // Creating an ArrayList of strings
        List<String> names = new ArrayList<>();
        names.add("Ashwin");
        names.add("Aman");
        names.add("Yuvraj");
        names.add("Gunjan");

        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedNames);
    }
}

