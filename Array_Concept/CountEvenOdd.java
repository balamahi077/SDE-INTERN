package Array_Concept;

public class CountEvenOdd {
    public static void main(String[] args)
    {
        int[] arr = new int[]{};

        int[] result = getCountEvenOddNumbers(arr);
        System.out.println(result);

    }

    public static int[] getCountEvenOddNumbers(int[] arr)
    {
        if(arr == null || arr.length == 0)
        {
            return arr;
        }

        int evenCount = 0, oddCount = 0;
        for(int index = 0; index < arr.length; index++)
        {
            if(arr[index] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        return new int[]{evenCount , oddCount};
    }
    
}
