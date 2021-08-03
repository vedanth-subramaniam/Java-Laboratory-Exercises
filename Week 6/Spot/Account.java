import java.util.Scanner;

abstract class Account implements Calculate{
    Scanner scanner = new Scanner(System.in);
    
    int accountNo;
    String accountName;
    double balance;

    public Account(int _accountNo, String _accountName, double _balance) {
        setaccountNo(_accountNo);
        setaccountName(_accountName);
        setbalance(_balance);
    }

    public double cal_interest() {
        System.out.print("Enter time period (in years) - ");
        int years = scanner.nextInt();

        double interest = (getbalance() * years * interest_rate) / 100;

        return interest;
    }

    public String toString() {
        return this.getaccountNo() + " - " + this.getaccountName() + " - " + this.getbalance() + "\n";
    }

    abstract void deposit(Double _amount);

    abstract Double withdraw(Double _amount);

    public void setaccountNo(int _accountNo) {
        this.accountNo = _accountNo;
    }

    public void setaccountName(String _accountName) {
        this.accountName = _accountName;
    }

    public void setbalance(Double _balance) {
        this.balance = _balance;
    }

    public int getaccountNo() {
        return this.accountNo;
    }

    public String getaccountName() {
        return this.accountName;
    }

    public Double getbalance() {
        return this.balance;
    }
}