package org.example.oops_examples.encapsulation;

public class MainClass
{
    public static void main(String[] args)
    {
        Address address = new Address();
        address.setPlotNo("70 A");
        address.setArea("mansarovar");

        Student student = new Student(101, "vikash","java",address);

        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getCourse());

        Address address1 = student.getAddress();

        System.out.println(address1.getArea());
    }
}
