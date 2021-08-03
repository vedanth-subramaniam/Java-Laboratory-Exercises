public class Main {
    public static void main(String[] args) {
        LibraryMember lm1 = new LibraryMember("Vedanth", 1);
        System.out.println(lm1);

        lm1.borrow(new Book("Lord Of The Rings", "Tolkein", 1500));
        lm1.borrow(new Book("Game of thrones", "George R.R Martin", 4500));

        LibraryMember.displayBooks(lm1);

        lm1.returnBook(lm1.myBooks.get(0));

        LibraryMember.displayBooks(lm1);
    }
}
