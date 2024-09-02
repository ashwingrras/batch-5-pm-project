package org.example.collections_framework;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ArrayListExample2
{
    public static void main(String[] args)
    {
        ArrayList<Product> productArrayList = new ArrayList<>();
        //
        Product product1 = new Product();
        product1.setProductId(1001);
        product1.setName("mac book air m3");
        product1.setDescription("mac book air, 8 GB Ram, 512 GB SSD");
        product1.setBrand("Apple");
        product1.setPrice(135000.00);
        //
        Product product2 = new Product();
        product2.setProductId(1001);
        product2.setName("asus high fly");
        product2.setDescription("16 GB Ram, 1 TB SSD, Windows 10 with office");
        product2.setBrand("Asus");
        product2.setPrice(85000.00);

        productArrayList.add(product1);
        productArrayList.add(product2);


        getProductsCount(productArrayList);

        ArrayList<Users> usersArrayList1 = new ArrayList<>();
        ArrayList<Users> usersArrayList3 = new ArrayList<>();
        Users users = new Users();
        users.setId(101);
        usersArrayList1.add(users);
        usersArrayList1.add(users);
        usersArrayList3.add(users);
        usersArrayList1.addAll(usersArrayList3);
        System.out.println("usersArrayList1 size before remove "+usersArrayList1.size());
        usersArrayList1.remove(users);

        System.out.println("usersArrayList1 size after remove "+usersArrayList1.size());
        usersArrayList1.removeAll(usersArrayList3);
        System.out.println("usersArrayList1 size after removeAll "+usersArrayList1.size());
        usersArrayList1.add(new Users());
        usersArrayList1.add(new Users());
        usersArrayList1.add(new Users());

        ArrayList<Users> usersArrayList2 = new ArrayList<>();
        usersArrayList2.addFirst(new Users());
        usersArrayList2.addFirst(users);
        usersArrayList2.addFirst(users);
        //usersArrayList.remove(new Users());
        System.out.println("list1 size: "+usersArrayList1.size());
        System.out.println("list2 size: "+usersArrayList2.size());
        usersArrayList2.removeAll(usersArrayList1);
        System.out.println("list2 size: "+usersArrayList2.size());
        System.out.println("list 1 size: "+usersArrayList1.size());
        for (Users users1 : usersArrayList1)
        {
            System.out.println(users1.getName());
        }
        usersArrayList2.forEach( user ->
                {
                    System.out.println(user.getName());
                }
        );
        // Predicate
        //usersArrayList1.stream();
        // add
        // remove
        // get
        // clear
        // addAll
    }


    public static int getProductsCount(ArrayList<Product> productArrayList)
    {
        int count = 0;
        System.out.println(productArrayList.get(0).getDescription());
        return productArrayList.size();

    }

}
