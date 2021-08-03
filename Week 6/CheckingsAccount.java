public class CheckingsAccount extends Account {

    public CheckingsAccount(int _accountNo, String _accountName, Double _balance) {
        super(_accountNo, _accountName, _balance);

    }

    void deposit(Double _amount) {
        System.out.println("\n~~Depositing~~");
        setbalance(getbalance() + _amount);
        System.out.println(this);
    }

    Double withdraw(Double _amount) {
        System.out.println("\n~~Withdrawing~~");
        if (getbalance() - _amount > 1000) {
            setbalance(getbalance() - _amount);
        } else {
            System.out.println("Can't withdraw. Minimum balance is 1000");
        }
        System.out.println(this);

        return getbalance();
    }

    @Override
    public String toString() {
        return this.getaccountNo() + "~~~~" + this.getaccountName() + "~~~~" + this.getbalance() + "\n";
    }

}
