package Sorting;

public class MergeSort {
    
    public static void main(String[] args)
    {

        int[] arr = new int[]{10,7,6,2,1,3,4,5,8};

        System.out.println("Before Sorting");
        printArray(arr);
        
        mergeSort(arr, 0, arr[arr.length-1]);

        System.out.println("After Sorting");
        printArray(arr);
    }

    public static void mergeSort(int[] arr, int low, int high)
    {
        if(low >= high)
            return;

        int mid = low + (high - low) / 2;

        mergeSort(arr, low, mid);
        
        mergeSort(arr, mid+1, high);

        merge(arr, low, mid, high);

        
    }

    public static void printArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void merge(int[] arr, int low, int mid, int high)
    {
        int[] temp = new int[high - low +1]; // new array for copying
        int i = low;
        int j = mid+1;
        int k = 0;

        //compare
        while(i <= mid && j <= high)
        {
            if(arr[i] <= arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        

        // copying remining left elements
        while( i <= mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // copying remining right elements
        while(j <= high)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // copy back to original array
        for(i = low, k = 0 ; i <= high; i++,k++)
        {
            arr[i] = temp[k];
        }

    }
}
