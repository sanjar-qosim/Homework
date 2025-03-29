package chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

    private static final int PORT = 8585;
    private ArrayList<ClientHandler> clients = new ArrayList<>();

    public Server() throws IOException {

            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Server is running!");
            Socket clientSocket = null;
        try {
            while (true) {
                clientSocket = serverSocket.accept();
                ClientHandler client = new ClientHandler(clientSocket, this);
                clients.add(client);
            }
        } catch (Exception e) {

        } finally {
            clientSocket.close();
            serverSocket.close();
        }
    }

    public void sendMessageToAllClients(String message){
        for (ClientHandler tmp : clients) {
            tmp.sendMessage(message);
        }
    }

    public void removeClient(ClientHandler clientHandler) {
        clients.remove(clientHandler);
    }

    public static void main(String[] args) throws IOException {
        Server server = new Server();
    }
}
