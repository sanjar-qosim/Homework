package server;

import java.io.*;
import java.net.Socket;

public class ClientApp {

    public static void main(String[] args) {
        try (
                Socket clientSocket = new Socket("localhost", 8100);
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
        ) {

            bufferedWriter.write("Hello, I am client");
            bufferedWriter.newLine();
            bufferedWriter.flush();

            for (int i = 0; i < 8; i++) {
                String response = bufferedReader.readLine();
                System.out.println(response);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
