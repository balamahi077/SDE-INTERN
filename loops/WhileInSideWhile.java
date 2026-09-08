package loops;

public class WhileInSideWhile {
    public static void main(String[] args) {
        
        int index = 1;
        while(index<=4) 
        {
            int star = 1;
            while(star <= 4)
            {
                System.out.print("* ");
                star++;
            }
            System.out.println();
            index++;
        }
    }
}
