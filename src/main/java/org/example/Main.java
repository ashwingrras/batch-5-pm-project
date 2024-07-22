package org.example;

import java.util.Scanner;
import org.example.oops_examples.Example1;

/*
    18 july ko test hai, topics: till date 13 july 2024
    1. data types
    2. variable
    3. operators
    4. control & looping statement
    5. Array
    6. Input ( Scanner class)
    7. OOPS
    8. Logical Questions
 */

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {




    public static void main(String[] args)
    {
        System.out.println("hello world");
        Example1 example1 = new Example1();
        example1.showInfo();
        example1.sum(2, 4);
    }

    public void showInfo()
    {
        System.out.println("at Main class showInfo");
    }
}