import java.util.Scanner;

class MyThread extends Thread{
    int number;
    public MyThread(int n){
        number = n;        
    }
    @Override
    public void run(){
        
        try{
            sleep(1000);
        }
        catch(InterruptedException e)
        {
        }
        System.out.println("In thread..");
        int a = 0, b = 1, c = 0;
        for(int i=0; i<number; i++)
        {
          System.out.print(a + " ");
          c = a + b;
          a = b;
          b = c;
        }
        System.out.println("\nCompleted...");
    }

}
public class Main{
    public static void main(String args[]){

       MyThread t1 = new MyThread(5);
       MyThread t2 = new MyThread(4);
       MyThread t3 = new MyThread(3);
       try{
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
       }
       catch(Exception e){
           
       }
   }
}
