import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public class LibraryMember {
    String name;
    int membershipno;
    Double membershipfee;
    int numberOfBooks;
    Date dateOfIssue;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    public LibraryMember() {
        System.out.println("DEFAULT CONSTRUCTOR");
        setname(null);
        setmembershipno(0);
        setmembershipfee(0.0);
        setnumberOfBooks(0);
        setIssueDate(null);
    }

    public LibraryMember(String _name, int _membershipno, Double _membershipfee, String _dateOfIssue) {
        System.out.println("THREE ARG CONSTRUCTOR");
        setname(_name);
        setmembershipno(_membershipno);
        setmembershipfee(_membershipfee);
        setnumberOfBooks(0);
        setIssueDate(_dateOfIssue);
    }

    public void setIssueDate(String _dateOfIssue) {

        try {
            setdateOfIssue(dateFormat.parse(_dateOfIssue));
        } catch (ParseException error) {
            error.printStackTrace();
        }
    }

    public void setname(String _name) {
        this.name = _name;
    }

    public void setmembershipno(int _membershipno) {
        this.membershipno = _membershipno;
    }

    public void setmembershipfee(Double _membershipfee) {
        this.membershipfee = _membershipfee;
    }

    public void setnumberOfBooks(int _numberOfBooks) {
        this.numberOfBooks = _numberOfBooks;
    }

    public void setdateOfIssue(Date _dateOfIssue) {
        this.dateOfIssue = _dateOfIssue;
    }

    public String getname() {
        return name;
    }

    public int getmembershipno() {
        return membershipno;
    }

    public Double getmembershipfee() {
        return membershipfee;
    }

    public int getnumberOfBooks() {
        return numberOfBooks;
    }

    public Date getdateofissue() {
        return dateOfIssue;
    }

    public String toString() {
        return "Library Member: \nName - " + this.getname() + "\nMembership Number - " + this.getmembershipno()
                + "\nMembership Fee - " + this.getmembershipfee() + "\nNumber Of Books - " + this.getnumberOfBooks()
                + "\nDate of Issue - " + this.getdateofissue();
    }

    public static String getName(LibraryMember _librarymember) {
        return _librarymember.getname();
    }

    public void borrow(int n) {
        if (this.getnumberOfBooks() + n > 5) {
            System.out.println("CAN'T BORROW BOOK (>5)");
            System.out.println("Number of Books - " + this.getnumberOfBooks());
            return;
        }

        System.out.println("Borrowed " + n + " books");
        this.setnumberOfBooks(this.getnumberOfBooks() + n);
        System.out.println("Number of Books - " + this.getnumberOfBooks());
    }

    public void returnBooks(int n) {
        if (this.getnumberOfBooks() - n < 0) {
            System.out.println("CAN'T RETURN BOOKS (<0)");
            System.out.println("Number of Books - " + this.getnumberOfBooks());
            return;
        }

        System.out.println("Returned " + n + " books");
        this.setnumberOfBooks(this.getnumberOfBooks() - n);
        System.out.println("Number of Books - " + this.getnumberOfBooks());
    }

    public static void searchDetails(ArrayList<LibraryMember> _Library, int _membershipno) {
        for (int i = 0; i < _Library.size(); i++) {
            if (_membershipno == _Library.get(i).getmembershipno()) {
                System.out.println(_Library.get(i));
                return;
            }
        }

        System.out.println("No Member Found\n");
    }

    public static ArrayList<Integer> dueList(ArrayList<LibraryMember> _Library, Date _today) {
        ArrayList<Integer> _dueList = new ArrayList<Integer>();
        for (int i = 0; i < _Library.size(); i++) {
            Date startDate = _Library.get(i).dateOfIssue;
            Date endDate = _today;

            long duration = endDate.getTime() - startDate.getTime();
            long diffInDays = TimeUnit.MILLISECONDS.toDays(duration);

            if (diffInDays > 6) {
                _dueList.add(_Library.get(i).membershipno);
            }
        }

        return _dueList;
    }
}
