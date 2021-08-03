import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private int portNo;
    private String server;
    private ObjectOutputStream objectOutputStream;
    private ObjectInputStream objectInputStream;

    public Client(int portNo, String server) {
        this.portNo = portNo;
        this.server = server;
    }

    public void startClient() {
        Socket socket = null;
        try {
            socket = new Socket(server, portNo);
        } catch (IOException ioException) {
            ioException.printStackTrace();
            System.exit(1);
        }

        try {
            objectInputStream = new ObjectInputStream(socket.getInputStream());
            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        } catch (IOException ioException) {
            ioException.printStackTrace();
            System.exit(1);
        }

        Loan loanInfo = getLoanInput();
        try {
            objectOutputStream.writeObject(loanInfo);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        try {
            Response response = (Response) objectInputStream.readObject();
            System.out.println("RESPONSE\n" + response);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }

    }

    public Loan getLoanInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Annual Interest Rate - ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter Number of years - ");
        int numberOfYears = scanner.nextInt();

        System.out.print("Enter loan amount - ");
        double loanAmount = scanner.nextDouble();

        return new Loan(annualInterestRate, numberOfYears, loanAmount);
    }


    public int getPortNo() {
        return portNo;
    }

    public void setPortNo(int portNo) {
        this.portNo = portNo;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public static void main(String[] args) {
        Client client = new Client(7000, "localhost");
        client.startClient();
    }
}
