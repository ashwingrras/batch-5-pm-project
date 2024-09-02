package org.example.collections_framework;

import java.util.ArrayList;

public class ArrayListWithObject
{
    public static void main(String[] args)
    {

        ArrayList<Users> usersArrayList = new ArrayList<>();

        //Users Object
        Users users1 = new Users();
        users1.setId(1001);
        users1.setName("vikash");
        users1.setAge(20);
        users1.setMobileNo("9898980909");

        //Address Object
        Address address1 = new Address();
        address1.setAddressId(2001);
        address1.setPlotNo("70 A");
        address1.setArea("mansarovar");
        address1.setCity("jaipur");
        address1.setPincode("302020");
        address1.setState("rajasthan");

        users1.setAddress(address1);

        usersArrayList.add(users1);

    }
}
