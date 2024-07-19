package org.example.oops_examples;

import org.example.Main;

import java.util.Scanner;

public class Example2
{
    public static void main(String[] args)
    {
        System.out.println("OOPS example second");
        /*showData();
        Example1 example1 = new Example1();
        example1.showInfo();
        example1.sum(3, 6);*/
        Student student1  = new Student(101, "raju", 22);
        System.out.println("student name = "+student1.name);
        Student student2  = new Student(102, "yuvraj", 20);
        System.out.println("student name = "+student2.name);
        student1  = new Student(103, "yogesh", 21);
        System.out.println("student name = "+student1.name);
        System.out.println("------------------------------");
        Users users = new Users();
        users.setAge(32);
        users.setId(201);
        users.setName("Ashwin");
        System.out.println(users.name);
        System.out.println(users.getName());
    }

    public void showInfo()
    {
        System.out.println("at showInfo");
    }

    public static void showData()
    {
        System.out.println("at showData");
    }

    // access modifier,
    double sum()
    {
        System.out.println("at sum method");
        return 0.0;
    }
}
