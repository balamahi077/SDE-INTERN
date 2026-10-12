package Array_Concept;

public class CheckArrayIncressingOrder {
    
    public static void main(String[] args)
    {

        // int[] arr = {2, 5, 9, 14};
        // int[] arr = {2, 5, 9, 1};
        // int[] arr = {2};
        // int[] arr = {-2, -5, -9, -14};
        // int[] arr = {-14, -9, -5, -2};
        int[] arr = {2, 2, 2, 2};

        System.out.println(isArrayIncressing(arr));

    }

    public static boolean isArrayIncressing(int[] arr)
    {

        if(arr == null || arr.length == 0)
            return false;

        if(arr.length == 1)
            return true;

        int i = 1;
        int preValue = arr[i-1];
        
        while(i < arr.length)
        {
            if(arr[i] > preValue)
            {
                i++;
            }
            else
            {
                return false;    
            }
        }
        return true;
    }
}
