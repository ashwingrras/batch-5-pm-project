package org.example.networking;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
class MyServer2
{
public static void main(String args[])throws Exception
    {
    ServerSocket ss=new ServerSocket(1234);
    Socket s=ss.accept();
    DataInputStream din=new DataInputStream(s.getInputStream());
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    String str="",str2="";
    while(!str.equals("exit"))
    {
        str=din.readUTF();
        System.out.println("client says: "+str);
        str2=br.readLine();
        dout.writeUTF(str2);
        dout.flush();
    }
    din.close();
    s.close();
    ss.close();
    }
}