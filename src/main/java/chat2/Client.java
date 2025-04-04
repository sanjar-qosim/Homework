package chat2;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) { // Подключаемся к серверу
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введите сообщение для сервера: ");
            String message;
            while ((message = userInput.readLine()) != null) {
                out.println(message); // Отправляем серверу
                System.out.println("Ответ от сервера: " + in.readLine()); // Читаем ответ
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
