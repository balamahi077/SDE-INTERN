
package Recursion_Concept;

public class CountFunctionCallls
{
    public static void main(String[] args) {

        CountFunctionCallls c = new CountFunctionCallls();

        int getResult = c.fun(4);

        System.out.println(getResult);
        
    }

    int fun(int num)
    {
        int countFunctionCalls = 1;

        if( num == 0)
        {
            return countFunctionCalls;
        }
        countFunctionCalls = countFunctionCalls + fun(num - 1);

        return countFunctionCalls;
    }
}