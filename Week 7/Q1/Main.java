import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean flag;
        Scanner scanner = new Scanner(System.in);
        int membershipno = 0;
        double membershipfee = 0;
        String name = null;

        flag = true;
        do {
            try {
                System.out.print("Enter Library Member Name - ");
                name = scanner.next();
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("----Enter valid member name----");
            } finally {
                scanner.nextLine();
                System.out.println();
            }

        } while (flag);

        flag = true;
        do {
            try {
                System.out.print("Enter Library Membership ID - ");
                membershipno = scanner.nextInt();
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("----Enter valid membership ID----");
            } finally {
                scanner.nextLine();
                System.out.println();
            }

        } while (flag);

        flag = true;
        do {
            try {
                System.out.print("Enter Library Membership Fee - ");
                membershipfee = scanner.nextDouble();
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("----Enter valid membership Fee----");
            } finally {
                scanner.nextLine();
                System.out.println();
            }

        } while (flag);

        LibraryMember obj = new LibraryMember(name, membershipno, membershipfee);
        System.out.println("Using toString()\n" + obj);

        System.out.println("\nUsing getname() -> " + obj.getname() + "\n\n");

        System.out.println("Creating an object using default constructor\n");

        try {
            LibraryMember obj2 = new LibraryMember();
        } catch (Exception e) {
            System.out.println(e);
        }

        scanner.close();

    }
}