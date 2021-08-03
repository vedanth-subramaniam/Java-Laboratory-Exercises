public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        settitle(null);
        setprice(0.0);
        setauthor(null);
    }

    public Book(String title, String author, double price) {
        setprice(price);
        settitle(title);
        setauthor(author);
    }

    public void settitle(String title) {
        this.title = title;
    }

    public void setauthor(String author) {
        this.author = author;
    }

    public void setprice(Double price) {
        this.price = price;
    }

    public String gettitle() {
        return this.title;
    }

    public String getauthor() {
        return this.author;
    }

    public double getprice() {
        return this.price;
    }

    public static void Display(Book book) {
        System.out.println("Book Details: \n");
        System.out.println("Name - " + book.gettitle());
        System.out.println("Author - " + book.getauthor());
        System.out.println("Price - " + book.getprice());
        System.out.println("\n");
    }
    public String toString() {
        return this.gettitle() + " by " + this.getauthor();
    }
}