package Leetcode;

class Movezeros
{
    public static void main(String[] args) {

        // int[] nums = new int[]{4,2,4,0,0,3,0,5,1,0};
        int[] nums = new int[]{0};

        movezeros(nums);

        for(int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i] + " ");
        }
        
    }

    public static void movezeros(int[] nums)
    {
        int j = 0; // Pointer to place the next non-zero element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap current element with the element at index j 
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;   // Move j to the next index for placing non-zero
            }
        }
    }
}
