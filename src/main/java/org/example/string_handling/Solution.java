package org.example.string_handling;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Split the string on non-word characters
        String[] words = s.split("\\W+");
        System.out.println(words.length);
        // Print each word on a new line
        for (String word : words) {
            if (!word.isEmpty())
            { // This check is to avoid printing empty lines
                System.out.println(word);
            }

        }
        scan.close();
    }
}
