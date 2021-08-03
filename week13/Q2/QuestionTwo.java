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
class ArrayOutOfBounds extends Exception{
    ArrayOutOfBounds(String s){
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
    @Override
    public String toString(){
        return "Part Number: " + this.part_no +"\nDescription: " + this.part_desc + "\nQuantity: " + this.quantity + "\nPrice: " + this.price;
    }
}
public class QuestionTwo{
    public static void main(String args[]){
        Invoice[] obj = new Invoice[5];
        Scanner scan = new Scanner(System.in);
        obj[0] = new Invoice(100, "Bottle", 10, 100);
        obj[1] = new Invoice(101, "Bag", 5, 50);
        obj[2] = new Invoice(102, "Cap", 30, 150);
        obj[3] = new Invoice(103, "Pen", 100, 30);
        obj[4] = new Invoice(104, "Pencil", 75, 10);
        for(int i=0; i<3; i++)
        {
            System.out.println("Enter index to be searched");
            int idx = scan.nextInt();
            try{
                if(idx > 4)
                    throw new ArrayOutOfBounds("Crossing the array size");
                System.out.println(obj[idx]);

            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}