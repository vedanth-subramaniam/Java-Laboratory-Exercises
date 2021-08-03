import java.util.Scanner;

public class Ex1 {
    public static void display(int curr[],String chara){

            char newcharacter= Character.toLowerCase(chara.charAt(0));
      
            int out=(int)newcharacter-96;

            System.out.println("Letter: "+chara+"  "+"Frequency:"+curr[out]);

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String input= scan.next();
        System.out.println(input);
        int[] curr=new int[27];
        char[] inp=input.toCharArray();

        for(int i=0;i< inp.length;i++){
            if(Character.isUpperCase(inp[i])){

                inp[i]=Character.toLowerCase(inp[i]);
           
            }

            int a=(int)inp[i]-96;
            curr[a]=curr[a]+1;
        }
        System.out.println("Enter the character you want to find the frequency for:");
        String findOcc= scan.next();
         display(curr,findOcc);

    }

}
