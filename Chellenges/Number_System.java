package Chellenges;

import java.util.Scanner;

public class Number_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = sc.next();

        boolean binary = true;
        boolean octal = true;
        boolean decimal = true;
        boolean hexadecimal = true;

        for (int i = 0; i < number.length(); i++) {

            char ch = number.charAt(i);

            // Binary
            if (ch != '0' && ch != '1') {
                binary = false;
            }

            // Octal
            if (ch < '0' || ch > '7') {
                octal = false;
            }

            // Decimal
            if (ch < '0' || ch > '9') {
                decimal = false;
            }

            // Hexadecimal
            if (!((ch >= '0' && ch <= '9') ||
                  (ch >= 'A' && ch <= 'F') ||
                  (ch >= 'a' && ch <= 'f'))) {

                hexadecimal = false;
            }
        }

        System.out.println("\nNumber System:");

        if (binary) {
            System.out.println(number + " is Binary (Radix 2)");
        }else {
            System.out.println("is not Binary number");
        }

        if (octal) {
            System.out.println(number + " is Octal (Radix 8)");
        }else {
            System.out.println("is not a Ocatl number");
        }

        if (decimal) {
            System.out.println(number + " is Decimal (Radix 10)");
        }else {
            System.out.println("is not a Decimal number");
        }

        if (hexadecimal) {
            System.out.println(number + " is Hexadecimal (Radix 16)");
        }
        else {
            System.out.println("is not a Hexadecimal number");
        }

        sc.close();
    }
}