import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadedTCPServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(6789)) {
            while (true) {
                Socket clientSocket = serverSocket.accept();
                new Thread(new ClientHandler(clientSocket)).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static class ClientHandler implements Runnable {
        private final Socket clientSocket;

        ClientHandler(Socket socket) {
            this.clientSocket = socket;
        }

        @Override
        public void run() {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
                String line;
                int wordCount = 0;
                while (!(line = in.readLine()).equals("xxxx")) {
                    wordCount += line.split("\\s+").length;
                }
                System.out.println("Total words: " + wordCount);
                clientSocket.close();
            } catch (Exception e) {
                System.out.println("Error in ClientHandler: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
