package MyStack;

public class CheckPalindrome {
    
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,5,2,1};
        int[] reverse = new int[]{1,2,3,4,5,6};


        boolean getResult = isPalindrome(arr);

        System.out.println("Given Array is Plaindrome : " + getResult);

        int[] getReverseArray = reverseArray(reverse);

        for(int value : getReverseArray)
        {
            System.out.print(value + " ");
        }
        
    }

    public static boolean isPalindrome(int[] arr)
    {
        boolean checkPali = true;

        Stack stack = new Stack(arr.length);

        int mid = 0 + (arr.length-1 + 0) / 2;
        for(int i = 0; i <= mid; i++)
        {
            stack.push(arr[i]);
        }

        for(int i = mid; i < arr.length; i++)
        {
            int top = stack.peek();
            if(top != arr[i])
            {
                checkPali = false;
            }
            stack.pop();
        }

        return checkPali;
    }

    public static int[] reverseArray(int[] nums)
    {
        Stack stack = new Stack(nums.length);

        for(int i = 0; i < nums.length; i++)
        {
            stack.push(nums[i]);
        }

        for(int i = 0; i < nums.length; i++)
        {
            int top = stack.peek();
            nums[i] = top;
            stack.pop();
        }

        return nums;
    }
}
