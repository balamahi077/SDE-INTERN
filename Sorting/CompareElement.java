package Sorting;

public class CompareElement {

    public static void main(String[] args) {

         int[] array = new int[]{5, 4, 3, 2, 1};
        // int[] array = new int[]{5, 4, 19, 2, 3};
        // int[] array = new int[]{10};
        // int[] array = null;
        // int[] array = {};
        // int[] array = new int[]{-5, -4, -19, 2, 3};

        compareElementWithOne(array);
        
    }

    public static void compareElementWithOne(int[] arr)
    {

        if(arr == null || arr.length == 0)
            return;

        
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {

                if(arr[i] > arr[j])
                {
                    System.out.println(arr[i] + " > " + arr[j]);
                    
                }
                else if(arr[i] < arr[j])
                {
                    System.out.println(arr[i] + " < " + arr[j]);
                    
                }
                else
                {
                    System.out.println(arr[i] + " == " + arr[j]);
                }
            }
            System.out.println();
        }
    }
    
}
