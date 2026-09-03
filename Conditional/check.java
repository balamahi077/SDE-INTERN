package Conditional;

public class check {
    
    public static void main(String[] args) {

        int a = 20;
        int b = 20;

        if(a == b) // == works for primitive data types
        {
            System.out.println("true");
        }
        else {
            System.out.println("False");
        }


        String day = "Saturday";
        if(day.equals(day)) {  // works for object
            System.out.println("Holiday");
        }
        else {
            System.out.println("Working day");
        }

        if(-1) {
            System.out.println("Hi");
        }
    }
}
