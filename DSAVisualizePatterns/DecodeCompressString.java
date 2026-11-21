package DSAVisualizePatterns;

// problem : Decode compressed string
// Input : a3b4c2
// Output : aaabbbbcc
// Asumption : only single digit number after onr letter
// use String Builder because : we don't know size of the output
// TC : O(n^2)
// SP : O(n)

// parsing + stringBuilder

public class DecodeCompressString {
    

    public static void main(String[] args)
    {
        testDecode("a3b4c2");
        testDecode("x1y5");
        testDecode("m2n3");
        testDecode("a12b12c13");
        testDecode("a13b4c130");

    }

    // Test Method
    public static void testDecode(String input)
    {
        System.out.println("Input: "+input);
        System.out.println("Output: "+decode(input));

    }

    // decode Method
    public static String decode(String input)
    {

        StringBuilder answer = new StringBuilder(); 
        int countLetters = 0;

        int i = 0;
        while(i < input.length())
        {
            // read chars
            char currentChar = input.charAt(i);
            i++;

            // read digits
            int number = 0; 
            
            while(i < input.length() && Character.isDigit(input.charAt(i)))  // parsing : converting one format to other
            {
                number = number * 10 + (input.charAt(i) - '0'); // --> more than one digits after character
                i++;
            }
            
            // append
            for(int count = 0; count < number; count++)
            {
                answer.append(currentChar);
                countLetters++;
            }

        }
        System.out.println("No of Letters : "+countLetters);
        return answer.toString();
    }
}
