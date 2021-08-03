
public class Book {
    String title;
    String authorName;
    double price;
    public Book(String title, String authorName, double price)
    {   
        this.title = title;
        this.authorName = authorName;
        this.price = price;
    }
    public String getTitle()
    {
        return this.title;
    }
    public String getAuthorName()
    {
        return this.authorName;
    }
    public double getPrice()
    {
        return this.price;
    }
    public String toString()
    {
        return "Title is :"+this.title+"\n"+"Author Name is:"+this.authorName+"\n"+"Price is :"+this.price+"\n";
    }
}
