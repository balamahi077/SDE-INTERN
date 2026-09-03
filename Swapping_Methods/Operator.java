package Swapping_Methods;

public class Operator {
    public static void main(String[] args) {    
     //Using addition and subtraction
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        System.out.println();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
