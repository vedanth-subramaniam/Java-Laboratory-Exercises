public class SavingsAccount extends Account {
    int numOfTransactions;

    public SavingsAccount(int _accountNo, String _accountName, Double _balance) {
        super(_accountNo, _accountName, _balance);
        setnumOfTransactions(0);

    }

    void deposit(Double _amount) throws Exception {

        if (getnumOfTransactions() >= 5) {
            throw new Exception("---No more transactions possible---");
        } else {
            System.out.println("\n---Depositing---");
            setbalance(getbalance() + _amount);
            setnumOfTransactions(getnumOfTransactions() + 1);
            System.out.println(this);
        }

    }

    Double withdraw(Double _amount) throws Exception {

        if (getnumOfTransactions() >= 5)  {

            throw new Exception("---No more transactions possible---");
        } else {
            System.out.println("\n---Withdrawing---");
            if (getbalance() - _amount < 0) {
                throw new Exception("---Can't withdraw. Balance should be >=0 after withdrawal---");
            } else {
                setbalance(getbalance() - _amount);
                setnumOfTransactions(getnumOfTransactions() + 1);
            }
            System.out.println(this);
            return getbalance();
        }
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
