package DSAVisualizePatterns;

public class LeftToRight {

    static void printLeftToRight(int[] arr)
    {
        System.out.println("Printing Left to Right : ");
        for(int index = 0; index <= arr.length-1; index++)
        {
            System.out.print(arr[index]);
            if(index < arr.length-1)
            {
                System.out.print(" -> ");
            }
        }
    }

    static void printRightToLeft(int[] arr)
    {
        System.out.println();
        System.out.println();
        System.out.println("Printing Right to Left : ");
        for(int index = arr.length-1; index >= 0; index--)
        {
            System.out.print(arr[index]);

            if( index > 0)
            {
                System.out.print(" -> ");
            }
        }
    }

    static void printRightToLeftBothSides(int[] arr)
    {
        System.out.println();
        System.out.println();
        System.out.println("Printing Both sides : ");
        int left = 0;
        int right = arr.length-1;

        while(left <= right)
        {
            System.out.print(arr[left] + " -> ");
            System.out.print(arr[right] + " -> ");
            left++;
            right--;
        }
    }

    static void printMidFromBothSides(int[] arr)
    {
        System.out.println();

        int midToLeft = arr.length / 2;
        int midToRight = arr.length / 2;

        if(arr.length % 2 != 0)
        {
            midToLeft = arr.length / 2;
            midToRight = midToLeft;
        }
        else
        {
            midToLeft = arr.length / 2 -1;
            midToRight = arr.length / 2 ;
        }

        while( midToLeft >= 0 && midToRight <= arr.length-1)
        {
            if(arr[midToLeft] == arr[midToRight])
            {
                System.out.print(arr[midToRight] + " ");
            }
            else {
                System.out.print(arr[midToLeft] + " " + arr[midToRight] + " ");
            }

            midToLeft--;
            midToRight++;
        }   
        
    }
    

    public static void main(String[] args) {

        int[] Number = {1, 2, 3, 4, 5, 6, 7, 8};

        printLeftToRight(Number);
        printRightToLeft(Number);
        printRightToLeftBothSides(Number);

        printMidFromBothSides(Number);
        
        
    }
}
