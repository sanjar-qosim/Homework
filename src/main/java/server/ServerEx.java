package server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8100)) {
            System.out.println("Server is running...");

            while(true) {
                try (
                        Socket socket = serverSocket.accept();
                        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                ) {
                    System.out.println("Client connected...");
                    String request = reader.readLine();
                    String response = String.format("Hello, your request = %s", request);
                    writer.write(response);
                    writer.newLine();
                    writer.flush();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
