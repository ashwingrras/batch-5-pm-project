package org.example.collections_framework;

import java.util.ArrayList;
import java.util.List;

public class StreamReducingExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int sum = numbers.stream()
                .reduce(0, (subtotal, element) -> subtotal + element);

        System.out.println("Sum of all numbers: " + sum);
    }
}

