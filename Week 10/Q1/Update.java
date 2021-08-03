import java.io.*;
import java.util.Scanner;

public class Update {
    public static void updateFile(File fr, String orgName){
        try{
            Scanner scan = new Scanner(fr);
            while(scan.hasNextLine())
            {
                String record = scan.nextLine();
                String[] rec;
                rec = record.split(" ");
                if(rec[0].equals(orgName)){
                    System.out.println("The record exists");
                    Scanner ph = new Scanner(System.in);
                    System.out.println("Enter new phone number");
                    String number = ph.next();
                
                    StringBuffer fileBuffer = new StringBuffer();
                    Scanner fileScanner = new Scanner(fr);
                    while(fileScanner.hasNextLine()){
                        fileBuffer.append(fileScanner.nextLine() + '\n');
                    }
                    String content = fileBuffer.toString();
                    content = content.replace(record, orgName + "      " + number);
                    FileWriter fw = new FileWriter(fr);
                    fw.write(content);
                    System.out.println("Files are updated.."); 
                    fw.close();
                    return;
                }
            }
        }
        catch(Exception e){
            System.out.print("File error");
        }
        finally{
            System.out.println("Successfully updated");
        }
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        File fr = new File("Records.txt");
        int flag = 1;
        while(flag == 1){
            System.out.println("Enter name of the record to be updates");
            String name = scan.next();
            updateFile(fr, name);
            System.out.println("Enter 1 to update another user, 0 to exit");
            flag = scan.nextInt();
        }
    }
}
