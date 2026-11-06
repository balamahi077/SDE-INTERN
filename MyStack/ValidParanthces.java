package MyStack;

public class ValidParanthces {
    
    public static void main(String[] args) {

        String str = "((()))";

        Boolean getResult = isBalancedExpression(str);

        System.out.println(getResult);
        
    }

    public static boolean isBalancedExpression(String exp)
    {
        if(exp == null)
            return false;

        Stack stack = new Stack(exp.length());
        boolean isBalanced = true;

        // read one char at a time from loop
        for(int i = 0; i < exp.length(); i++)
        {
            char ch = exp.charAt(i);
            if(ch == '(')
            {
                stack.push(ch);
                continue;
            }
            else if(ch == ')')
            {
                if(stack.peek() == -1)
                {
                    isBalanced = false;
                    break;
                }
                stack.pop();
            }

        }
        if(stack.peek() != -1)
            isBalanced = false;

        return isBalanced;
    }
}
