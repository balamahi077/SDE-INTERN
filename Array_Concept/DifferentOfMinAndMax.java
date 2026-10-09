package Array_Concept;

public class DifferentOfMinAndMax {

    public static void main(String[] args)
    {

        int[] arr = new int[]{14, 3, 27, 9, 6, 11, 13};

        int result = getDiffBetweenMaxMin(arr);

        System.out.println(result);

    }

    public static int getDiffBetweenMaxMin(int[] arr)
    {
        if(arr == null || arr.length == 0)
            return -1;

        int maxValue = arr[0];
        int minValue = arr[1];
        int diff = 0;

        for(int i = 2; i < arr.length; i++)
        {
            if(arr[i] > maxValue)
                maxValue = arr[i];

            else if(arr[i] < minValue)
                minValue = arr[i];

            diff = maxValue - minValue;
        }

        return diff;
    }
    
}
