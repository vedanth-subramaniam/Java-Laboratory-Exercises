public class LibraryMember {
    String name;
    int membershipno;
    Double membershipfee;
    int numberOfBooks;

    public LibraryMember() throws Exception {
        setname(null);
        setmembershipno(0);
        setmembershipfee(0.0);
        setnumberOfBooks(1);

        if(numberOfBooks != 0) {
            throw new Exception("Number of Books should be initialized to zero");
        }
    }

    public LibraryMember(String _name, int _membershipno, Double _membershipfee) {
        setname(_name);
        setmembershipno(_membershipno);
        setmembershipfee(_membershipfee);
        setnumberOfBooks(0);
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

    public String toString() {
        return "----Library Member----\nName - " + this.getname() + "\nMembership Number - " + this.getmembershipno()
                + "\nMembership Fee - " + this.getmembershipfee() + "\nNumber Of Books - " + this.getnumberOfBooks();
    }

}
