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

    public void sendMessage(String message) {
        outMessage.println(message);
        outMessage.flush();
    }

    public void closeConnection() {
        server.removeClient(this);
        clientCount--;
        server.sendMessageToAllClients(String.valueOf(clientCount));
    }

    @Override
    public void run() {
        try {
            while (true) {
                server.sendMessageToAllClients("NEW CLIENT");
                server.sendMessageToAllClients(clientCount + "");
                break;
            }

            while (true) {
                String clientMessage = inMessage.nextLine();
                if (clientMessage.equals("END")) {
                    break;
                }
                System.out.println(clientMessage);  // for us
                server.sendMessageToAllClients(clientMessage);  // for clients
            }

//            Thread.sleep(100);

        } catch (Exception e) {

        }
    }
}
