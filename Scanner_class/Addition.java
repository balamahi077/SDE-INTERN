package Scanner_class;
import java.util.*;

public class Addition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the two number : ");
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        int result = firstNumber + secondNumber;

        System.out.println("Result : " + result);
        scan.close();

    }
}
