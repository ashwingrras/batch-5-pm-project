package org.example.file_handling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.rmi.RemoteException;

public class PrintWriterExample
{
    public static void main(String[] args) throws IOException {
        Writer writer = null;
        PrintWriter printWriter = null;
        try
        {
             writer = new FileWriter("src/main/java/vikash/test1.txt",false);
             printWriter = new PrintWriter(writer);
             printWriter.close();
             writer.close();
             printWriter.println(50.55);
             printWriter.write(65);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            writer.close();
            printWriter.close();
        }
    }
}
