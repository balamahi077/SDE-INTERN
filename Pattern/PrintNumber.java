package Pattern;

public class PrintNumber {
    public static void main(String[] args) {
    
        
        int count = 1;
        for(int index=1; index <= 5; index++)
        {
            for(int i=1; i<=5; i++) {


                // if(count < 10){              // to add 0 in 1 to 9 use this or
                //     System.out.print("0");
                // }

                System.out.format("%02d ", +count);   //this

                // System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
