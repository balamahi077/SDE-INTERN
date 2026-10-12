package Array_Concept;

public class CountDivisibleNums {
    
    public static void main(String[] zrgs)
    {

        //int[] nums = {15, 9, 30, 10, 45, 7};
        //int[] nums = {-15, 9, -30, -10, 45, -7};
        int[] nums = null;



        int getResult = countDivisibleNums(nums);

        System.out.println(getResult);
        
    }

    public static int countDivisibleNums(int[] nums)
    {

        if(nums == null || nums.length == 0)
            return -1;

        int counter = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] % 3 == 0 && nums[i] % 5 == 0)
                counter++;
        }
        return counter;
    }
}
