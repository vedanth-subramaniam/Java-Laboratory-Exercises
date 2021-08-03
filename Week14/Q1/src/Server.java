import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    int portNo;
    public ObjectInputStream objectInputStream;
    public ObjectOutputStream objectOutputStream;

    public Server(int portNo) {
        this.portNo = portNo;
    }

    public void startServer() {
        try {
            ServerSocket serverSocket = new ServerSocket(portNo);

            while (true) {
                Socket socket = serverSocket.accept();
                objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                objectInputStream = new ObjectInputStream(socket.getInputStream());

                Loan loanInfo = (Loan) objectInputStream.readObject();
                System.out.println(loanInfo);

                Response response = compute(loanInfo);
                objectOutputStream.writeObject(response);

            }


        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
    }

    public Response compute(Loan loanInfo) {
        System.out.println("Calculating Monthly and Total Payment for " + loanInfo);
        double simpleInterest = (loanInfo.getLoanAmount() * loanInfo.getAnnualInterestRate() * loanInfo.getNumberOfYears()) / 100;

        double totalPayment = loanInfo.getLoanAmount() + simpleInterest;
        double monthlyPayment = totalPayment / (loanInfo.getNumberOfYears() * 12);

        return new Response(monthlyPayment, totalPayment);
    }

    public static void main(String[] args) {
        Server server = new Server(7000);
        server.startServer();
    }
}
