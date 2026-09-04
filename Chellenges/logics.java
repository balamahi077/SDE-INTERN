package Chellenges;
import java.util.*;

public class logics {
    public static void main(String[] args) {

        //printMultiplcationTable();
        //DecrementBy10();
        divideBy2();

        
    }


    public static void divideBy2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the targer number : ");
        int num = scan.nextInt();

        System.out.println("ENter the number : ");
        for(int start = num; start > 0; start = start/2)
        {
            System.out.println(start);
        }

        System.out.println("Using do-while");
        int start = num;
        do{
            System.out.println(start);
            start = start/2;
        }while(start > 0);

        System.out.println("Using while");
        int st = num;
        while ( st > 0)
        {
            System.out.println(st);
            st = st/2;
        }
        scan.close();
    }

    public static void DecrementBy10() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Target Number : ");
        int start = scan.nextInt();

        System.out.println("Using For loop");
        for(int st = start; st >= 0 ; st-=10 ) {
            System.out.println(st);
        }

        System.out.println("Using do-while");


        do{
            System.out.println(start);
            start -= 10;
        }
        while(start >= 0);


        System.out.println("Using While");
        
        while(start >= 0)
        {
            System.out.println(start);
            start -= 10;
        }
        scan.close();

    }

    public static void printMultiplcationTable() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Table number : ");
        int n = scan.nextInt();

        System.out.println("Using for loop");
        for(int start = 1; start <= 10; start++) 
        {
            int mul = n * start;
            System.out.println(n +" x "+ start +" = " + mul);
        }

        System.out.println("Using do-while");
        int start = 1;
        do
        {
            int mul = n * start;
            System.out.println( n + " x " + start + " = " + mul);
            start++;
        }while( start <= 10 );

        System.err.println( "Using While");
        int st = 1;
        while(st <= 10) {
            int mul = n * start;
            System.out.println( n + " x " + st + " = " + mul);
            st++;
        }
        scan.close();

    }

    public static void printPowerOf2() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the target number : ");
        int n = scan.nextInt();

        for(int start = 1; start <= n; start++)
        {
            int pow = 2 * start;
            System.out.println(pow);
        }


        int start = 1;
        do
        {
            System.out.println( 2 * start);
        } while(start <= n);

        int st = 1;
        while(st <= n) {
            System.out.println( 2 * start);
        }

        scan.close();
    }

    
}
