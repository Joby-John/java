class Basics
{
    public static void main(String[] args)
    {
        // data types: 
        //byte :  -128 to 127(8 bits)
        //short:
        //int  : -2^31 to 2^31 - 1 (32  bits)
        //long : -2^62 to 2^63 -1  (64 bits)
        //float : 6-7 decimal places (32 bits)
        //double: 15 decimal places (64 bits)
        //char : store characters 
        //boolean : true or false
        
        //operators:
        //unary : -, +, --, ++
        //ternary:
        //condition ? first : second
        int num = 1000;
        num = -num;
        num = -num;
        System.out.println(num);

        String name = "Joby John";
        System.out.println((name.length()));
        System.out.println(name.substring(0, 4));
        String wife = "Anna" + " "+ name;
        System.out.println(wife);
    }
}
