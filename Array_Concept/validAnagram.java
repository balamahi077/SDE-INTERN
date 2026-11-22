package Array_Concept;

public class validAnagram {
    
    public static void main(String[] args) {

        boolean getResult = isAnagram();

        System.out.println(getResult);
        
    }

    public static boolean isAnagram()
    {

        String s = "abcc";
        String t = "cbac";

        if(s.length() != t.length())
            return false;
        
        int[] frequency = new int[26];

        for(int i = 0; i < s.length(); i++)
        {
            frequency[s.charAt(i) - 'a']++;
            frequency[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < s.length(); i++)
        {
            if(frequency[i] != 0)
            {
                return false;
            }
        }
        return true;
    }

}
