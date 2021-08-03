import java.util.Scanner;

public class SavingsAccount extends Account implements Calculate {
    Scanner scanner = new Scanner(System.in);

    int numOfTransactions;

    public SavingsAccount(int _accountNo, String _accountName, Double _balance) {
        super(_accountNo, _accountName, _balance);
        setnumOfTransactions(0);
    }
    void deposit(Double _amount) {
        System.out.println("\n---Depositing---");
        if (getnumOfTransactions() == 3) {
            System.out.println("Maximum Transactions reached.");
        } else {
            setbalance(getbalance() + _amount);
            setnumOfTransactions(getnumOfTransactions() + 1);
        }
        System.out.println(this);
    }
    public double cal_interest() {
        System.out.print("Enter time period (in years) - ");
        int years = scanner.nextInt();

        double interest = (getbalance() * years * interest_rate) / 100;

        return interest;
    }
    Double withdraw(Double _amount) {
        System.out.println("\n---Withdrawing---");
        if (getbalance() - _amount < 0) {
            System.out.println("Can't withdraw. Balance should be >=0 after withdrawal!");
        } else {
            setbalance(getbalance() - _amount);
            setnumOfTransactions(getnumOfTransactions() + 1);
        }
        System.out.println(this);
        return getbalance();
    }

    @Override
    public String toString() {
        return this.getaccountNo() + " - " + this.getaccountName() + " - " + this.getbalance() + " - "
                + this.getnumOfTransactions() + "\n";
    }

    public void setnumOfTransactions(int _numOfTransactions) {
        this.numOfTransactions = _numOfTransactions;
    }

    public int getnumOfTransactions() {
        return this.numOfTransactions;
    }
}
