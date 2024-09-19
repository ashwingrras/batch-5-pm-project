package org.example.networking;

import java.net.InetAddress;

public class InetAddressExample {
    public static void main(String[] args) throws Exception {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println("Local Host: " + localHost);
        InetAddress google = InetAddress.getByName("google.in"); //www.google.com //cloud.digitalocean.com
        System.out.println("Google IP: " + google.getHostAddress());
    }
}

