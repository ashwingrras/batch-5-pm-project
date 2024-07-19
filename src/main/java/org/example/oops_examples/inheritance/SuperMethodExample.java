package org.example.oops_examples.inheritance;

class Person

{
    int id;
    String name;

    Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}

class Employee extends Person

{
    double salary;

    Employee(int id, String name, double salary)
    {
        super(id, name);
        this.salary = salary;
    }
}



public class SuperMethodExample
{
    public static void main(String[] args)
    {
        Employee employee = new Employee(101, "vikash", 100000);
    }
}
