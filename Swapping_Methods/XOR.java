package Swapping_Methods;

public class XOR {
    public static void main(String[] args) {
        //Using XOR operator
        int p = 10;
        int q = 20;
        System.out.println("Before swapping: p = " + p + ", q = " + q);
        System.out.println();
        p = p ^ q;
        q = p ^ q;
        p = p ^ q;
        System.out.println("After swapping: p = " + p + ", q = " + q);
    }
}
