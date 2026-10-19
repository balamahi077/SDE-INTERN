package Character_Concept;

public class Dhuranduar3 {

    public static void printCharacter(char[] word)
    {
        for(int i = 0; i < word.length; i++)
        {
            System.out.print(word[i] + " ");
        }
    }

    public static char[] miniEncryption(char[] word)
    {
        char[] encryptedArray = new char[word.length*2];
        int encrypt = 0;

        for(int i = 0; i < word.length; i++)
        {       
            int secret = 9;
            char ch = word[i];
            for(int j = 0; j < encryptedArray.length; j+=2)
            {
                encrypt = (int)word[i] + (2 + secret); 
                encryptedArray[i] = (char)encrypt;          

            }
        }

        return encryptedArray;
    }

    public static char[] miniDecryption(char[] word, int publicKey , int privateKey)
    {

        for(int i = 0; i < word.length; i++)
        {
            int decrypt = (int)word[i] - ( publicKey + privateKey );   
            word[i] = (char)decrypt;
        }
        return word;
    }

    public static void main(String[] args)
    {
        String message = "Hi Hamza";
        char[] sentace = message.toCharArray();


        printCharacter(sentace);

        char[] getEncrypt = miniEncryption(sentace);
        System.out.println();
        printCharacter(getEncrypt);

        miniDecryption(sentace, 2 , 9);
        System.out.println();
        printCharacter(sentace);

    }


    
}
