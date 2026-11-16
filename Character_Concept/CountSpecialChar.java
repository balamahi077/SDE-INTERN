package Character_Concept;

import java.util.Scanner;

public class CountSpecialChar {
    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in);
        // String name = scan.next();
        // scan.close();

        // char[] ch = name.toCharArray();

        // int getResult = countSpecialCharacters(ch);

        // int getResult1 = countOccurences(name, 'a');

        // char getResult2 = fingLargestCharacter(ch);

        // char[] getResult3 = replaceVowel(ch);

        // System.out.println(getResult);
        // System.out.println(getResult1);
        // System.out.println(getResult2);
        // findingLargestforString();
        // System.out.println(getResult3);
        // findingLengthOfLastWord();
        // leetcode557();
        String name = "hello world";
        reverseWords(name);

    }

    static int countSpecialCharacters(char[] ch)
    {

        int countSpe = 0;

        for(int index = 0; index < ch.length; index++)
        {
            char character = ch[index];

            if(!((character >= 'A' && character <= 'Z')||
                (character >= 'a' && character <= 'z')||
                (character >= '0' && character <= '9')))
                {
                    countSpe++;
                }
        }
        return countSpe;
    }

    static int countOccurences(String str , char target)
    {
        int countOccur = 0;
        for(int index = 0; index < str.length(); index++)
        {
            char ch = str.charAt(index);
            if(target == ch)
            {
                countOccur++;
            }
        }
        return countOccur;
    }
  
    static char fingLargestCharacter(char[] str)
    {
        char largestElement = str[0];
        for(int index = 1; index < str.length; index++)
        {
            if(str[index] > largestElement)
            {
                largestElement = str[index];
            }
        }
        return largestElement;
    }

    static void findingLargestforString()
    {
        String name = "santosh";
        char largest = name.charAt(0);
        for(int index = 1; index < name.length(); index++)
        {
            if(name.charAt(index) > largest)
            {
                largest = name.charAt(index);
            }
        }
        System.out.println("Largest Character is : " + largest);
    }

    static char[] replaceVowel(char[] ch)
    {
        for(int index = 0; index < ch.length; index++)
        {
            char character = ch[index];
            if(character == 'A' ||
                character == 'a'|| 
                character == 'E'|| 
                character == 'e'|| 
                character == 'I'||
                character == 'i'|| 
                character == 'O'|| 
                character == 'o'||
                character == 'U'||
                character == 'u'
             )
             {
                ch[index] = '*';
             }
        }
        return ch;
    }

    static char[] replaceVowelWithString()
    {
        String ch = "santosh";

        for(int index = 0; index < ch.length(); index++)
        {
            char character = ch.charAt(index);
            if(character == 'A' ||
                character == 'a'|| 
                character == 'E'|| 
                character == 'e'|| 
                character == 'I'||
                character == 'i'|| 
                character == 'O'|| 
                character == 'o'||
                character == 'U'||
                character == 'u'
             )
             {
                ch.charAt(index) = '*';
             }
        }
        return chara;
    }

    // leetcode : 58
    static void findingLengthOfLastWord()
    {
        String str = "Hello world     ";

        int count = 0;
        int i = str.length() -1;

        while(i >= 0 && str.charAt(i) == ' ')
        {
            i--;
        }

        while(i >= 0 && str.charAt(i) != ' ')
        {
            count++;
            i--;
        }
        System.out.println("Length of Last word : " + count);
    }

    // leetcode : 557
    static void leetcode557()
    {
        String sentance = "My Nmae is Balakrishna";

        char[] ch = sentance.toCharArray();

        int start = 0;

        for(int end = 0; end <= ch.length; end++)
        {
            if(end == ch.length || ch[end] == ' ')
            {
                int left = start;
                int right = end-1;

                while( left < right)
                {
                    char temp = ch[left];
                    ch[left] = ch[right];
                    ch[right] = temp;

                    left++;
                    right--;
                }
                start = end +1;
            }
        }

        System.out.println("After");
        for(char ch1 : ch)
        {
            System.out.print(ch1 );
        }
    }


    public static void reverseWords(String s) {

        char[] ch = s.toCharArray();
        int start = 0;
        for(int end = 0; end <= ch.length; end++)
        {
            if(end == ch.length || ch[end] == ' ')
            {
                int left = start;
                int right = end -1;

                while(left < right)
                {
                    char temp = ch[left];
                    ch[left] = ch[right];
                    ch[right] = temp;

                    left++;
                    right--;
                }
                start = end +1;
            }
        }
        
        for(char ch1 : ch)
        {
            System.out.print(ch1);
        }
    }


}
