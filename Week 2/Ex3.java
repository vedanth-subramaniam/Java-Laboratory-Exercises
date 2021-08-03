import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the five integers: ");
        int[] array = new int[5];
        int i = 0;

        while (i < 5) {
            int input = scanner.nextInt();

            if (input < 10 || input > 100) {
                System.out.println("Input not within range (>=10 && <=100)");
                continue;
            }

            array[i] = input;
            boolean flag = true;

            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    flag = false;
                    array[i] = -1;
                    break;
                }
            }
            if (flag) {
                System.out.print("Value:" + array[i]);
            }
            System.out.print("\nUnique values :");
            for (int c = 0; c < 5; c++) {
            if (array[c] > 0) {
                flag = false;
                System.out.print(array[c] + " ");
            }
        }
        System.out.print("\n");
            i++;
        }
        System.out.println("\nUnique values :");
        boolean flag = true;
         for (int c = 0; c < 5; c++) {
             if (array[c] > 0) {
                 flag = false;
                 System.out.print(array[c] + " ");
             }
         }
    }
}
