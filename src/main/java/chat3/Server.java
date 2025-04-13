package chat3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8100)) {
            System.out.println("Server is running...");
            Socket socket = serverSocket.accept();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bufferedWriter =  new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            System.out.println("Client connected...");
            String response;
            while ((response = bufferedReader.readLine()) != null) {
                System.out.println("Client: " + response);
                bufferedWriter.write("The message was received.");
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

