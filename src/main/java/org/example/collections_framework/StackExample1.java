package org.example.collections_framework;

import java.util.Stack;
import java.util.Vector;

public class StackExample1
{

    public static void main(String[] args)
    {
        Stack<Integer> stack1 = new Stack<>();
        stack1.add(10);
        stack1.add(15);
        stack1.add(9);
        stack1.add(8);
        stack1.push(30);
        stack1.addElement(35);
        System.out.println(stack1);
        System.out.println(stack1.pop());
        System.out.println(stack1);
        stack1.removeLast();
        System.out.println(stack1);
        System.out.println(stack1.peek());
        System.out.println(stack1);
        stack1.removeIf(item -> item > 14);
        System.out.println(stack1);

        Vector<String> vector1 = new Vector<>();
    }
}
