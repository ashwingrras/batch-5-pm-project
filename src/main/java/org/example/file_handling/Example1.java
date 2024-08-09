package org.example.file_handling;

import java.io.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Example1
{
    public static void main(String[] args)
    {
        File file = new File("src/main/java/vikash");
        //System.out.println(file.mkdir());
        file.mkdir();
        //file.delete();
        //file = new File("src/main/java/vikash/test1.txt");

        System.out.println(file.exists());
        try
        {
            file.createNewFile();
            System.out.println(file.exists());
            // File Writer
            Writer writer = new FileWriter("src/main/java/vikash/test1.txt",false);
            writer.write("A, yogesh ");
            writer.write(", gunjan ");
            writer.flush();
            writer.close();

            //File Reader
            Reader reader = new FileReader("src/main/java/vikash/test1.txt");
            /*int value = reader.read();
            while(value != -1)
            {
                System.out.print((char)value);
                value = reader.read();
            }*/

            BufferedReader bufferedReader = new BufferedReader(reader);
            System.out.println("readLine with bufferReader: "+bufferedReader.readLine());

            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(" abcd ");
            bufferedWriter.write(" xyz ");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
