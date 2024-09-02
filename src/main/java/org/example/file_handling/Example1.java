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
        file.mkdir(); // it will create directory / folder
        //file.delete();
        file = new File("src/main/java/vikash/test1.txt");

        System.out.println(file.exists());
        try
        {
            file.createNewFile(); // it will create file. ex: test.txt
            System.out.println(file.exists());
            // File Writer
            Writer writer = new FileWriter("src/main/java/vikash/test1.txt",false);
            writer.write("A, yogesh ");
            writer.write(", gunjan ");
            writer.write(66);
            //writer.close();

            //jahanvi
            //File Reader
            Reader reader = new FileReader("src/main/java/vikash/test1.txt");
            /*
            int value = reader.read();// it will give ascii value
            int index = 1;
            while(value != -1)
            {
                System.out.print((char)value);
                value = reader.read();
                index++;
            }
            System.out.println("index: "+index);
            */
            BufferedReader bufferedReader = new BufferedReader(reader);
            System.out.println("readLine with bufferReader: "+bufferedReader.readLine());


            //BufferWriter
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(" abcd ");
            bufferedWriter.write(" xyz ");

            bufferedWriter.flush();//
            writer.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
