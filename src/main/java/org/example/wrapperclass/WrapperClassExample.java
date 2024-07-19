package org.example.wrapperclass;

import java.util.ArrayList;

/*
        int: Integer
        float: Float
        double: Double



 */
public class WrapperClassExample
{
    public static void main(String[] args)
    {
        int a = 10; // default value 0
        Integer b = a; // default value null
        int c = b; // un boxing
        float f = 10.9f;
        int aa = (int) 10.0;
        Float ff = 10.9f; // auto boxing
        Float gg = Float.valueOf(10.9f);
        ArrayList<Float> arrayList = new ArrayList<>();
    }
}
