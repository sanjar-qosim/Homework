package chat;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static final int PORT = 8585;

    public Server() {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Server is running!");
            Socket clientSocket = serverSocket.accept();

            while (true) {
                clientSocket = serverSocket.accept();
            }
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        Server server = new Server();
    }
}
