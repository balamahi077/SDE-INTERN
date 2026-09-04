package Radix;
import java.util.*;

public class OctalRadix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String number = scan.next(); //word --> 127
        boolean octal = true; //assume that the num is octal

        for(int index = 0; index <= number.length() -1; index++)
        {
            char ch = number.charAt(index);
            if(ch < '0' || ch > '7') 
            {
                octal = false;
                break;
            }
        }

        if(octal) {
            System.out.println("Yes it is octal and radix is = 8");
        }
        else{
            System.out.println("No it's not Octal");
        }

        scan.close();
    }
}
