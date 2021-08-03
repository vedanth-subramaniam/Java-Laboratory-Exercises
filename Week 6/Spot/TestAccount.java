import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SavingsAccount test = new SavingsAccount(100, "Vedanth", 4000.0);
        System.out.println(test.cal_interest());
        System.out.println("hi");

        while (true) {
            System.out.println("1) Savings Account\n2) Checkings Account\n-1 -> Exit");
            System.out.print("Enter account type - ");
            int accountChoice = scanner.nextInt();
            int functionChoice;

            int accountNo;
            String accountName;
            double accountBalance;
            Account account;
            System.out.println("------INTEREST FOR SAVINGS ACCOUNT------");

            switch (accountChoice) {

            case 1:
                accountNo = inputAccountNumber();
                accountName = inputAccountName();
                accountBalance = inputAccountBalance();
                bankFunction(new SavingsAccount(accountNo, accountName, accountBalance));
                break;

            case 2:
                accountNo = inputAccountNumber();
                accountName = inputAccountName();
                accountBalance = inputAccountBalance();
                bankFunction(new CheckingsAccount(accountNo, accountName, accountBalance));
                break;

            case -1:
                System.out.println("Quitting Program.");
                System.exit(0);

            default:
                System.out.println("Invalid Choice!");
                break;
            }
        }

    }

    public static int inputAccountNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Number - ");
        int accountNo = scanner.nextInt();
        return accountNo;
    }

    public static String inputAccountName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Name - ");
        String accountName = scanner.next();
        return accountName;
    }

    public static Double inputAccountBalance() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Balance - ");
        Double accountBalance = scanner.nextDouble();
        return accountBalance;
    }

    public static Double inputAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Amount - ");
        Double amount = scanner.nextDouble();
        return amount;
    }

    public static void bankFunction(Account account) {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println(
                    "1) Deposit\n2) Withdraw\n3) Check Instance\n4) Calculate Interest\n-1 -> Exit Function");
            System.out.print("Enter choice - ");
            int functionChoice = scanner.nextInt();

            double amount;

            switch (functionChoice) {

            case 1:
                amount = inputAmount();
                account.deposit(amount);
                break;

            case 2:
                amount = inputAmount();
                account.withdraw(amount);
                break;

            case 3:
                if (account instanceof Account) {
                    System.out.println(account.getClass().getName() + " is an instance of Account");
                } else {
                    System.out.println(account.getClass().getName() + " is not an instance of Account");
                }
                break;

            case 4:
                 System.out.println("Interest for balance is " + account.cal_interest() + "%");
                break;

            case -1:
                System.out.println("Leaving Bank Function.");
                return;

            default:
                System.out.println("Invalid Choice!");
                break;
            }
        }
    }

}
