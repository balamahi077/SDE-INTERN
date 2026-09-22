package loops;

public class ForEach {

    static void printArray(int[] arr)
    {
        int k = 0;
        for(int ar : arr)
        {
            System.out.print(ar);         
            if(k == arr.length-1)
                break;
                System.out.print(",");
            k++; 
        }
    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for(int maxValue : arr)
        {
            if (maxValue > max)
            {
                max = maxValue;
            } 
        }
        return max;
    }

    public static boolean searchNumber(int[] arr , int targetValue)
    {
      for(int num : arr) {
        if(num == targetValue) {
            return true;
        }
      }
      return false;
    }

    public static void main(String[] args) 
    {

        printArray(new int[]{40,25,45,15,24});  // Anonumous Array

        int maxValue = findMax(new int[]{40,25,45,15,24});
        System.out.println();
        System.out.println("Max value of an Array : " + maxValue);

        boolean searchResult = searchNumber(new int[]{40,25,45,15,24} , 25);
        System.out.println("Target Value found : " + searchResult);
    }
    
}
