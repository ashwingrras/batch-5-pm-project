package org.example.collections_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMappingExample {
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();
        names.add("vikash");
        names.add("Raju");
        names.add("Ashwin");
        Collections.sort(names);
        System.out.println("names: "+names);
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperCaseNames);
    }
}

