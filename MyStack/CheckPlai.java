package MyStack;

public class CheckPlai {
    
    public static void main(String[] args)
    {

        // String str = "()[]{{";
        // String str = "()[]{}";
        // String str = "()[{}]";
        // String str = "((()))";
        // String str = "[][][]{";
        // String str = "{{{}";
        // String str = "";
        String str = null;

        boolean getResult = isValid(str);

        System.out.println(getResult);

    }

    public static boolean isValid(String s)
    {
        if(s == null)
            return false;

        boolean isBalancedStatus = true;
        Stack stack = new Stack(s.length());

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            
            if(ch == '(' || ch == '[' || ch == '{')
            { 
                stack.push(ch);
            }
            else if(ch == ')' || ch == ']' || ch == '}')
            {
                if(stack.peek() == '(' && ch == ')')
                    stack.pop();

                else if(stack.peek() == '[' && ch == ']')
                    stack.pop();

                else if(stack.peek() == '{' && ch == '}')
                    stack.pop();

                else
                {
                    isBalancedStatus = false;
                    break;
                }

            }
        }
        if(stack.peek() != -1)
            isBalancedStatus = false;

        return isBalancedStatus;
    }
}
