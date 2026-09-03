package Practice;
import java.util.Scanner;

class Marks {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Obtained Marks of DSA : ");
        float mark1 = sc.nextFloat();

        System.out.print("Enter Obtained Marks of OOPS : ");
        float mark2 = sc.nextFloat();

        System.out.print("Enter Obtained Marks of DBMS : ");
        float mark3 = sc.nextFloat();

        System.out.print("Enter Obtained Marks of CN : ");
        float mark4 = sc.nextFloat();

        float total = mark1 + mark2 + mark3 + mark4;

        float average = total / 4;

        float percentage = (total / 400) * 100;

        System.out.println("-------------------------------------------------");
        System.out.println("Total Marks   = 400" );
        System.out.println("Obtained Marks= " + total);
        System.out.println("Average       = " + average);
        System.out.println("Percentage    = " + percentage + " %");

        sc.close();
    
    }
}
