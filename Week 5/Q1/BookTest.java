import java.util.Scanner;

public class BookTest {

    public static void main(String[] args){
        Book[] arr = new Book[3];
        Scanner scan = new Scanner(System.in);

        for(int i=0; i<3; i++)
        {
            System.out.print("Enter Title, Author Name, Price:\n");
            arr[i] = new Book(scan.next(), scan.next(), scan.nextDouble());
        }
        System.out.println("Examples to demonstrate that the methods work.");
        System.out.println("Title is:"+arr[0].getTitle());
        System.out.println("Author name is:"+arr[0].getAuthorName());
        System.out.println("Price is:"+arr[0].getPrice());
        System.out.println(arr[1]);

    }

}
s