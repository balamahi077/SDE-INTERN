package Array_Concept;

public class ReduceSteps {
    
    public static void main(String[] args) {

        int getResult = countSteps(14);
        System.out.println(getResult);
        
    }

    public static int countSteps(int num)
    {
        int count = 0;

        while(num != 0)
        {
            if(num % 2 == 0)
            {
                num = num / 2;
                count++;
            }
            else
            {
                num = num -1;
                count++;
            }
        }

        return count;
    }
}
