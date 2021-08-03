import java.util.ArrayList;

public class Library {
    
    ArrayList<Book> books;
    ArrayList<LibraryMember> members;
    public Library()
    {
        setmybooks(new ArrayList<Book>());
        setmybooks(new ArrayList<Book>());
    }
    public void setmyLibmembers(ArrayList<LibraryMember> Libmem)
    {
        this.members = Libmem;
    }

    public void setmybooks(ArrayList<Book> mybooks) {
        this.books = mybooks;
    }
    public static void issueCard(LibraryMember mem, Library total)
    {
        total.members.add(mem);
    }

    public void addBook(Book b)
    {
        books.add(b);
    }

    public void addMember(LibraryMember mem)
    {
        members.add(mem);
    }
    public static void displayBooks(Library library) {
        if (library.books.size() > 0) {
            System.out.println("Books in the Library");
            for (int i = 0; i < library.books.size(); i++) {
                System.out.println(library.books.get(i));
            }
            System.out.println();
        } else {
            System.out.println("No books in the Library\n");
        }
    }

    public static void displayMembers(Library library) {
        if (library.members.size() > 0) {
            System.out.println("Members in the Library");
            for (int i = 0; i < library.members.size(); i++) {
                System.out.println(library.members.get(i));
            }
            System.out.println();
        } else {
            System.out.println("No members in the Library\n");
        }
    }

}
