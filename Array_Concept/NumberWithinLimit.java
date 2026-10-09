package Array_Concept;

public class NumberWithinLimit {

    public static void main(String[] args)
    {
        int[] array = new int[]{45, 67, 100, 52, 99, 120, 50};

        int[] result = getNumWithinTheLimit(array);

        for(int value : result)
        {
            System.out.print(value + " ");
        }

    }

    public static int[] getNumWithinTheLimit(int[] nums)
    {
        if(nums == null || nums.length == 0)
            return new int[]{-1};

        //here there are two posibilites that are
        // 1. create new array & the length is same as given array length -- problem is memory waste
        // 2. count the elements with that and then create newArray of count

        int count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 50 && nums[i] < 100)
                count++;
        }

        int[] newArray = new int[count];
        int j = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 50 && nums[i] < 100)
            {
                newArray[j] = nums[i];
                j++;
            }
        }

        return newArray;
    }
    
}
