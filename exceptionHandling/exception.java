public class exception {
    public static void main(String args[])
    {
        System.out.println("Hello");

        try{
            int num1 = 10;
            int num2 = 0;
            int num3 = num1/num2;
            System.out.println(num3);
        }
        catch (Exception  e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("PRogram Exit");
        }
    }
}
