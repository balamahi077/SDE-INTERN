package DSAVisualizePatterns;

public class removeElement
{
    public static void main(String[] args) {

        int[] nums = new int[]{0,1,2,2,3,0,4,2};

        int getRemoveElement = removeElements(nums, 2);

        System.out.println(getRemoveElement);
        
    }

    public static int removeElements(int[] nums, int val)
    {
        int count = 0;
        int left = 0;
        int right = nums.length -1;

        while(right > left)
        {
            if(nums[right] == val)
            {
                nums[right] = nums[right] / 10;
                right--;
                count++;
            }
            else if(nums[left] == val)
            {
                nums[left] = nums[right];
                nums[right] = nums[right] / 10;
                left++;
                right--;
                count++;
            }
            else
                left++;
        }
        return nums.length - count;
    }
}