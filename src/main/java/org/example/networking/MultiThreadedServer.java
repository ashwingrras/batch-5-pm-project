package org.example.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadedServer {
    private static final int PORT = 1234;

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(100);
        try
        {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Server is listening on port " + PORT);
            while (true) 
            {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");
                /////pool.execute(new ClientHandler(socket));
                pool.submit(new ClientHandler(socket));
            }
        } catch (IOException ex) 
        {
            ex.printStackTrace();
        }
    }
}

class ClientHandler implements Runnable {
    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() 
    {
        try
        {
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            String message;
            while ((message = input.readLine()) != null) 
            {
                System.out.println("Received Message: " + message);
                output.println("Message As: " + message);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
