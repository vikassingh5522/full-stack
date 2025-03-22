// Chatting Appication

import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 12345;

        try (Socket socket = new Socket(hostname, port)) {
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            String text;

            new Thread(new ServerHandler(reader)).start();

            System.out.println("Enter text (type 'exit' to quit):");

            do {
                System.out.print("Client: ");
                text = consoleReader.readLine();
                writer.println(text);

            } while (!text.equalsIgnoreCase("exit"));

        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}

class ServerHandler implements Runnable {
    private BufferedReader reader;

    public ServerHandler(BufferedReader reader) {
        this.reader = reader;
    }

    public void run() {
        try {
            String response;
            while ((response = reader.readLine()) != null) {
                System.out.println("Server: " + response);
            }
        } catch (IOException ex) {
            System.out.println("ServerHandler exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
