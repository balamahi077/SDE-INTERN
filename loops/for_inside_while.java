package loops;

public class for_inside_while {
    public static void main(String[] args)
    {
        int index = 1;
        while(index <= 3)
        {

            for(int i=1; i<=3; i++)
            {
                System.out.print("* ");
            }
            index++;
            System.out.println();
        }
    }
}
