package Sorting;

public class Bubble_Sort {
    
    public static void main(String[] args) {

        testBubbleSorting();
              
    }

    public static void testBubbleSorting()
    {
        // int[] array = new int[]{5, 4, 3, 2, 1};
        // int[] array = new int[]{5, 4, 19, 2, 3};
        // int[] array = new int[]{10};
         int[] array = null;
        // int[] array = {};
        // int[] array = new int[]{-5, -4, -19, 2, 3};
        
         
 
         System.out.println("Before Sorting");
         printBubbleSort(array);
         System.out.println();
 
         bubbleSort(array);
 
         System.out.println();
         System.out.println("After Sorting");
         printBubbleSort(array); 
    }


    public static int[] bubbleSort(int[] arr)
    {
        //Edge case if array is null or array is empty it will return -1
        if(arr == null || arr.length == 0)
            return new int[]{-1};

        //Edge case array is only one element
        if(arr.length == 1)
            return new int[]{arr[0]};

        //Edge case if array is more than one values then sort 
        for(int i = 0; i <= arr.length; i++)
        {
            for(int j = 0; j < arr.length-i-1; j++)
            {

                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]   = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void printBubbleSort(int[] arr)
    {
        for(int value : arr)
        {
            System.out.print(value + " ");
        }
    }
}
