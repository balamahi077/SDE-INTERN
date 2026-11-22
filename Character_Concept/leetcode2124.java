package Character_Concept;

//Problem : leetcode 2124
// Check if 'a' repeat after 'b' return false otherwise true
// uding string
// benifit : using string not required the charArray
// TC: O(n)
// SP: O(1)

class leetcode2124
{
    public static void main(String[] args) {

        // String str = "aaabbb";
        String str = "abab";
        
        boolean getResult = findCharAfterB(str);

        System.out.println(getResult);
        
    }

    //main logic
    public static boolean findCharAfterB(String str)
    {
        // Searching 'B'
        boolean foundB = false;
        // to store 'B' index
        int idxOfB = -1; 
        // loop will stop when 'B' occured
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) != 'a')
            {
                foundB = true; 
                idxOfB = i;
                break;
            }
        }

        if(foundB)
        {
            for(int i = idxOfB +1; i < str.length(); i++)
            {
                if(str.charAt(i) == 'a')
                    return false;
            }
        }
        return true;
    }
}
