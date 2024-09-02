package org.example.collections_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass
{
    public static void main(String[] args)
    {

        Users user = new Users();
        user.setId(101);
        user.setName("vikash");

        Address address = new Address();
        address.setAddressId(201);
        address.setArea("gopal pura");

        user.setAddress(address);

        String name = "vikash";
        String[] names = {"anshika","vikash","gunjan","jahanvi"};
        Users[] users = new Users[10];
        users[0] = user;
        System.out.println(Arrays.toString(users));
        Users users1 = users[0];
        System.out.println(users1.getName());
        Address[] addresses = new Address[6];

        // size: pre defined
        String[] strArray = new String[10];
        System.out.println(strArray.length);
        strArray[0] = "vikash";
        strArray[1] = "yogesh";
        System.out.println(strArray.length);

        // size: dynamic
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList.size()); // 0
        arrayList.add("anshika");
        arrayList.add("gunjan");
        arrayList.add("jahnanvi");
        System.out.println(arrayList.size()); // 3
        for(int i=0; i < arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i));
        }

        /*Integer a = null;
        int b = a;
        System.out.println(b);
        int c = 1;
        Integer d = c;*/

    }
}
