package Scanner_class;

import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the base width of Triangle ");
        double base = scan.nextDouble();
        System.out.println("Enter the height of the Triangle : ");
        double height = scan.nextDouble();

        double area = (base * height) /  2.0;

        
        
        System.out.println("Area of Triangle : " + area);
        scan.close();

        
       }
    }
