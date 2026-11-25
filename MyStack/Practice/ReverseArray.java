package MyStack.Practice;


public class ReverseArray {
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{25,1,5,46,2,81};
        reverseArrayUsingStack(arr);

    }

    public static void reverseArrayUsingStack(int[] arr)
    {
        Stack stack = new Stack(arr.length);

        for(int i = 0; i < arr.length; i++)
        {
            int value = arr[i];
            stack.push(value);
        }
        
        stack.display();
    }
}


