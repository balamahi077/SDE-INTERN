package Chellenges;
import java.util.*;

public class count {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int count = 0;
        int num = scan.nextInt();

        if(num < 0) {
            num = -(num); // it will change the negitive to positive - x - = +
        }
        while(num > 0) {
            num = num/10;
            count++;
        }

        System.out.println(count);
    }
}
