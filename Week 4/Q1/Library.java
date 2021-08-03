public class Library {
    public static void main(String[] args)
    {
        LibraryMember mem1 = new LibraryMember();
        System.out.println("Printing using default constructor\n" + mem1);
        LibraryMember mem2 = new LibraryMember("Vedanth",1,500.0);
        System.out.println("Argument Constructor\n"+mem2);
        System.out.println("Using getname: "+ mem2.getName());
    }
}
