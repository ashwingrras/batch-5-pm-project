package org.example.string_handling;

public class FoundRepeatCharacter
{

    public static void main(String[] args)
    {
        // Q: "gunjan", result: [n]
        // Q: "aashish" result: [a,s,h]
        String value = "aaabbaabbaa";
        int valueLength = value.length();
        String repeatedStr = "";
        for(int i=0; i < valueLength; i++)
        {
            char strChar = value.charAt(i);
            int count = 1;
            for(int j=i+1; j < valueLength;j++)
            {
                char otherChar = value.charAt(j);
                if(strChar == otherChar)
                {
                    count++;
                    break;
                }
            }
            if(count > 1)
            {
                //strChar =       a;
                // repeatedStr = "a"
                if(!repeatedStr.contains(""+strChar))
                {
                    repeatedStr += strChar;
                }
            }
        }
        System.out.println("repeatedStr "+repeatedStr);
    }
}
