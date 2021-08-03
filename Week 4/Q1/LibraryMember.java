public class LibraryMember {
    private String name;
    private int membershipNo;
    private double membershipFee;
    private int noOfBooks;
    public LibraryMember()
    {
        this.name = null;
        this.membershipNo = 0;
        this.membershipFee = 0;
        this.noOfBooks = 0;
    }

    public LibraryMember(String name, int membershipNo, double membershipFee)
    {
        this.name = name;
        this.membershipNo = membershipNo;
        this.membershipFee = membershipFee;
        this.noOfBooks = 0;
    }

    public String getName()
    {
        return this.name;
    }

    public int getMembershipno() {
        return this.membershipNo;
    }

    public double getMembershipfee() {
        return this.membershipFee;
    }

    public int getNumberOfBooks() {
        return this.noOfBooks;
    }

    public String toString()
    {
        return "Name is :"+this.name+"\n"+"Membership No is:"+this.membershipNo+"\n"+"Membership Fee:"+this.membershipFee+"\n"+"No of books:"+this.noOfBooks+"\n";
    }
}
