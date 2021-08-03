import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        byte[] receiveBytes = new byte[256];
        final String TERMINATE = "exit";
        final int SERVER_PORT = 8080;
        System.out.println("Initiate chat..");
        try (Scanner sc = new Scanner(System.in); DatagramSocket ds = new DatagramSocket();) {

            final InetAddress SERVER_ADDRESS = InetAddress.getLocalHost();
            DatagramPacket dataPacket = null;
            while (!ds.isClosed()) {
                String input = sc.nextLine();
                dataPacket = new DatagramPacket(input.getBytes(), input.getBytes().length, SERVER_ADDRESS, SERVER_PORT);
                ds.send(dataPacket);
                if (input.trim().equalsIgnoreCase(TERMINATE)) {
                    break;
                }
                dataPacket = null;
                dataPacket = new DatagramPacket(receiveBytes, receiveBytes.length);
                ds.receive(dataPacket);
                System.out.println("Server:" + new String(receiveBytes, "UTF-8"));
            }
        } catch (SocketException | UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}