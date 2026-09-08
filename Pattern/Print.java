package Pattern;

public class Print {
    public static void main(String[] args) {
        
        /*
                1 
                1 2 
                1 2 3 
                1 2 3 4 
                1 2 3 4 5 
        
        */

        for(int i =1; i<=5; i++) 
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------");
        /*
                *     
                * *    
                * * *   
                * * * *  
                * * * * * 
        
        */


        for(int i =1; i<=5; i++) 
        {
            for(int j=1; j<=5; j++)
            {
                if(j<=i)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("---------------------------------------------------");


        for(int i=5; i>=1; i--)
        {
            for(int j=1; j<= 5; j++) 
            {
                if(j>=i)
                    {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }     
            }
            System.out.println();
        }






        System.out.println("----------------------------------------------------");

        /*
                1 
                2 3 
                4 5 6 
                7 8 9 10 
                11 12 13 14 15
        */

        int count = 1;
        for(int i =1; i<=5; i++) 
        {
        for(int j=1; j<=i; j++)
            {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }


        System.out.println("----------------------------------------------------");
        /*
                1 2 3 4 5 
                1 2 3 4 
                1 2 3 
                1 2 
                1 
        */

        for(int i=1; i<=5; i++) {
            for(int j=1; j<= 5-i+1; j++){
                System.out.print(j + " ");

            }
            System.out.println();
        }


        System.out.println("----------------------------------------------------");

        /*
                *****
                 ****
                  ***
                   **
                    *
        */
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++) 
                {
                    if(j>=i)
                    {
                        System.out.print("*");
                    }
                    else 
                    {
                        System.out.print(" ");
                    }
            }
            System.out.println();
        }


        System.out.println("----------------------------------------------------");

        /*
        * * * * * 
         * * * * 
          * * * 
           * * 
            * 
        
        */
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++) 
                {
                    if(j>=i)
                    {
                        System.out.print("* ");
                    }
                    else 
                    {
                        System.out.print(" ");
                    }
            }
            System.out.println();
        }


            
    }
}
