import java.util.Scanner;

public class TestAccount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            int functionChoice;

            int accountNo;
            String accountName;
            double accountBalance;
            Account account;
            accountNo = inputAccountNumber();
            accountName = inputAccountName();
            accountBalance = inputAccountBalance();
            bankFunction(new SavingsAccount(accountNo, accountName, accountBalance));        
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

            System.out.println("1) Deposit\n2)Withdraw\n");
            System.out.print("Enter choice - ");
            int functionChoice = scanner.nextInt();

            double amount;

            switch (functionChoice) {

                case 1:
                    amount = inputAmount();
                    DepositThread depositThread = new DepositThread(account,amount);
                    depositThread.start();
                    break;

                case 2:
                    amount = inputAmount();
                    WithdrawThread withdrawThread = new WithdrawThread(account,amount);
                    withdrawThread.start();
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
