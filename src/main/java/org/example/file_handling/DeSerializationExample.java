package org.example.file_handling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationExample
{
    public static void main(String[] args)
    {
        {
            try
            {
                //DeSerialization
                FileInputStream fis = new FileInputStream("src/main/java/vikash/student.ser");
                ObjectInputStream ois = new ObjectInputStream(fis);
                Student student = (Student) ois.readObject();
                System.out.println(student.name);
                ois.close();
                System.out.println("DeSerialization success");
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
