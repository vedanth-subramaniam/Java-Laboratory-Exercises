import java.util.Scanner;
import java.util.*;
class ZeroException extends Exception{
    public ZeroException(String message){
        super(message);
    }
}
class Rational {
    public float numerator;
    public float denominator;

    public Rational(float num, float den) throws ZeroException {
        try {
            numerator = num;
            denominator = den;
            if(denominator==0)throw new ZeroException("Zero Exception");
        } catch (InputMismatchException e){
            System.out.println(e + "Diff type");
        }
    }
    public String toString() {
        return "Numerator: " + numerator + "\nDenominator: " + denominator ;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        Rational[] arr=new Rational[2];
        try{
            for(int i=0;i<2;i++){
                System.out.println("Enter the numerator value:");
                float num= scan.nextFloat();
                System.out.println("Enter the denominator value");
                float den=scan.nextFloat();

                arr[i]=new Rational(num,den);
            }
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }
        for(int i=0;i<4;i++){
            try {
                System.out.println(arr[i]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("You are exceeding array bounds");
            }
        }
    }
}
