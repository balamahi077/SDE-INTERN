import java.util.*;
public class SecondLargestNumber {

    int getSecondLargestNumber(int[] arr)
    {
        int FirstLargestNumber = arr[0];
        int SecondLargestNumber = arr[0];

        for(int num : arr)
        {
            if(num > FirstLargestNumber)
            {
                FirstLargestNumber = num;
            }
            else if(num > SecondLargestNumber && num < FirstLargestNumber)
            {
                SecondLargestNumber = num;
            }
            else {
                return -1;
            }
        }
        return SecondLargestNumber;
    }
    
    public static void main(String[] args) 
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of Array : ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the "+ size + " Elements");
        for(int index = 0; index < size; index++)
        {
            arr[index] = scan.nextInt();
        }

        SecondLargestNumber sn = new SecondLargestNumber();
        int result = sn.getSecondLargestNumber(arr);

        System.out.println("Printing the array of elements");
        for(int index = 0; index < arr.length; index++)
        {
            System.out.print(arr[index] + " ");
        }

        System.out.println();
        System.out.println("Second Largest Number an Array is : " + result);

        scan.close();

    }
}
