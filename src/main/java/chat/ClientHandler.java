package chat;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientHandler implements Runnable {

    private static int clientCount = 0;
    private Socket clientSocket = null;
    private Server server;
    private PrintWriter outMessage;
    private Scanner inMessage;

    public ClientHandler(Socket socket, Server server) {
        try {
            clientCount++;
            this.server = server;
            this.clientSocket = socket;
            this.outMessage = new PrintWriter(socket.getOutputStream());
            this.inMessage = new Scanner(socket.getInputStream());
        } catch (Exception e) {

        }
    }

    @Override
    public void run() {

    }
}
