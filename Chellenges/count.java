package Chellenges;
import java.util.*;

public class count {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int count = 0;
        int num = scan.nextInt();

        while(num > 0) {
            num = num/10;
            count++;
        }

        System.out.println(count);
    }
}
