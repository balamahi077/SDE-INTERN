package Chellenges;

import java.util.*;
public class ArrayTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int size = scan.nextInt();

        int[] arr = new int[size];
        
        System.out.println("Enter the target number : ");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = scan.nextInt();
        }
        
        System.out.println("Enter the Number : ");
        int number = scan.nextInt();

        arrayValidation(arr, number);

    }

    public static void arrayValidation(int[] arr , int number)
    {

        for(int index = 0; index < arr.length; index++)
        {
            if(arr[0] == 0){
                System.out.println("Array is Empty");
                return;
            }
            else if(number < arr[index])
            {
                System.out.println(number + " < " + arr[index]);
            }
            else if(number > arr[index])
            {
                System.out.println(number + " > " + arr[index]);
            }
            else if(number == arr[index])
            {
                System.out.println(number + " == " + arr[index]);
            }

        }

    }


    

    
}
