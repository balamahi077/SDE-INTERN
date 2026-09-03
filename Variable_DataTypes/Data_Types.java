package Variable_DataTypes;
public class Data_Types {

    public static void main(String[] args) {

        //Data types are used to define the type of data that can be stored in a variable
        //There are two types of data types in Java
        //1. Primitive Data Types
        //2. Non-Primitive Data Types

        //Primitive Data Types                                  Range
        //1. byte     1 byte                 8 bits             -128 to 127
        //2. short    2 bytes                16 bits            -32,768 to 32,767
        //3. int      4 bytes                32 bits            -2,147,483,648 to 2,147,483,647
        //4. long     8 bytes                64 bits            -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        //5. float    4 bytes                32 bits            Fractional numbers; up to 6-7 decimal digits
        //6. double   8 bytes                64 bits            Fractional numbers; up to 15-16 decimal digits
        //7. char     2 bytes                16 bits            Single 16-bit Unicode characters
        //8. boolean  1 bit or JVM dependent                    true or false
        
        //Number System in Java
        //1. Decimal Number System (Base 10)
       
        //2. Binary Number System (Base 2)
        
        //3. Octal Number System (Base 8)

        //4. Hexadecimal Number System (Base 16)






        byte b1 = 10; //decimal
        byte b2 = 0b1010; //binary
        byte b3 = 012; //octal
        byte b4 = 0xA; //hexadecimal
        
        System.out.println(b1);      
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);



        short shortValue = 20;
        int intValue = 30;
        long longValue = 400000000000L;
        float floatValue = 5.5f;
        double doubleValue = 6.625145;
        char charValue = 'A';
        boolean booleanValue = true;

        String stringValue = "Algo";

        System.out.println("byte : " + b1);
        System.out.println("short : " + shortValue);
        System.out.println("int : " + intValue);
        System.out.println("long : " + longValue);
        System.out.println("float : " + floatValue);
        System.out.println("double : " + doubleValue);
        System.out.println("char : " + charValue);
        System.out.println("boolean : " + booleanValue);
        System.out.println("String : " + stringValue);
        

    }
    
}
