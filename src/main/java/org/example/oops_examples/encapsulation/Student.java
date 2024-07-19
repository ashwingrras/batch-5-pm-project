package org.example.oops_examples.encapsulation;

/*
            Product:
            name, price,
            brand = "puma",
            seller name,
            origion, discount, mfg, qty,
            discount
            collection: "winter","summer","spring"
            category: "men","women,"kids"
            color
            sizeId: "XL"

 */

public class Student
{

    private int id;
    private String name;
    private String course;
    //Aggregation
    private Address address;
    Student(int id, String name, String course, Address address)
    {
        this.id = id;
        this.name = name;
        this.course = course;
        this.address = address;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getCourse()
    {
        return course;
    }

    public Address getAddress()
    {
        return address;
    }


}
