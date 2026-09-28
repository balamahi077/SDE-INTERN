package Practice;

public class GoogleMeet {


    int number2;
    static int number = 20;

    static int addTwoNumber(int num1 , int num2)
    {
        int sum = num1 + num2;
        return sum;
        
    }

    void callingMethod()
    {
        System.out.println("Hello");

        int number;
    }

    public static void main(String[] args) 
    {

        System.out.println(addTwoNumber(20, 30));

        GoogleMeet gm = new GoogleMeet();
        gm.callingMethod();
        

        System.out.println("Hello !!");

        /*

        1. Code Segment                 ----> Stores Byte Code 
        2. Static segment / Meta Space  ---> Holes Class members
        3. Stack Segment                ---> contains Local variables and Method calls
        4. Heap Segment                 ---> store objects and instance variables
        
        */
    }
    
}
