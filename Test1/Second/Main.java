public class Main {

    public static void main(String[] args) {
        
        TwentyFrHrClock Obj1_24 = new TwentyFrHrClock(6, 10, 15);
         
        Obj1_24.display();
          
        Obj1_24.timeelapsed(100);
        System.out.println("Adding 100 seconds to test functionality");
          
        Obj1_24.display();
    
        TwelveHrClock Obj1_12 = new TwelveHrClock(12, 10, 30);

        TwelveHrClock Obj2_12 = new TwelveHrClock(8, 10, 30);

        Obj1_12.display();
        Obj2_12.display();
        System.out.println("Difference is :");
        System.out.println(Obj1_12.difference(Obj2_12));

    }

}
