package Sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{50,15,80,25,60,10,90,40,70,30};
        sort(arr, 0, arr.length-1);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        
        
    }

    public static void sort(int[] arr, int low, int high)
    {
        int i = low;
        int j = high;
        int pivot = arr[low];

                
        
    }

    
}
