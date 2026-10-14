package Character_Concept;

public class CountVowelsConsents {
    
    public static void main(String[] args)
    {

        String str = "apple";

        char[] ch = str.toCharArray();

        int[] getResult = countNumberOfVowelsConsents(ch);

        System.out.print(getResult[0] + " , " + getResult[1]);

    }

    public static int[] countNumberOfVowelsConsents(char[] str)
    {
        if(str == null)
            return null;

        if( str.length == 0)
            return new int[]{-1};

        int countVowels = 0;
        int countConsonants = 0;

        for(int i = 0; i < str.length; i++)
        {
         
            char ch = str[i];
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            {

                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A'|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
                {
                    countVowels++;

                }
                else
                {
                    countConsonants++;
                }
            }
        }
        return new int[]{countVowels , countConsonants};
    }
}
