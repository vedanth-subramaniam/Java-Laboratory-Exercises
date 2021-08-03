import java.util.InputMismatchException;
import java.util.Scanner;
class Rational{
    public float numerator;
    public float denominator;
    Rational(){
        this.numerator = -1;
        this.denominator = -1;
    }
    Rational(float numerator, float denominator){ 
        try{
            if(denominator == 0){
            throw new IllegalArgumentException("Denomintor has been initialised to 0..");
            }
            this.numerator = numerator;
            this.denominator = denominator;
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
    }
    public void set_num(float numerator){
        this.numerator = numerator;
    }
    public void set_den(float denominator){
        this.denominator = denominator;
    }
    public float get_num(){
        return this.numerator;
    }
    public float get_den(){
        return this.denominator;
    }
    public String toString(){
        return "Numerator:" + this.numerator + "\nDenominator:" + this.denominator;
    }
}
public class Main {
    public static void main(String args[]){
        System.out.println("Initialising an object with denominator as 0");
        Rational ob = new Rational(4, 0);
        //Rational[] arr = new Rational();
        Rational[] arr = new Rational[2];
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Enter numerator and denominator");
            try{
                float num = scan.nextFloat();
                float dem = scan.nextFloat();
                arr[i] = new Rational(num, dem);
            }
            catch(InputMismatchException e){
                System.out.println(e + " Wrong type");
            }
        }
        try{
            for(int i=0; i<7; i++){
                System.out.println(arr[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e + " "+ "You are trying to access out of bounds memory location");
        }
    }
}
