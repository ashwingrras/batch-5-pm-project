package org.example.oops_examples;

import org.example.Main;

import java.util.Arrays;
import java.util.Scanner;

/*
    OOPS (Object-Oriented Programming)

    1. class
    2. object
    3. constructor
    4. inheritance: inherit other class properties ( variable, methods)
    5. abstraction (abstract class and interface)
      1. abstract class: 0 to 100 %
      2. interface: 100 %
    6. polymorphism (method overloading and method overriding)
        method overloading (compile-time polymorphism)
        method overriding (runtime polymorphism)
        dynamic binding (method overriding): reference parent, object child (upcasting)
    7. encapsulation ( private access )
    8. aggregation
    9. initializer block, block statement

    10. non-static inner class
    11. static inner class
    12. anonymous class
    13. singleton class

    access modifier: public, default, protected and private

    package

    method:
    1. access modifier
    2. static
    3. return type: data type, array, arraylist, object
    4. method name: camelCase format
    5. paremeteres: data type, array, arraylist, object

    Recursive method

 */

public class Example1
{
    static int[] array = {1,3,4,2};
    static int a = 10;
    int b = 6;

    int c = 9;
    public static void main(String[] args)
    {
        System.out.println("OOPS example first, main method");
        showData();
        Example1 example1 = new Example1();
        example1.showInfo();
        example1.sum(1,5);
        Main main = new Main();
        main.showInfo();
        Student student = new Student(1, "aman",22);
        //System.out.println(student.id);
        ChildClass childClass = new ChildClass();
        childClass.sum();
        String[] names = {"a","b"};
        ChildClass.main(names);
        example1.getStudent(student);
    }

    public void showInfo()
    {
        System.out.println("at showInfo");
        sum(5, 4);
        int[] sortedArray = selectionSort(array);
        System.out.println(Arrays.toString(sortedArray));
        Student studentInfo = fetchStudentInfo(10, "vijay");
        System.out.println(studentInfo.name+", "+ studentInfo.age);
    }

    public static void showData()
    {
        System.out.println("at showData");
    }


    public void subtract()
    {
        System.out.println(a); // instance
        int a = 5;
        System.out.println(a); // local
        System.out.println(Example1.a); // static
    }

    // access modifier,
    public int sum(int a, int b)
    {
        System.out.println("at sum method");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("this = "+this);
        System.out.println("instance variable a value = "+this.a);
        return 0;
    }

    public Student fetchStudentInfo(int id, String name)
    {
        Student student = new Student(1, "aman", 20);
        System.out.println(student.name);
        return student;
    }

    public int[] selectionSort(int[] array)
    {
        int[] resultArray = new int[array.length];
        return  resultArray;
    }

    public Student getStudent(Student student)
    {

        return student;
    }

}

class ChildClass
{
    int id = 201;
    String name = "rohit";
    public static void main(String[] args)
    {
        System.out.println(" at child class main method");
    }

    public static void showData()
    {
        System.out.println("at showData");
    }

    // access modifier,
    public float sum()
    {
        System.out.println("at sum method");
        return 0.0f;
    }

}
