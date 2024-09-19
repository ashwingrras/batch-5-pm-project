package org.example.networking;

import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://fakestoreapi.com/products"); //https://www.example.com
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);
        System.out.println("Response Message: " + connection.getResponseMessage());
    }
}

