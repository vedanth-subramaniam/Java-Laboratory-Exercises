import java.util.*;
class InvalidNumberException extends Exception{  
    InvalidNumberException(String s){  
     super(s);  
    }  
}
class InvalidDescException extends Exception{
    InvalidDescException(String s){
        super(s);
    }
}
class InvalidQuantityException extends Exception{
    InvalidQuantityException(String s){
        super(s);
    }
}
class InvalidPriceException extends Exception{
    InvalidPriceException(String s){
        super(s);
    }
} 
class Invoice{
    int part_no;
    String part_desc;
    int quantity;
    double price;
    Invoice(){

    }
    Invoice(int part_no, String part_desc, int quantity, double price){
        this.part_no = part_no;
        this.part_desc = part_desc;
        this.quantity = quantity;
        this.price = price;
    }
    void setNo(int part_no) throws InvalidNumberException{
        if(part_no < 0)
            throw new InvalidNumberException("Part < 0");
        else
            this.part_no = part_no;
    }
    void setDesc(String part_desc) throws InvalidDescException{
        if(part_desc.isEmpty())
            throw new InvalidDescException("Not a null string");
        else
            this.part_desc = part_desc;
    }
    void setQuantity(int quantity) throws InvalidQuantityException{
        if(quantity < 0)
            throw new InvalidQuantityException("Quantity < 0");
        else
            this.quantity = quantity;
    }
    void setPrice(double price) throws InvalidPriceException{
        if(price < 0)
            throw new InvalidPriceException("Price < 0");
        else
            this.price = price;
    }
    int getNo(){
        return this.part_no;
    }
    String getDesc(){
        return this.part_desc;
    }
    int getQuantity(){
        return this.quantity;
    }
    double getPrice(){
        return this.price;
    }
}
public class InvoiceTest{
    public static void main(String args[]){
        Invoice ob = new Invoice();
        Scanner scan = new Scanner(System.in);
        try{
           System.out.println("Enter part number:");
           int part_no = scan.nextInt();
           scan.nextLine();
           ob.setNo(part_no);
        }
        catch(InvalidNumberException m){
            System.out.println("Exception: " + m);
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }
        try{
            System.out.println("Enter part description:");
            String part_desc = scan.nextLine();
            ob.setDesc(part_desc);
        }
        catch(InvalidDescException m){
             System.out.println("Exception: " + m);
        }
        catch(InputMismatchException e){
             System.out.println(e);
        }
        try{
            System.out.println("Enter quantity:");
            int quantity = scan.nextInt();
            ob.setQuantity(quantity);
        }
        catch(InvalidQuantityException m){
             System.out.println("Exception: " + m);
        }
        catch(InputMismatchException e){
             System.out.println(e);
        }
        try{
            System.out.println("Enter price:");
            double price = scan.nextDouble();
            ob.setPrice(price);
        }
        catch(InvalidPriceException m){
             System.out.println("Exception: " + m);
        }
        catch(InputMismatchException e){
             System.out.println(e);
        }
    }
}