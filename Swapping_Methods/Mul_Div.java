package Swapping_Methods;

public class Mul_Div {
    public static void main(String[] args) {
        //Using multiplication and division
        int x = 10;
        int y = 20;
        System.out.println("Before swapping: x = " + x + ", y = " + y);
        System.out.println();
        x = x * y;
        y = x / y;
        x = x / y;
        System.out.println("After swapping: x = " + x + ", y = " + y);
    }
}
