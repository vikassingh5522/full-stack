	// Program to where client send the string to server to convert it to uppercase and send
	// back to client after converting

    import java.io.*;
    import java.net.*;
    
    public class UppercaseServer {
        public static void main(String[] args) {
            try (ServerSocket serverSocket = new ServerSocket(12345)) {
                System.out.println("Server is listening on port 12345");
                Socket socket = serverSocket.accept();
                System.out.println("Client connected");
    
                InputStream input = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true);
    
                String text;
    
                do {
                    text = reader.readLine();
                    System.out.println("String Received: " + text);
                    if (text != null && !text.equalsIgnoreCase("exit")) {
                        String uppercasedText = text.toUpperCase();
                        writer.println(uppercasedText);
                    }
                } while (text != null && !text.equalsIgnoreCase("exit"));
    
                System.out.println("Client disconnected");
    
            } catch (IOException ex) {
                System.out.println("Server exception: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }
    