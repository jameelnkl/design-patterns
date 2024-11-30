import java.net.InetAddress;

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("IP Address: " + localHost.getHostAddress());
            System.out.println("Hostname: " + localHost.getHostName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
