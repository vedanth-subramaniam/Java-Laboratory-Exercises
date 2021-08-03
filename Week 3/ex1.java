public class ex1 {
    public static void main(String[] args) {
        Book book = new Book(100, "Computer Networks", 500, "John", 900.0);
        Book.Display(book);
        Book book2=new Book(500,60.0,200000);
        Book.Display(book2);
        Book book3=new Book();
        Book.Display(book3);
        book.getPrice();
        book2.getAuthor();
        book.getAuthor();
        book.getBnumber();
        book.getBtitle();
        book.getBcopies();
        book2.setAuthor("Harvard");
        book2.setBtitle("Operating Systems");
        Book.Display(book2);
        String newau=book2.getAuthor();
        System.out.println("The author is "+newau);
    }
}