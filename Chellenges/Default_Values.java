package Chellenges;

public class Default_Values {

        static byte instanceByte;
        static short instanceShort;
        static int instanceInt;
        static long instanceLong;
        static float instanceFloat;
        static double instanceDouble;
        static char instanceChar;
        static boolean instaceBoll;
        
        public static void main(String[] args) {

        byte localByte = 10 ;
        short localShort = 405;
        int localInt = 50000;
        long localLong = 355544114548451L;
        float localFloat = 452.54f;
        double localDouble = 45.656262365656;
        char localChar = 'B';
        boolean localBool = true;

        System.out.println();
        System.out.println("Default Values of Instance Variabes ");

        System.out.println("Byte   : " + instanceByte);
        System.out.println("Short  : " + instanceShort);
        System.out.println("Int    : " + instanceInt);
        System.out.println("Long   : " + instanceLong);
        System.out.println("Float  : " + instanceFloat);
        System.out.println("Double : " + instanceDouble);
        System.out.println("Char   : " + instanceChar);
        System.out.println("Boolean: " + instaceBoll);

        System.out.println();
        System.out.println("Default Values of Local Variables");

        System.out.println("Byte   : " + localByte);
        System.out.println("Short  : " + localShort);
        System.out.println("Int    : " + localInt);
        System.out.println("Long   : " + localLong);
        System.out.println("Float  : " + localFloat);
        System.out.println("Double : " + localDouble);
        System.out.println("Char   : " + localChar);
        System.out.println("Boolean: " + localBool);
        
    // Note : Local variables must be initialized

        }
}
