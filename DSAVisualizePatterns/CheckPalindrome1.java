package DSAVisualizePatterns;

// Problem: Valid Palindrome
// Approach 1: Reverse String
// class used: StringBuilder
// Reason : StringBuilder provide reverse()method
// Easy to understand the logic
// Good starting approach
// Time Comp: O(n)
// Space Comp:O(n)
public class CheckPalindrome1 {

    public static void main(String[] args) {
        
        testPalindrome("madam");
        testPalindrome("rececar");
        testPalindrome("hello");
        testPalindrome("A man a plan, a canal: panama");
    }


    public static void testPalindrome(String str)
    {
        boolean answer = isPalindrome(str);

        System.out.println("Input: "+str);
        System.out.println("Output: "+ answer);
    }

    // write logic here
    // return true if palindrome
    public static boolean isPalindrome(String input)
    {
        // step1 : convert everthing to lowercase
        // becauses A and a shouble be treated same
        input = input.toLowerCase();

        // step2 : keep only letters and digits
        // ignore : spaces, comma, full stop, colon etc..
        String cleaned = "";

        for(int index = 0; index < input.length(); index++)
        {
            char currentChar = input.charAt(index);

            if(Character.isLetterOrDigit(currentChar)) // character is in-build class that has isLetterOrDigit() method
            {
                cleaned += currentChar;
            }
        }

        // step3 : reverse the cleaned string

        StringBuilder sb = new StringBuilder(cleaned);
        String reversed = sb.reverse().toString();

        // step4 : compare 
        return cleaned.equals(reversed);

    }
}
