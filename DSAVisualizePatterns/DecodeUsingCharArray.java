package DSAVisualizePatterns;

public class DecodeUsingCharArray {
    
    public static void main(String[] args) {

        String s = "a3b2c";
        char[] getResult = mainLogic(s);

        
        for(char x : getResult)
        {
            System.out.print(x + " ");
        }
        
    }

    public static char[] mainLogic(String str)
    {
        char[] newArray = new char[countArrayLength(str)];
        int writeIndex = 0;
        int number = 0;
        char alphba = ' ';
        
        for(int readIndex = 0; readIndex < str.length(); readIndex++)
        {
            char ch = str.charAt(readIndex);
            if(ch >= 'a' && ch <= 'z')
            {
                newArray[writeIndex++] = ch; 
                alphba = ch;
            }

            if(ch >= '0' && ch <= '9')
            {
                number = (ch - '0') -1;     
                for(int i = 0; i<= number-1; i++)
                {
                    newArray[writeIndex++] = alphba;
                }
            }

        }
        return newArray;
    }

    public static int countArrayLength(String str)
    {

        int countLength = 0;
        int countAlpha = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9')
            {
                int num = (ch - '0') -1;
                countLength += num;
            }
            if(ch >= 'a' && ch <= 'z')
            {
                countAlpha++;
            }
        }
        return countLength + countAlpha;
    }
}
