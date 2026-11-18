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

        String str = "                           Balakrishna                               ";
        removingLeadingTrallingSpaces(str);

        demoSplit();
        demoIsEmpty();
        demoSubstring();
        demoReplace();
        demoIndexOf();
        demoValueOf();

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

    public static void removingLeadingTrallingSpaces(String s)
    {
        s = s.trim();
        System.out.println(s);
    }

    public static void demoSplit()
    {
        String words = "Hi Balakrishna, How are you?";
        String[] word = words.split(" ");

        for(String wo : word)
        {
            System.out.println(wo);
        }
    }

    public static void demoIsEmpty()
    {
        String str1 = "";
        String str2 = "";
        String str3 = "Hi";

        System.out.println(str1.isEmpty());
        System.out.println(str2.isEmpty());
        System.out.println(str3.isEmpty());
    }

    public static void demoSubstring()
    {
        String str = "Programming";

        String str1 = str.substring(3);
        String str2 = str.substring(1, 9);

        System.out.println(str1);
        System.out.println(str2);
    }

    public static void demoReplace()
    {
        String str = "Programming";

        String replaceString = str.replace("m", "*");

        System.out.print(replaceString);
    }

    public static void demoIndexOf()
    {
        String web = "www.google.com";

        int str1 = web.indexOf(".");
        int str2 = web.indexOf(".", 4);

        System.out.println();
        System.out.println(str1);
        System.out.println(str2);
    }

    public static void demoValueOf()
    {
        char[] ch = {'B','a','l','a'};
        int num = 45;

        String str1 = String.valueOf(ch);
        String str2 = String.valueOf(num);

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1.toString());
    }

}
