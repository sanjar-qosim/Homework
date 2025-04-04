package chat2;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) { // Открываем сервер на порту 12345
            System.out.println("Сервер запущен, ожидаем подключение...");

            Socket clientSocket = serverSocket.accept(); // Ждем клиента
            System.out.println("Клиент подключился!");

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            String message;
            while ((message = in.readLine()) != null) { // Читаем данные от клиента
                System.out.println("Клиент: " + message);
                out.println("Сервер получил: " + message); // Отправляем ответ
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
