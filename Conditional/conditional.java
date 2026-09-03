package Conditional;
import java.util.*;
public class conditional {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the Age : ");
        // int age = scan.nextInt();

        // if(age > 18) {
        //     System.out.println("Eligible");
        // }

        // if( age >= 18 ) 
        // {
        //     System.out.println("Eligible");
        // }
        // else 
        // {
        //     System.out.println("Not Eligible");
        // }


        // if( age >= 18 ) 
        // {
        //     System.out.println("Eligible");
        // }
        // else if(age < 18 && age > 0) 
        // {
        //     System.out.println("Not Eligible");
        // }
        // else 
        // {
        //     System.out.println("Invalied");
        // }


        
        // if(age >= 18) {
        //     System.out.println("Indian Citizenship True/False : ");
        //     boolean citizen = scan.nextBoolean();

        //     if(citizen) {
        //         System.out.println("Your Eligible");

        //     }
        //     else {
        //         System.out.println("Your not Eligible");
        //     }
        // }
        // else {
        //     if(age < 18 && age > 0 ){

        //         System.out.println("Grow up.");
        //     }
        //     else {
        //         System.out.println("Invalid");
        //     }
        // }



        // System.out.println("Enter the Day Number(1-7) : ");
        // int Day = scan.nextInt();

        // switch(Day) 
        // {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wed");
        //         break;
        //     case 4:
        //         System.out.println("Thus");
        //         break;
        //     case 5:
        //         System.out.println("Fri");
        //         break;
        //     case 6:
        //         System.out.println("Sat");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default :
        //         System.out.println("Invalid");
        // }

        

        System.out.println("Voting Check using Switch");
        System.out.println("Enter your Age : ");
        int age1 = scan.nextInt();
        String result = (age1 > 18) ? "YES" : "NO";

        switch(result) 
        {
            case "YES" :
                System.out.println("Eligible");
                break;
            case "NO":
                System.out.println("Not Eligible");
                break;
            default:
                System.out.println("Invalied");
        }

        scan.close();

    }
}
