package Sorting;

public class InsertionSort {
    
    public static void main(String[] args)
    {

        //int[] arr = new int[]{9,2,16,6,13};
        //int[] arr = new int[]{8,7,6,5,4};
        //int[] arr = new int[]{8,7,6,5,6,7};
        //int[] arr = new int[]{8,-7,6,-5,4};
        int[] arr = null;
        

        int[] getResult = getSortedArray(arr);

        for(int index = 0; index < getResult.length; index = index + 1)
        {
            System.out.print(getResult[index] + " ");
        }

    }

    public static int[] getSortedArray(int[] arr)
    {
        if(arr == null || arr.length == 0)
            return new int[]{-1};

        for(int index = 1; index < arr.length; index++)
        {
            int key = arr[index];
            int previousIndex = index-1;
            while(previousIndex >= 0 && arr[previousIndex] > key)
            {
                if(arr[previousIndex] > key)
                {
                    arr[previousIndex + 1] = arr[previousIndex];
                    previousIndex--;
                }
            }
            arr[previousIndex + 1] = key;

        }

        return arr;
    }
}
