import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Lord Of The Rings", "Tolkein", 1000));
        library.addBook(new Book("Game of Thrones", "George", 4500));
        library.addBook(new Book("Hobbit", "Bilbo", 450));
        library.addBook(new Book("Percy Jackson", "RR", 900));

        Scanner scanner = new Scanner(System.in);

        
        library.addMember(new LibraryMember("Vedanth", 1));
        library.addMember(new LibraryMember("Karthik", 2));
        library.addMember(new LibraryMember("Rahul", 3));

        while (true) {
            System.out.println(
                    " 1) Borrow a book\n 2) Return\n 3) Display All Books\n 4) Display Borrowed Books\n 5)Display Members \n-1) Exit\n");

            System.out.print("Enter choice - ");
            int choice = scanner.nextInt();

            int index;

            switch (choice) {
            case 1:
                System.out.print("Enter book index - ");
                index = scanner.nextInt();
                library.member[0].borrow(library.books.get(index));
                break;

            case 2:
                System.out.print("Enter book index - ");
                index = scanner.nextInt();
                library.member[0].returnBook(library.books.get(index));
                break;

            case 3:
                Library.displayBooks(library);
                break;

            case 4:
                LibraryMember.displayBooks(library.member[0]);
                break;
            case 5:
                Library.displayMembers(library);
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
