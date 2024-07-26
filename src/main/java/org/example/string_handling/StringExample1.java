package org.example.string_handling;

import java.util.Arrays;

public class StringExample1
{
    public static void main(String[] args)
    {
        // primitive data type is mutable, a is mutable
        int a = 10;
        a = 5;
        // String in immutable in java
        String s = "vikash";
        s =  s.concat(" saini");
        System.out.println(s);
        ////
        String name1 = "gunjan";
        String name2 = new String("gunjan").intern();
        System.out.println("name1 == name2");
        System.out.println(name1 == name2); // java check reference here
        System.out.println("equals: "+name1.equals(name2)); //java check value here
        String name3 = name2.intern();
        System.out.println(" name2 == name 3");
        System.out.println(name2 == name3);
        System.out.println("contains: "+name2.contains("j"));
        char[] chars = new char[name1.length()];
        System.out.println("chars "+ Arrays.toString(chars));
        name3.getChars(0, 6, chars, 0);
        System.out.println("chars "+ Arrays.toString(chars));
        // vikash
        // aakash
        // ashwin
        //
        String dob1 = "14-10-1992";
        String dob2 = "1-5-2005";
        String[] dop1Split = dob2.split("-");
        System.out.println(Arrays.toString(dop1Split));
        String name4 = "jaipur , rajasthan";
        System.out.println(name4.substring(0,1));
        String value1 = "VIKASH";
        String value2 = "vikash";
        System.out.println(value1.toLowerCase());
        System.out.println(value1);
        System.out.println(value1 == value2);
        System.out.println(value1.equals(value2));
        System.out.println(value1.equalsIgnoreCase(value2));
        String  value3 = "               Rohit soni                                     ";
        //value3.trim();
        value3 = value3.strip();
        System.out.println(value3.length());
        System.out.println(value3);
        String value4 = "rohit";
        String value5 = "mohit"; // "anshika";
        System.out.println(value4.regionMatches(1,value5,1,4));
        String string = '\u2001'+" String space "+ '\u2001';
        System.out.println("Before: \"" + string+"\"");
        System.out.println("Before: \"" + string.length()+"\"");
        System.out.println("After trim: \"" + string.trim()+"\"");
        System.out.println("After trim: \"" + string.trim().length()+"\"");
        System.out.println("After strip: \"" + string.strip()+"\"");
        System.out.println("After strip: \"" + string.strip().length()+"\"");

        // first question: find count if ash found in string, using scanner class
        // for example
        /// Q: {"vikash","akash","ashwin", "anshika"};
        // ash: 3
        // ans: 1
        // vik: 1
        // a: 4

        // second question: reverse half string of left and right sight
        // Q: "vikash", result: "kivhsa"
        // Q: "ashwin", result: "hsaniw"

        // third question: found repeated character and store in array
        // Q: "gunjan", result: [n]
        // Q: "aashish" result: [a,s,h]

        // fourth question, find every character count:
        // Q: "aashish": result [2,2,2,1]
        String aa= "abcd";
        System.out.println(Arrays.toString(aa.getBytes()));

        //  fifth question, find total vowel and consonant
        // Q:  "ashish", v = 2, c = 4

        // sixth question, arrange character in alphabetically
        // "abdacgh",  "aabcdgh"
        // "ashish" "aihhss"

        // seventh question, mobile number validation
        // "979960540",
        // 10 digit, start first char only from 6 to 9 (6, 7, 8, 9)


    }
}
