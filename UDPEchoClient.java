import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPEchoClient {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket()) {
            InetAddress address = InetAddress.getByName("localhost");
            byte[] buffer = "Hello, UDP Server".getBytes();
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 9876);
            socket.send(packet);
            packet = new DatagramPacket(new byte[1024], 1024);
            socket.receive(packet);
            System.out.println("Echo: " + new String(packet.getData(), 0, packet.getLength()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
