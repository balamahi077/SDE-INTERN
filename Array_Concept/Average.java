package Array_Concept;

public class Average {

    public static void main(String[] args)
    {
        int[] nums = new int[]{70, 85, 90, 50};

        float result = getAverageOfMarks(nums);

        System.out.println("Average : " + result);

    }

    public static float getAverageOfMarks(int[] nums)
    {
        if(nums == null || nums.length == 0)
            return -1;

        int sum = 0;

        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
        }
        System.out.println("Sum : " + sum);
        float Average = sum / nums.length+1;
        return Average;
    }
    
}
