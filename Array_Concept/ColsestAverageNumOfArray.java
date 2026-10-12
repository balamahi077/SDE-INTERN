package Array_Concept;
public class ColsestAverageNumOfArray
{

    public static void main(String[] args)
    {
        //int[] nums = {2, 9, 4, 10};
        //int[] nums = {-2, -9, -4, 10};
        //int[] nums = null;
        //int[] nums = {5};  //if only one element then return -1, other wise runtime exception ArrayIndexBoundException
        //int[] nums = {5,6};
        int[] nums = {0,0,0,0};



        
        int getResult = getClosestAverageNumberOfArray(nums);

        System.out.println(getResult);
    }

    public static int getClosestAverageNumberOfArray(int[] nums)
    {
        if(nums == null || nums.length == 0 || nums.length == 1)
            return -1;

        int average = nums.length / 2;

        return nums[average -1];
    }

}