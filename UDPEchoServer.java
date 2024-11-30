import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPEchoServer {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket(9876)) {
            System.out.println("Server is running...");
            byte[] buffer = new byte[1024];
            while (true) {
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet);
                String received = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Received: " + received);
                packet = new DatagramPacket(packet.getData(), packet.getLength(), packet.getAddress(), packet.getPort());
                socket.send(packet);
                System.out.println("Echoed: " + received);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

