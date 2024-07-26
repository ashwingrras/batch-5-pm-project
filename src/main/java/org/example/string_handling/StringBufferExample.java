package org.example.string_handling;

import java.util.Date;

public class StringBufferExample
{
    public static void main(String[] args)
    {
        // immutable
        String name = "vikash";
        name += " saini";
        System.out.println("name: "+name);
        // mutable and thread-safe
        StringBuffer stringBuffer = new StringBuffer(); // 16 default capacity
        System.out.println(stringBuffer.capacity());//16
        // new capacity: current capacity * 2 + 2;
        stringBuffer.append("vikash ");
        stringBuffer.append("kumar ");
        stringBuffer.append("saini ");
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer);
        String value = ""+stringBuffer;

        StringBuilder sb = new StringBuilder("anshika"); //16

        // Getting the current capacity
        System.out.println("Initial capacity: " + sb.capacity());

        // Ensuring capacity
        sb.ensureCapacity(49);
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());

        // Setting length
        sb.setLength(3);
        System.out.println("After setLength(3): " + sb);

        // mutable and thread-unsafe
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.capacity());//16
        stringBuilder.append("vikash ");
        stringBuilder.append("kumar ");
        stringBuilder.append("saini ");
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder);

        StringBuffer stringBuffer1 = new StringBuffer();
        Date startDateStringBuffer = new Date();
        System.out.println("before loop, datetime: "+startDateStringBuffer);
        for(int i=0; i < 100000; i++)
        {
            stringBuffer1.append(i);
        }
        Date endDateStringBuffer = new Date();
        System.out.println("after loop, datetime: "+endDateStringBuffer);
        long timeDiffStringBuffer = endDateStringBuffer.getTime() - startDateStringBuffer.getTime();
        System.out.println("time diff: "+timeDiffStringBuffer);
        ////
        StringBuffer stringBuilder1 = new StringBuffer();
        Date startDateStringBuilder = new Date();
        System.out.println("before loop, datetime: "+startDateStringBuilder);
        for(int i=0; i < 100000; i++)
        {
            stringBuilder1.append(i);
        }
        Date endDateStringBuilder = new Date();
        System.out.println("after loop, datetime: "+endDateStringBuilder);
        long timeDiffStringBuilder = endDateStringBuilder.getTime() - startDateStringBuilder.getTime();
        System.out.println("time diff: "+timeDiffStringBuilder);

        String a = "a";
        String b = "b";
        System.out.println(b.compareTo(a));

    }
}
