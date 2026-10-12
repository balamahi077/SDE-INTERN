package Array_Concept;

public class CountStudentPassed {

    public static void main(String[] args)
    {
        int[] array = new int[]{40, 22, 35, 90, 18};

        int result = getNumberOfStudentPassed(array);

        System.out.println(result);

    }

    public static int getNumberOfStudentPassed(int[] nums)
    {
        //Edge case 1 if array is null or array is empty
        if(nums == null || nums.length == 0)
            return -1;

        //Edge case 2 if array is more than one element count the student passed > 35
        int countStudentPassed = 0;

        for(int i = 0; i < nums.length; i++)
        {
            // check the student marks >= 35 and <= 100
            if(nums[i] >= 35 && nums[i] <= 100)
                countStudentPassed++;
        }

        return countStudentPassed;
    }
    
}
