package Chellenges;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int number = 12321;
        int temp = number;

        int reverse = 0;

        while(number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number/10;

        }

        if(temp == reverse){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindome");
        }

        scan.close();

    }
}
