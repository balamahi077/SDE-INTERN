import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String str1 = sc.next();

        System.out.print("Enter second word: ");
        String str2 = sc.next();

        if (str1.length() != str2.length()) {

            System.out.println("Not an Anagram");

        } else {

            int count = 0;

            for (int i = 0; i < str1.length(); i++) {

                for (int j = 0; j < str2.length(); j++) {

                    if (str1.charAt(i) == str2.charAt(j)) {
                        count++;
                        break;
                    }
                }
            }

            if (count == str1.length()) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not an Anagram");
            }
        }

        sc.close();
    }
}

