package Swapping_Methods;

public class Num {
    public static void main(String[] args) {
    
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int temp;

        System.out.println("Before Swapping");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        temp = num1;
        num1 = num2;
        num2 = num3;
        num3 = temp;

        System.out.println("Ater Swapping");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

    }
    
}
