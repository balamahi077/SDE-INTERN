package Array_Concept;
import java.util.Scanner;

public class SumOfArray {
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of Array : ");
        int length = scan.nextInt();

        int[] arr = new int[length];
        for(int index = 0; index < arr.length; index++)
        {
            System.out.println("Enter the value for index " + index +" : ");
            arr[index] = scan.nextInt();
        }

        SumOfArray sm = new SumOfArray();
        int[] getResult = sm.getSumOfArray(arr);

        for(int value : getResult)
        {
            System.out.print(value + " ");
        }

        scan.close();
    }

    int[] getSumOfArray(int[] arr)
    {
        if(arr == null || arr.length == 0)
            return new int[]{-1};

        int[] newArray = new int[arr.length];

        for(int index = 0; index < arr.length; index++)
        {
            int num = arr[index];
            int sum = 0;
            while(num > 0)
            {
                sum += num % 10;
                num = num / 10;
            }
            newArray[index] = sum;
        }

        return newArray;
    }
}
