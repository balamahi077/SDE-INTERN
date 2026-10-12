package Array_Concept;

public class CountHotterDayBefore {
    
    public static void main(String[] args)
    {
        //int[] arr = {30, 32, 31, 35, 36, 37};
        //int[] arr = {-2, 0, -1, 3, 3, 5}; //Negative inputs
        //int[] arr = {20, 20, 20, 20, 20, 20}; //Equal inputs
        //int[] arr = {20};
        int[] arr = null;

        int countResult = getCountHotterDayBefore(arr);

        System.out.println(countResult);

        

    }

    public static int getCountHotterDayBefore(int[] arr)
    {
        //Edge case if array is null or empty
        if(arr == null || arr.length == 0)
            return -1;

        // count inilization
        int countHotDays = 0;

        for(int i = 1; i < arr.length; i++)
        {
            int preTemp = arr[i-1];

            if(arr[i] > preTemp)  // only if temp is > preTemp, ignore if = preTemp
            {
                countHotDays++;
            }
        }

        return countHotDays;
    }
}
