public class Book {
    int number;
    String title;
    String author;
    double price;

    public Book() {
        setnumber(0);
        settitle(null);
        setprice(0.0);
        setauthor(null);
    }

    public Book(String _title, String _author, double _price, int _number) {
        setnumber(_number);
        setprice(_price);
        settitle(_title);
        setauthor(_author);
    }

    public void setnumber(int _number) {
        this.number = _number;
    }

    public void settitle(String _title) {
        this.title = _title;
    }

    public void setauthor(String _author) {
        this.author = _author;
    }

    public void setprice(Double _price) {
        this.price = _price;
    }

    public int getnumber() {
        return number;
    }

    public String gettitle() {
        return title;
    }

    public String getauthor() {
        return author;
    }

    public double getprice() {
        return price;
    }

    public static void Display(Book _book) {
        System.out.println("Book Details: \n");
        System.out.println("Name - " + _book.gettitle());
        System.out.println("Author - " + _book.getauthor());
        System.out.println("Price - " + _book.getprice());
        System.out.println("\n");
    }

    public String toString() {
        return this.gettitle() + " by " + this.getauthor();
    }
}
