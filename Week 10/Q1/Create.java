import java.io.*;
import java.util.Scanner;

import java.io.IOException;

public class Create{
    public static void main(String args[]) throws Exception{
        try{
            FileWriter fw = new FileWriter("Records.txt");
            Scanner scan = new Scanner(System.in);
            fw.write("Name       Number");
            fw.write("\n");
            int flag = 1;
            while(flag == 1)
            {
                System.out.println("Enter name");
                String name = scan.next();
                System.out.println("Enter number");
                String number = scan.next();
                fw.write(name + "       " + number);
                fw.write("\n");
                System.out.println("Enter 1 to continue and 0 to stop");
                flag = scan.nextInt();
            }
            fw.close();
            FileReader fr = new FileReader("Records.txt");
            readFile(fr);
        }
        catch (IOException fe)
        {
            System.out.println(fe);
        }
        finally
        {
            System.out.println("Ending program...");
        }
        
    }
    public static void readFile(FileReader fr){
        System.out.println("-----Records------");
        try{
            Scanner scan = new Scanner(fr);
            while(scan.hasNext())
            {
                String value = scan.nextLine();
                System.out.println(value);
            }
        }
        catch(Exception fe){
            System.out.println(fe);
        }
        finally{
            System.out.println("End of reading");
        }
    }
}
