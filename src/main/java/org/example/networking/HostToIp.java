package org.example.networking;


import java.net.InetAddress;
public class HostToIp
{
    public static void main(String[] args){
        try{
            InetAddress ip=InetAddress.getByName("www.grras.com");

            System.out.println("Host Name: "+ip.getHostName());
            System.out.println("IP Address: "+ip.getHostAddress());
        }catch(Exception e){System.out.println(e);}
    }
}
