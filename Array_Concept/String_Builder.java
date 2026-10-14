package Array_Concept;

public class String_Builder {
    
    public static void main(String[] args)
    {

        String str = "b3a2c4r";
        char[] charArray = str.toCharArray();
        StringBuilder getResult = expandString(charArray);

        
        for(int i = 0; i < getResult.length(); i++)
        {
            
            System.out.println(getResult.charAt(i));

        }


    }


    public static int calculateWriteIndex(char[] str)
    {
        int count = 0;

        for(int i = 0; i < str.length; i++)
        {
            if(str[i] >= '2' && str[i] <= '9')
            {
                count = count + (str[i] - '0') -1;
            }
            else{
                count = count + 1;
            }
        }
        return count+1;
    }

    public static int copyCharFromRight2Left(char[] str, char ch, int count, int writeIndex, StringBuilder sb)
    {

        while(count > 0)
        {
            sb.append(ch);
            writeIndex--;
            count--;
        }
        return writeIndex;
    }

    public static StringBuilder expandString(char[] str)
    {
        int writeIndex = calculateWriteIndex(str);
        int readIndex = str.length-1;

        StringBuilder sb = new StringBuilder();

        while(writeIndex >= 0)
        {

            if(str[readIndex] >= '2' && str[readIndex] <= '9')
            {
                int count = str[readIndex] - '0';
                writeIndex = copyCharFromRight2Left(str, str[readIndex-1], count, writeIndex,sb);
            }
            else
            {
                sb.append(str[readIndex]);
                writeIndex--;
            }
            readIndex--;
        }

        return sb;
    }
    
}
