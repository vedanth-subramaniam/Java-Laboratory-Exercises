import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Lord Of The Rings", "Tolkein", 1000, 101));
        library.addBook(new Book("Game of Thrones", "George", 4500, 102));
        library.addBook(new Book("Hobbit", "Bilbo", 450, 102));
        library.addBook(new Book("Percy Jackson", "RR", 900, 104));
        

        Scanner scanner = new Scanner(System.in);

        LibraryMember member = Library.issueCard("Vedanth", 1, library);

        while (true) {
            System.out.println(
                    "1) Borrow a book\n2) Return a book\n3) Display Books\n4) Display Borrowed Books\n5) Search if book is borrowed\n-1) Exit\n");

            System.out.print("Enter choice - ");
            int choice = scanner.nextInt();

            int index;

            switch (choice) {
            case 1:
                System.out.print("Enter book index - ");
                index = scanner.nextInt();
                member.borrow(library.books.get(index));
                break;

            case 2:
                System.out.print("Enter book index - ");
                index = scanner.nextInt();
                member.returnBook(library.books.get(index));
                break;

            case 3:
                Library.displayBooks(library);
                break;

            case 4:
                ArrayList<Book> response = LibraryMember.displayBooks(member);

                if (response.size() > 0) {
                    System.out.println("Books borrowed");
                    for (int i = 0; i < response.size(); i++) {
                        System.out.println(response.get(i));
                    }
                    System.out.println();
                } else {
                    System.out.println("No books borrowed\n");
                }

                break;

            case 5:
                System.out.print("Enter book number to search - ");
                int _number = scanner.nextInt();
                if (LibraryMember.search(member, _number)) {
                    System.out.print("Book number " + _number + " is borrowed\n");
                } else {
                    System.out.print("Book number " + _number + " is not borrowed\n");
                }

                break;

            case -1:
                System.out.println("Quitting Program");
                System.exit(0);
                break;

            default:
                break;
            }

        }

    }
}
