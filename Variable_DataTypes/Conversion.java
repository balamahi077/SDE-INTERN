package Variable_DataTypes;

public class Conversion {
    
// Type Promotion : it's process of converting smaller data type to larger data type and larger data type to smaller data type
// there are 2 types of type casting
//       1. Implicit type casting(Done by JVM Automatically) : it converting smaller data type to larger data type.
//              ex: short num1 = 45;
//                  int num2 = num1;
//       2. Explicit type casting(Programmer should give) : it converting larger data type to smaller data type, but there is possible of lossing Data.
//              ex: float num1 = 50.5f;
//                  int num2 = (float)num1;

    public static void main(String[] args) {
        System.out.println("demo of byte to byte");
        byte num1 = 100;
        byte num2 = 100;
        // byte result = num1 + num2; --> Wrong, lossy conversion
        int result = num1 + num2; // --> Type Promotion
        System.out.println(result);


        System.out.println("demo of byte to short");
        byte n1 = 10;
        short n2 = 20;
        // byte res = n1 + n2; --> Wrong, lossy conversion
        int res = n1 + n2;  // --> Type Promotion
        System.out.println(res);

        System.out.println("demo of short to short");
        short s1 = 60;
        short s2 = 50;
        // short r1 = s1 + s2; --> Wrong, type conversion
        int r1 = s1 + s2; // -->type promotion
        System.out.println(r1);


        System.out.println("demo of char to char");
        char b1 = 20;
        char c1 = 20;
        // char r = b1 + c1; ==> Wrong, lossy convertion
        int r = b1 + c1; // ==> Type Promotion
        System.out.println(r);

        System.out.println("demo of short to char");
        char ch1 = 50;
        short s3 = 45;
        // char r2 = ch1 + s3; --> Wrong, 
        int r3 = ch1 + s3;// --> type Promotion
        System.out.println(r3);

        System.out.println("demo of int to long");
        int i = 45;
        long l = 4251;
        // int resu = i + l; --> Wrong,
        long resu = i + l; // here int is smaller than long so jvm will convert int to long and print result.
        System.out.println(resu);


        int in = 20;
        int in1 = 30;
        int resullt = in + in1;
        String str = new String("sum " + resullt);
        System.out.println(str + resullt);


        long time = System.currentTimeMillis();
        System.out.println(time);
    }
}
