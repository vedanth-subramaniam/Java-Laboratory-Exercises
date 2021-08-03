import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Book {
    Scanner scan= new Scanner(System.in);
    private int Bnumber;
    private String Btitle;
    private int Bcopies;
    private String author;
    private double price;
    private Date purchase;

    public Book(){
        Bnumber=0;
        Btitle=null;
        Bcopies=0;
        author=null;
        price=0.0;

    }
    public Book(int innum,double inprice,int inbcopies){
        Bnumber=innum;
        price=inprice;
        Bcopies=inbcopies;
    }
    public Book(int innum,String intitle,int inbcopies,String inauthor,double inprice ){
        Bnumber=innum;
        price=inprice;
        Bcopies=inbcopies;
        author=inauthor;
        Btitle=intitle;

    }
    public void setBnumber(int innum){
        this.Bnumber=innum;
        System.out.println("Number has been set");
    }
    public void setBtitle(String intitle){
        this.Btitle=intitle;
        System.out.println("Title has been set");
    }
    public void setBcopies(int inbcopies){
        this.Bcopies=inbcopies;
        System.out.println("Number of copies has been set");
    }
    public void setAuthor(String inauthor){
        this.author=inauthor;
        System.out.println("Author name copies has been set");
    }
    public void setPrice(double inprice){
        this.price=inprice;
        System.out.println("Price has been set");
    }

    public int getBnumber() {
        return Bnumber;
    }

    public String getBtitle() {
        return Btitle;
    }

    public int getBcopies() {
        return Bcopies;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
    public static void Display(Book b){
        System.out.println("The details of the book are:");
        System.out.println("-----------------------------");
        System.out.println("Name: "+b.getBtitle());
        System.out.println("Book ID: "+b.getBnumber());
        System.out.println("No. of Copies: "+b.getBcopies());
        System.out.println("Author: "+b.getAuthor());
        System.out.println("Price: $"+b.getPrice());
        System.out.println("The date of purchase:"+b.purchase);

    }
}
