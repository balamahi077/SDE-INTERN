package Array_Concept;

public class CountMostRunScoredOver {
    
    public static void main(String[] args) {

        //int[] arr = new int[]{6,12,4,15,9};
        int[] arr = new int[]{6,12,4,15,15};


        CountMostRunScoredOver cm = new CountMostRunScoredOver();

        int getResult = cm.getHighScoredOver(arr);

        System.out.println(getResult);
        
    }

    int getHighScoredOver(int[] arr)
    {

        if(arr == null || arr.length == 0)
            return -1;

        int mostRuns = arr[0];
        int mostRunsOver = 0;

        for(int index = 1; index < arr.length; index++)
        {

            if(arr[index] > mostRuns)
            {
                mostRuns = arr[index];
                mostRunsOver = index;
            }
        }

        return mostRunsOver+1;
    }
}
