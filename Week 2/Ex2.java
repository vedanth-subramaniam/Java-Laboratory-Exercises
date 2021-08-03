import java.io.*;
import java.util.*;

public class Ex2 {
    static boolean isPattern(int[] array) {

        int count = 0;

        for(int i=1;i<array.length;i++) {
            if(array[i] == array[i-1]) {
                count++;
            }
            else {
                count = 0;
            }
            if(count == 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for(int i=0;i<size;i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(isPattern(array)); 
        scanner.close();
    }
}
