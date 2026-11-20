package DSAVisualizePatterns;

// Approach 2: build clean String using stringBuilder
// reason : avoid creating multiple objects while cleaning
// TC : O(n)
// SC : O(n)
public class CheckPalindrome2 {
    
    public static void main(String[] args) {

        testPalindrome("madam");
        testPalindrome("hello");
        testPalindrome("racecar");
        testPalindrome("A man a plan, a canal: panama");
        
    }

    public static void testPalindrome(String input)
    {
        boolean answer = isPalindrome(input);

        System.out.println("Input: "+input);
        System.out.println("Output: "+answer);

    }

    public static boolean isPalindrome(String input)
    {
        //convert to lowercase
        input = input.toLowerCase();

        // use string as it has append() method to avoid creating new String object
        StringBuilder cleaned = new StringBuilder();

        for(int i = 0; i < input.length(); i++)
        {
            char currentChar = input.charAt(i);
            if(Character.isLetterOrDigit(currentChar))
            {
                cleaned.append(currentChar);
            }
        }

        // reverse
        StringBuilder reversBuilder = new StringBuilder(cleaned);
        reversBuilder.reverse();

        //compare
        return cleaned.toString().equals(reversBuilder.toString());
    }


}
