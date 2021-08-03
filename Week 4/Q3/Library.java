import java.util.Scanner;

public class Library {
    public static void main(String args[]) {
        LibraryMember[] arr = new LibraryMember[3];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name, Membership Number, Membership Fee:\n");
            arr[i] = new LibraryMember(scan.next(), scan.nextInt(), scan.nextDouble());
            for (int j = 0; j < i; j++) {
                if (arr[j].getMembershipno() == arr[i].getMembershipno()) {
                    System.out.print("Member Number already exists.\n");
                    System.out.print("Enter a new membership number :");
                    arr[i].setMembershipno(scan.nextInt());
                }
            }
        }
        LibraryMember.searchDetails(1, arr);
        LibraryMember.searchDetails(2, arr);
    }
}
