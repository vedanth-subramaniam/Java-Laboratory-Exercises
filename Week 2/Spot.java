package Week2;
import java.util.ArrayList;
import java.util.Scanner;

public class Spot {
    public static void main(String[] args) {
        ArrayList<String> subjects= new ArrayList<>();
        Scanner scan= new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.println("Enter:" +
                    "1-ADD a subject  \n" +
                    "2-REMOVE a subject  \n" +
                    "3-CHECK and RETURN position of a subject  \n" +
                    "4-Total number of subjects  \n" +
                    "5-Last Subject enrolled  \n"  +
                    "6-if GIVEN subject is the FOURTH \n");
            int input= scan.nextInt();
            switch(input){
                case 1:
                    subjects.add(scan.next());
                    System.out.println("Added successfully!");
                    break;
                case 2:
                    System.out.println(subjects);
                    System.out.println("Enter the index of the subject you want to remove:");
                    subjects.remove(scan.nextInt());
                    System.out.println(subjects);
                    break;
                case 3:
                    String rem=scan.next();
                    if(subjects.contains(rem)) System.out.println(rem+"is at "+subjects.indexOf(rem) +"\n");
                    else System.out.println("Does not contain subject \n");
                    break;
                case 4:
                    System.out.println("The total number of subjects:"+ subjects.size() + "\n");
                    break;
                case 5:
                    System.out.println("The last subject enrolled is:"+ subjects.get(subjects.size()-1) + "\n");
                    break;
                case 6:
                    System.out.println("Enter the subject:");
                    rem= scan.next();
                    if(subjects.indexOf(rem)==3) System.out.println("It is the 4th subject \n");
                    else System.out.println("It is not the 4th subject \n");
                    break;
                case 7:
                    flag=false;
                    break;
            }
        }
    }
}
