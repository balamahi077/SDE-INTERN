package Swapping_Methods;
public class Temp {
    public static void main(String[] args) {
        //Using a temporary variable
        int num1 = 10;
        int num2 = 20;
        int temp;
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        System.out.println();
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
    
}
