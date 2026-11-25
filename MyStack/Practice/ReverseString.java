package MyStack.Practice;

public class ReverseString {
    
    public static void main(String[] args) {

        String name = "Balakrishna";
        reverseStringUsingString(name);
        
    }

    public static void reverseStringUsingString(String str)
    {
        Stack stack = new Stack(str.length());

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            stack.push(ch);
        }
        stack.displayChar();
    }
}
