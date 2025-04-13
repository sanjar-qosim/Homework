package chat3;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8100)) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            Scanner scanner = new Scanner(System.in);

            while (true) {
                String request = scanner.nextLine();
                bufferedWriter.write(request);
                bufferedWriter.newLine();
                bufferedWriter.flush();
                String response = bufferedReader.readLine();
                System.out.println(response);

                if (request.equalsIgnoreCase("exit")) {
                    bufferedWriter.write("Thank you!");
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

