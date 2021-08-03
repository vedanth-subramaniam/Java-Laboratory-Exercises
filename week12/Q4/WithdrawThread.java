public class WithdrawThread extends Thread{

    Account account;
    double amount;

    public WithdrawThread(Account savingsAccount,double amount) {
        this.account = savingsAccount;
        this.amount = amount;
    }

    @Override
    public void run() {
        synchronized (account) {
            try{
                WithdrawThread.sleep(3000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            account.withdraw(amount);
        }
    }
}