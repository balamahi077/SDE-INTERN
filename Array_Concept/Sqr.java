package Array_Concept;

public class Sqr {
    
    public static void main(String[] args) {

        int getResult = mySqrt(4);
        System.out.print(getResult);
        
    }

    public  static int mySqrt(int x) {

        long n = 1,sum;
        sum = n * n;

        if(x != 1)
        {
            while(x >= sum)
            {
                n++;
                sum = n * n;
            }
            
        }
        else
        {
            return (int)n;
        }
        return (int)(n-1);
    }
}
