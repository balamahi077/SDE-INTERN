import java.util.Scanner;

public class umberSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Decimal to Binary");
        System.out.println("2. Decimal to Octal");
        System.out.println("3. Decimal to Hexadecimal");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter decimal number: ");
        int n = sc.nextInt();

        int radix = 0;

        switch (choice) {

            case 1:
                radix = 2;
                break;

            case 2:
                radix = 8;
                break;

            case 3:
                radix = 16;
                break;

            default:
                System.out.println("Invalid choice");
                return;
        }

        int temp = n;
        String result = "";

        while (temp > 0) {

            int remainder = temp % radix;

            if (remainder < 10) {
                result = remainder + result;
            } else {
                result = (char) ('A' + remainder - 10) + result;
            }

            temp = temp / radix;
        }

        System.out.println("Result = " + result);

        sc.close();
    }
}