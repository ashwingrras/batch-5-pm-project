package org.example.recursive_method;


public class ReverseString {

    private static String reverse(String str, int index)
    {
        if (index < 0)
        {
            return "";
        }
        return str.charAt(index) + reverse(str, index - 1);
    }
    public static String reverse(String str)
    {
        return reverse(str, str.length() - 1);
    }

    public static void main(String[] args) {
        String original = "Vikash";
        String reversed = reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}

