package Array_Concept;

public class CountNumberOfPalindrome {
    
    public static void main(String[] args)
    {

        // int[] arr = new int[]{121, 45, 7, 1331, 80};
        // int[] arr = new int[]{};
        // int[] arr = new int[]{00, 45, 231, 323, 001};
        // int[] arr = new int[]{0101, 2013, 0000, 00100, -11};
        int[] arr = new int[]{15151, 23632, 99, 11, 2121, 313, 4242};
       
       
        // int[] arr = null; // Edge Case 
          

        int getResult = countNumberOfPalindrome(arr);

        System.out.println(getResult);
    }

    public static int countDigit(int num)
    {
        int count = 0;
        
        while(num > 0)
        {
            num = num / 10;
            count++; 
        }
        return count;
    }

    public static boolean isPalindrome(int[] arr)
    {

        int startIndex = 0;
        int lastIndex = arr.length-1;

        while(startIndex <= lastIndex)
        {
            if(arr[startIndex] != arr[lastIndex])
            {
                return false;
            }
            else
            {
                startIndex++;
                lastIndex--;
            }
        }
        return true;
    }

    public static int countNumberOfPalindrome(int[] arr)
    {
        int countPalindrome = 0;

        if(arr == null)
            return -1;

        if(arr.length == 1)
            return 1;

        if(arr.length == 2)
        {
            if(arr[0] == arr[1])
                return countPalindrome+1;
            else
                return countPalindrome;
        }

        for(int index = 0; index < arr.length; index++)
        {
            int countElement = countDigit(arr[index]);
            int[] newArray = new int[countElement];

            int num = arr[index];
            int i = newArray.length-1;

            while(i >= 0)
            {
                newArray[i] = num % 10;
                num = num / 10;
                i--;
            }

            if(isPalindrome(newArray))
            {
                countPalindrome++;
            }
        }
        return countPalindrome;
    }
}
