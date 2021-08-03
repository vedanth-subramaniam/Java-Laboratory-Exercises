public class DepositThread extends Thread{

    Account account;
    double amount;

    public DepositThread(Account savingsAccount,double amount) {
        this.account = savingsAccount;
        this.amount = amount;
    }

    @Override
    public void run() {
        synchronized (account) {
            account.deposit(amount);
        }

    }
}
