package org.example.collections_framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;


/*

    "small_coffee" : "50 Rs"
    "medium_coffee" : "75 Rs"
    "large_coffee" : "100 Rs"

    A


 */

public class MapExample1
{
    public static void main(String[] args)
    {
        /*
            1. vikash, 1001
            2. yuvraj, 1002
            { '1001':''vikash, '1002': 'yuvraj' }
         */

        Map<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(1001,"vikash");
        hashMap1.put(1002,"yuvraj");
        System.out.println("hashmap1: "+hashMap1);
        System.out.println(hashMap1.get(1002));
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aman");
        for(String item : arrayList)
        {
            System.out.println(item);
        }
        for(Map.Entry<Integer, String> value : hashMap1.entrySet())
        {
            //System.out.println("value :"+value);
            System.out.println("key : "+value.getKey());
            System.out.println("value : "+value.getValue());
        }
        hashMap1.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer key, String value) {
                System.out.println("forEach  key: "+key);
                System.out.println("forEach  value: "+value);
            }
        });

        HashMap<Integer, Users> usersHashMap = new HashMap<>();
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

        usersHashMap.put(1101,users1);
        System.out.println("usersHashMap: "+usersHashMap);
        System.out.println(usersHashMap.get(1101).name);

    }
}
