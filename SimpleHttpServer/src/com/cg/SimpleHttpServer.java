package com.cg;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;

public class SimpleHttpServer {
	public static void main(String[] args) throws IOException {
        // Create a new HTTP server on port 8000
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        
        // Create a context for the root path "/"
        server.createContext("/", new MyHandler());
        
        // Start the server
        server.start();
        
        System.out.println("Server is running on port 8000");
    }
	static class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // Send a response back to the client
            String response = "Hello World!";
            exchange.sendResponseHeaders(200, response.getBytes().length);
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}
