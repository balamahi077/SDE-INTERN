package Variable_DataTypes;

public class Type_Casting {
    
    public static void main(String[] args) {

        //Type Casting is the process of converting a variable from one data type to another data type

        //There are two types of Type Casting
        //1. Implicit Type Casting (Widening)
        //2. Explicit Type Casting (Narrowing)

        //Implicit Type Casting (Widening)
        //In Implicit Type Casting, the smaller data type is converted to a larger data type automatically by the compiler
        //byte -> short -> int -> long -> float -> double

        byte b = 10;
        short s = b; //byte to short
        int i = s; //short to int
        long l = i; //int to long
        float f = l; //long to float
        double d = f; //float to double

        System.out.println();

        System.out.println("byte : " + b);
        System.out.println("short : " + s);
        System.out.println("int : " + i);
        System.out.println("long : " + l);
        System.out.println("float : " + f);
        System.out.println("double : " + d);

        System.out.println("---------------------------------------");

        //Explicit Type Casting (Narrowing)
        //In Explicit Type Casting, the larger data type is converted to a smaller data type manually by the user
        //double -> float -> long -> int -> short -> byte

        double d1 = 10.5;
        float f1 = (float)d1; //double to float
        long l1 = (long)f1; //float to long
        int i1 = (int)l1; //long to int
        short s1 = (short)i1; //int to short
        byte b1 = (byte)s1; //short to byte

        System.out.println("double : " + d1);
        System.out.println("float : " + f1);
        System.out.println("long : " + l1);
        System.out.println("int : " + i1);
        System.out.println("short : " + s1);
        System.out.println("byte : " + b1);


        //Wrapper class in Java is used to convert primitive data types into objects and vice versa. 
        // Each primitive data type has a corresponding wrapper class. For example, the wrapper class for int is Integer, 
        // for double is Double, and so on.

        System.out.println("---------------------------------------");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);


        int intPositive = 5;
        int intNegative = -5;
        System.out.println("Positive : " + Integer.toBinaryString(intPositive));        
        System.out.println("Negative : " + Integer.toBinaryString(intNegative));

    }

}
