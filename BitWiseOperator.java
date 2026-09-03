public class BitWiseOperator {
    public static void main(String[] args) {

        int a = 11;
        int b = 15;
        int operator = -150;
        System.out.println("AND  : " + (a & b));
        System.out.println("OR   : " + (a | b));
        System.out.println("XOR  : " + (a ^ b));
        System.out.println("NOT  : " + (~a));
        System.out.println("NOT  : " +(~b));
        System.out.println("NOT : " + (~operator));
        System.out.println();

        System.out.println("Left Shift");
        int c = 10;
        System.out.println("shift by 1 place  : " + (a << 1));
        System.out.println("shift by 2 places : " + (a << 2));
        System.out.println("shift by 3places  : " + (a << 3));
        System.out.println();

        System.out.println("Right shift(signed right shift)");
        int d = 10;
        System.out.println("shift by 1 place  : " + (d >> 1));
        System.out.println("shift by 2 places : " + (d >> 2));
        System.out.println("shift by 3 places :  " + (d >> 3));
        System.out.println();

        System.out.println("Unsigned right shift");
        int e = -10;
        System.out.println("shift by 1 place   :  " + (e >>> 1));
        System.out.println("shift by 2 places  : " + (e >>> 2));
        System.out.println("shift by 3 places  : " + (e >>> 3));






    }
}
