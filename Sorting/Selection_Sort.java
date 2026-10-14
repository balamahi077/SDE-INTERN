package Sorting;

public class Selection_Sort {
    
    public static void main(String[] args)
    {

        // int[] arr = new int[]{9,2,16,6,13};
        // int[] arr = new int[]{9,9,16,6,13};
        // int[] arr = new int[]{9,2,-16,6,-13};
        // int[] arr = new int[]{9,0,16,6,13};
        // int[] arr = new int[]{9};
        // int[] arr = new int[]{};
        int[] arr = null;







        getSelectionSort(arr);

        if(arr != null)
        {
            for(int value : arr)
                {
                    System.out.print(value + " ");
                }
        }
            

    }

    public static void getSelectionSort(int[] nums)
    {
        if( nums == null || nums.length == 0)
            return ;

        for(int i = 0; i < nums.length-1; i++)
        {
            int minValue = nums[i];
            int minIndex = i;

            for(int j = i+1; j < nums.length; j++)
            {

                if(nums[j] < minValue)
                {
                    minValue = nums[j];
                    minIndex = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;

        }
    }


}
