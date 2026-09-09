import java.util.*;
public class InputScanner {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the a number : ");
        int n = scan.nextInt();
        
        System.out.print("Enter the a name : ");
        String name = scan.nextLine();

        System.out.println("-------------------------------------------");
        System.out.println("number : " + n);
        System.out.println("Name   : "+ name);

        scan.close();
    }
}
