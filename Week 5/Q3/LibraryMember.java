import java.util.ArrayList;

public class LibraryMember extends Book {
    String name;
    ArrayList<Book> myBooks;
    int membershipno;

    public LibraryMember() {
        setname(null);
        setmembershipno(0);
        setmybooks(new ArrayList<Book>());
    }

    public LibraryMember(String name, int membershipno) {
        setname(name);
        setmembershipno(membershipno);
        setmybooks(new ArrayList<Book>());

    }

    public void setname(String name) {
        this.name = name;
    }

    public void setmembershipno(int membershipno) {
        this.membershipno = membershipno;
    }

    public void setmybooks(ArrayList<Book> mybooks) {
        this.myBooks = mybooks;
    }

    public String getname() {
        return name;
    }

    public int getmembershipno() {
        return membershipno;
    }

    public ArrayList<Book> getmybooks() {
        return myBooks;
    }

    public String toString() {
        return "Library Member: \nName - " + this.getname() + "\nMembership Number - " + this.getmembershipno();
    }

    public void borrow(Book book) {
        myBooks.add(book);
    }

    public void returnBook(Book book) {
        if (myBooks.indexOf(book) == -1) {
            System.out.println("Book not borrowed");
        } else {
            myBooks.remove(myBooks.indexOf(book));
        }

    }

    public static void displayBooks(LibraryMember librarymember) {

        if (librarymember.myBooks.size() > 0) {
            System.out.println("Books borrowed");
            for (int i = 0; i < librarymember.myBooks.size(); i++) {
                System.out.println(librarymember.myBooks.get(i));
            }
            System.out.println();
        } else {
            System.out.println("No books borrowed\n");
        }

    }

}
