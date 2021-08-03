import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;
    ArrayList<LibraryMember> libraryMembers;

    public Library() {
        books = new ArrayList<Book>();
        libraryMembers = new ArrayList<LibraryMember>();
    }

    public static LibraryMember issueCard(String _name, int _membershipno, Library _library) {
        _library.libraryMembers.add(new LibraryMember(_name, _membershipno));
        return _library.libraryMembers.get(_library.libraryMembers.size() - 1);
    }

    public void addBook(Book _book) {
        this.books.add(_book);
    }

    public static void displayBooks(Library _library) {
        if (_library.books.size() > 0) {
            System.out.println("Books in the Library------------");
            for (int i = 0; i < _library.books.size(); i++) {
                System.out.println(_library.books.get(i));
            }
            System.out.println();
        } else {
            System.out.println("No books in the Library\n");
        }
    }

}
