package org.example.networking;

import java.io.DataOutputStream;
import java.net.Socket;
public class MyClient {
    public static void main(String[] args) {
        try{
            System.out.println("at MyClient");
            Socket socket = new Socket("localhost",3000); // for client
            DataOutputStream dout=new DataOutputStream(socket.getOutputStream());
            dout.writeUTF("Hello Server, how are you");
            dout.flush();
            dout.close();
            socket.close();
        }catch(Exception e){System.out.println(e);}
    }
}
