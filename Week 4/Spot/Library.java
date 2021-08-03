import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    public static void issueNotice(LibraryMember _librarymember, Date _today) {
        Date startDate = _librarymember.dateOfIssue;
        Date endDate = _today;

        long duration = endDate.getTime() - startDate.getTime();
        long diffInDays = TimeUnit.MILLISECONDS.toDays(duration);

        if (diffInDays > 7) {
            System.out.println("Due");
        } else {
            System.out.println("Not Due!");
        }

    }

    public static void main(String[] args) {

        ArrayList<LibraryMember> Library = new ArrayList<LibraryMember>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter choice \n0 -> IssueNotice\n 1->Due\n Else -> Add an entry\n -1 -> Exit\n ");
            int choice = scanner.nextInt();

            if (choice == -1) {
                System.out.println("Quitting..\n");
                System.exit(0);
            }

            else if (choice == 0) {
                int number = scanner.nextInt();
                System.out.println(Library.get(number));
                issueNotice(Library.get(number), new Date());
            }

            else if (choice == 1) {
                ArrayList<Integer> response = LibraryMember.dueList(Library, new Date());

                for (int i = 0; i < response.size(); i++) {
                    System.out.print("Member"+response.get(i) + "is due \n");
                }
            }

            else {

                System.out.println("Enter membership number: ");
                int _membershipno = scanner.nextInt();

                System.out.println("Enter name: ");
                String _name = scanner.next();

                System.out.println("Enter Membership Fee: ");
                Double _membershipfee = scanner.nextDouble();

                System.out.println("Enter date of issue : ");
                String _dateOfIssue = scanner.next();

                Library.add(new LibraryMember(_name, _membershipno, _membershipfee, _dateOfIssue));
            }
        }
    }
}
