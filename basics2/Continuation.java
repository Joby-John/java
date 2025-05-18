import java.util.Scanner;

public class Continuation {
    public static void main(String[] args)
    {
        //input
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        double decimal = scanner.nextDouble();
        scanner.nextLine();
        String name = scanner.nextLine();
        String Fname = scanner.next();
        boolean male = scanner.nextBoolean();
        System.out.println(num);
        System.out.println(decimal);
        System.out.println(name);
        System.out.println(Fname);
        System.out.println(male);
        scanner.close();


        // type casting 
        //implicit 
        int x = 10;
        double y = x;

        //explicit
        double w = 10.8;
        int e = (int) w;

        //constants
        final int con = 10;
        // con  = 19;
        System.out.println(con);


    }    
}
