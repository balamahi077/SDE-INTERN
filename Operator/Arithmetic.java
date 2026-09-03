package Operator;

public class Arithmetic 
{
    static int a = 20;
    static int b = 30;
    static int c = 22;
    public static void main(String[]args) 
    {
        System.out.println("----Arithmetic Operations----");
        System.out.println("Addition : " +(a+b));
        System.out.println("Subtraction : " +(a-b));
        System.out.println("Multiplcation : " + (a*b));
        System.out.println("Division : " + (a/b));
        System.out.println("Modulus : " + (a%b));

        System.out.println("----Unary----");
        System.out.println(c);
        c++;
        System.out.println("Increment : " + c);
        c--;
        System.out.println("Decrement : " + c);

        System.out.println("----Integer to Float----");
        System.out.println("20 % 6        --> " + 20%6);
        System.out.println("20.0 % 6      --> " + 20.0%6);
        System.out.println("20.0 % 6.0    --> "  + 20.6%6.0);

        System.out.println("----Precedence----");
        System.out.println("(10+5*2) --> " + (10+5*2));
        System.out.println("(10+5)*2 --> " + (10+5)*2);
        System.out.println("20-5+2   --> " + (20-5+2));

        System.out.println("----Boolean----");
        boolean x = true;
        boolean y = false;
        // System.out.println( x+y); // --> here x and y are boolean it can't perform operation between them
        // boolean will not work on Arithmetic operation
    
        System.out.println("Balakrishna");
    }
}
