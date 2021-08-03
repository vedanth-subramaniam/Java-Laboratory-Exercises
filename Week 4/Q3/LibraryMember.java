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

    public String getName(){
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

    public void setName(String name){
        this.name = name;
    }

    public void setMembershipno(int no){
        this.membershipNo = no;
    }

    public void setMembershipfee(double fee){
        this.membershipFee = fee;
    }
    
    public void borrow(int n)
    {
        int count = this.noOfBooks + n;
        if(count > 5)
            System.out.print("You are trying to borrow more than 5 books try again..\n");
        else
            this.noOfBooks = count;
        System.out.println("Currently borrowed number is :"+this.noOfBooks);
    }
    public void return_number(int n)
    {
        int count = this.noOfBooks - n;
        if(count < 0)
            System.out.println("Error in returning..");
        else
            this.noOfBooks = count;
        System.out.println("Currently borrowed number is :"+this.noOfBooks);
    }
    public static void searchDetails(int n, LibraryMember[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i].membershipNo == n)
                System.out.println(arr[i]);
        }
    }
    public String toString()
    {
        return "Name is :"+this.name+"\n"+"Membership No is:"+this.membershipNo+"\n"+"Membership Fee:"+this.membershipFee+"\n"+"No of books:"+this.noOfBooks+"\n";
    }
}
