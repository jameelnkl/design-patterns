import java.net.InetAddress;

public class InetAddressExample2 {
    public static void main(String[] args) {
        try {
            String[] hosts = {"localhost", "cnn.com"};
            for (String host : hosts) {
                try {
                    InetAddress address = InetAddress.getByName(host);
                    System.out.println("Host: " + host);
                    System.out.println("IP Address: " + address.getHostAddress());
                    InetAddress[] allAddresses = InetAddress.getAllByName(host);
                    for (InetAddress addr : allAddresses) {
                        System.out.println("All Addresses: " + addr.getHostAddress());
                    }
                } catch (Exception e) {
                    System.out.println("Unable to resolve host: " + host);
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

