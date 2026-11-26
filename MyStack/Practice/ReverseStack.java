package MyStack.Practice;
import java.util.*;

public class ReverseStack {
    
    public static void main(String[] args)
    {
        reverseStack();


    }

    public static void reverseStack()
    {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size : ");
        
        int size = scan.nextInt();
        Stack stack = new Stack(size);

        
        for(int count = 0; count < size; count++)
        {
            System.out.println("Enter the value of Index " + count + " : ");
            int value = scan.nextInt();
            stack.push(value);
        }
        scan.close();
        System.out.println("Reversed Stack :");
        for(int i = size-1; i > -1; i--)
        {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
