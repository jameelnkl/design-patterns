import java.io.BufferedReader;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) {
        String fileName = args[0];
        String serverName = args[1];
        try (Socket socket = new Socket(serverName, 6789);
             PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
             BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                out.println(line);
            }
            out.println("xxxx");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
