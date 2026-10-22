package Character_Concept;

public class HtmlEncoding {
    
    public static void main(String[] args)
    {
        String str = "https://a.com/b form/ submit";
        char[] ch = str.toCharArray();

        char[] getResult = getHtmlEncoding(ch);

        System.out.println(getResult);

    }

    public static int calculateWriteIndex(char[] ch)
    {
        int count = 0;
        for(int index = 0; index < ch.length; index++)
        {
            if(ch[index] == ' ')
            {
                count = count + 2;
            }
        }
        int writeIndex = ch.length + count;
        return writeIndex;
    }

    public static char[] getHtmlEncoding(char[] ch)
    {
        int writeIndex = calculateWriteIndex(ch);
        char[] newChar = new char[writeIndex];
        int readIndex = ch.length-1;

        char[] replaceChar = new char[]{'%','2','0'};

        while(writeIndex > 0)
        {
            if(ch[readIndex] == ' ')
            {
                int count = replaceChar.length-1;
                while(count >= 0)
                {
                    newChar[writeIndex-1] = replaceChar[count];
                    count--;
                    writeIndex--;
                }
                readIndex--;
            }
            else
            {
                newChar[writeIndex-1] = ch[readIndex];
                writeIndex--;
                readIndex--;
            }
        }
        return newChar;
    }
}
