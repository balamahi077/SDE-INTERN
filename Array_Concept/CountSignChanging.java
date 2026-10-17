package Array_Concept;
import java.util.Scanner;

public class CountSignChanging {
    
    public static void main(String[] args)
    {
        // create Scanner object for taking input from the user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = scan.nextInt();
        
        // i will create new array and the size is user preovided, after that storing element in array
        int[] arr = new int[size];
        System.out.println("Enter the Elements : ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = scan.nextInt();
        }

        // create the object of class which is calling method because method is insteance method
        CountSignChanging csc = new CountSignChanging();

        short getResult = csc.getSignChangingNumbers(arr);

        // print the result, which returned function
        System.out.println(getResult);

        scan.close();



    }

    short getSignChangingNumbers(int[] arr)
    {

        if(arr == null || arr.length == 0)
            return -1;

        if(arr.length == 1)
            return 0;

        short countChangingNumber = 0;

        for(int index = 0; index < arr.length-1; index++)
        {
            if (arr[index] > 0 && arr[index+1] < 0) 
            {
                countChangingNumber++;
                
            } 
            if(arr[index] < 0 && arr[index+1] > 0)
            {
                countChangingNumber++;    
            }
        }
        return countChangingNumber;
    }
}
