import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

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
        int  flag = 1;
        int check;
        while(flag == 1)
        {
            System.out.println("Do you want to borrow(0) or return(1) or exit(-1)");
            check = scan.nextInt();
            if(check == 0)
            {
                System.out.print("Enter membership no and number of books to borrow\n");
                arr[scan.nextInt()].borrow(scan.nextInt());
            }
            else if (check == 1)
            {
                System.out.print("Enter membership no and number of books to return \n");
                arr[scan.nextInt()].return_number(scan.nextInt());
            }
            else 
                break;
        }
    }
}