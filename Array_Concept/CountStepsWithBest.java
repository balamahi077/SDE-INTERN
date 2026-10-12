package Array_Concept;

public class CountStepsWithBest {
    
    public static void main(String[] args)
    {

        int[] arr = {8000, 12000, 10500, 9000, 15000};

        int[] getResult = getBestStepsInDay(arr);

        System.out.println(getResult[0] +" "+ getResult[1]);

    }

    public static int[] getBestStepsInDay(int[] arr)
    {
        
        if(arr == null || arr.length == 0)
            return new int[]{-1};

        int count = 0;
        int bestSteps = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > 10000)
            {
                count++;
                if(arr[i] > bestSteps)
                {
                    bestSteps = arr[i];
                }
            }
        }
        return new int[]{count , bestSteps};
    }
}
