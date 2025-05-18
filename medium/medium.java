import java.util.Scanner;

public class medium {
    
    public static void main(String args[])
    {
        //arrays
        int[] arr = new int[5];
        int[][] twoD = new int[5][5];

        System.out.println(arr.length);

        Scanner scanner = new Scanner(System.in); 
        
        
        //conditionals
        //if -else
        //if - else if
        int age = 18;
        if(age<12)
        {
            System.out.println("Child");
        }
        else if(age<18)
        {
            System.out.println("Teen");
        }
        else
        {
            System.out.println("Adult");
        }

        //Switch
        int day = 2;
        switch(day)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid");
                break; 
        }

        //for loop
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = scanner.nextInt();
        }

        for(int num : arr)
        {
            System.out.println(num);
        }

        //while loop 
        int i = 2;
        while(i<=10)
        {
            System.out.println(i);
            i++;
        }
        //do while
        int inp;
        do{
            inp = scanner.nextInt();
            System.out.println(inp);

        }while(inp != 10);


        scanner.close();


    }
}
