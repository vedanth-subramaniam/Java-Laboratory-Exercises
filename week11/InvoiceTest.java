import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

class Invoice implements Serializable{
    int part_no;
    String part_desc;
    int quantity;
    double price;
    Invoice(){
    }
    public Invoice(int part_no, String part_desc, int quantity, double price){
        this.part_no = part_no;
        this.part_desc = part_desc;
        this.quantity = quantity;
        this.price = price;
    }
    public void set_No(int part_no){
        this.part_no = part_no;
    }
    public void set_Desc(String part_desc){
        this.part_desc = part_desc;
    }
    public void set_Qty(int quantity){
        this.quantity = quantity;
    }
    public void set_Price(double price){
        this.price = price;
    }
    public int get_No(){
        return this.part_no;
    }
    public String get_Desc(){
        return this.part_desc;
    }
    public int get_Qty(){
        return this.quantity;
    }
    public double get_Price(){
        return this.price;
    }
    public String toString(){
        return this.get_No() + " " + this.get_Desc() + " " + this.get_Qty() + " " + this.get_Price();
    }
}
public class InvoiceTest{
    public static void main(String args[]){
        ArrayList<Invoice> arr = new ArrayList<Invoice>();
        int flag = 1;
        Scanner scan = new Scanner(System.in);
        while(flag == 1){
            System.out.println("Enter the details of an object");
            Invoice obj = new Invoice();
            obj.set_No(scan.nextInt());
            obj.set_Desc(scan.next());
            obj.set_Qty(scan.nextInt());
            obj.set_Price(scan.nextDouble());
            arr.add(obj);
            System.out.println("Do you want to add another object");
            flag = scan.nextInt();
        }
        System.out.println("The contents present in the file..");
        for(Invoice ob:arr){
            System.out.println(ob);
        }
        try{
            FileOutputStream fos = new FileOutputStream("Invoice.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            System.out.println("Serializing invoice arraylist...");
            oos.writeObject(arr);
            System.out.println("Over...");
            oos.flush();
            oos.close();
            fos.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            FileInputStream fis = new FileInputStream("Invoice.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            System.out.println("Deserializing Invoice Arraylist...");
            ArrayList<Invoice> newArr = (ArrayList<Invoice>)ois.readObject();

            for(Invoice ob:newArr){
            System.out.println(ob);
            }
            ois.close();
            fis.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        scan.close();
    }
}

