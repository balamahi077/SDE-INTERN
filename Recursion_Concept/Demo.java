package Recursion_Concept;

public class Demo {
    
    public static void main(String[] args)
    {
        // fun1(3);
        // fun2(3);
        // fun3(3);
        fun(3);
    }

    public static void fun1(int n)
    {
        if( n > 0)
        {
            System.out.println(n);
            fun1(n-1);
        }
    }

    public static void fun2(int n)
    {
        if( n > 0)
        {
            fun2(n-1);
            System.out.println(n);
        }
    }

    public static void fun3(int n)
    {
        if( n > 0)
        {
            fun3(n-1);
            System.out.println(n);
            fun3(n-1);
        }
    }

    public static void fun(int n)
    {
        if( n > 0)
        {
            System.out.println("Enter :" + n);
            fun(n-1);
            System.out.println("Exit :" + n);
        }
    }
}
