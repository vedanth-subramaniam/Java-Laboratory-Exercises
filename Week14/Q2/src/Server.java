import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        byte[] receiveBytes = new byte[256];
        final int SERVER_PORT = 8080;
        final String TERMINATE = "exit";
        System.out.println("Server established..");
        try (DatagramSocket ds = new DatagramSocket(SERVER_PORT); Scanner sc = new Scanner(System.in);) {
            while (!ds.isClosed()) {

                DatagramPacket dp = new DatagramPacket(receiveBytes, receiveBytes.length);
                ds.receive(dp);
                String dataString = new String(dp.getData(), "UTF-8");
                if (dataString.trim().equalsIgnoreCase(TERMINATE)) {
                    break;
                }
                System.out.println("Client:" + dataString);
                String input = sc.nextLine();

                DatagramPacket sendPacket = new DatagramPacket(input.getBytes(), input.getBytes().length,
                        dp.getAddress(), dp.getPort());
                ds.send(sendPacket);
            }
            ds.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}