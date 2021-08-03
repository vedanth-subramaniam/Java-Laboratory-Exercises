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

    public LibraryMember(String _name, int _membershipno) {
        setname(_name);
        setmembershipno(_membershipno);
        setmybooks(new ArrayList<Book>());

    }

    public void setname(String _name) {
        this.name = _name;
    }

    public void setmembershipno(int _membershipno) {
        this.membershipno = _membershipno;
    }

    public void setmybooks(ArrayList<Book> _mybooks) {
        this.myBooks = _mybooks;
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

    public void borrow(Book _book) {
        myBooks.add(_book);
    }

    public void returnBook(Book _book) {
        if (myBooks.indexOf(_book) == -1) {
            System.out.println("Book not borrowed");
        } else {
            myBooks.remove(myBooks.indexOf(_book));
        }

    }

    public static ArrayList<Book> displayBooks(LibraryMember _librarymember) {
        return _librarymember.myBooks;
    }

    public static boolean search(LibraryMember _librarymember, int _number) {
        if (_librarymember.myBooks.size() > 0) {
            for (int i = 0; i < _librarymember.myBooks.size(); i++) {
                if (_number == _librarymember.myBooks.get(i).number) {
                    return true;
                }
            }
        }
        return false;
    }

}
