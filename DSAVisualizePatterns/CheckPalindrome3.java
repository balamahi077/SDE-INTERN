package DSAVisualizePatterns;
// Leetcode 125
// Approach 3: best Approach using string and  two pointer
// Reason : only travese is required, no extra objects
// TC : O(n)
// SC : O(1)
public class CheckPalindrome3 {
    
    public static void main(String[] args) {

        testPalindrome("madam");
        testPalindrome("racecar");
        testPalindrome("hello");
        testPalindrome("A man a plan, a canal: panama");
        testPalindrome(null);
        testPalindrome("ABCDEDCBA");
        
    }

    public static void testPalindrome(String input)
    {

        boolean answer = isPalindrome(input);

        System.out.println("Input: "+input);
        System.out.println("Output: "+answer);

    }

    public static boolean isPalindrome(String input)
    {
        // string is null
        if(input == null)
            return false;

        // convert to lowercase
        input = input.toLowerCase();

        // two pointer start here 
        int left = 0;
        int right = input.length()-1;
       
        while(left < right) // overall traversal
        {

            // ignore non letters from left
            while(left < right && !Character.isLetterOrDigit(input.charAt(left))) // left pointer and ignoring
            {
                left++;
            }
            // ignore non letters from right
            while(left < right && !Character.isLetterOrDigit(input.charAt(right)))
            {
                right--;
            }
            
            if(input.charAt(left) != input.charAt(right))
            {
                return false;
            }   

            left++;
            right--;

        }
        return true; // if(charAt(left) == charAt(right))
    }
}
