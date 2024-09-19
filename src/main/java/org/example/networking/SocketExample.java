package org.example.networking;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketExample {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 1234);
        OutputStream output = socket.getOutputStream();
        output.write("Hello Server".getBytes());

        InputStream input = socket.getInputStream();
        byte[] buffer = new byte[1024];
        int bytesRead = input.read(buffer);
        System.out.println("Response: " + new String(buffer, 0, bytesRead));

        socket.close();
    }
}

