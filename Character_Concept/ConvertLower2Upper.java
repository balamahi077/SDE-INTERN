package Character_Concept;

public class ConvertLower2Upper {
    
    public static void main(String[] args)
    {

        char[] ch = new char[]{'c','o','d','e'};

        char[] getResult = getConvertedUpperCaseChar(ch);

        for(char character : getResult)
        {

            System.out.print(character + " ");
        }

    }

    public static char[] getConvertedUpperCaseChar(char[] ch)
    {
        if(ch == null || ch.length == 0)
            return new char[]{'a'};

        char[] upperCaseArray = new char[ch.length];
        
        int index = 0;
        while(index < ch.length)
        {
            
            if(ch[index] >= 'a' && ch[index] <= 'z')
            {
                int upperCase = ch[index] - 32;
                upperCaseArray[index] = (char)upperCase;    
            }
            index++; 
        }
        return upperCaseArray;
    }
}
