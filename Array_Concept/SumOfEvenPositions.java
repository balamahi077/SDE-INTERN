package Array_Concept;

public class SumOfEvenPositions {
    public static void main(String[] args) {

        int[] arr = new int[]{10,3,20,7,30};

        int result = getSumOfEvenPositions(arr);

        System.out.println(result);
        
    }

    public static int getSumOfEvenPositions(int[] arr)
    {
        if(arr == null || arr.length == 0)
            return -1;

        int sum = 0;

        for(int i = 0; i < arr.length; i+=2)
        {
            sum += arr[i];
        }
        return sum;
    }
}
