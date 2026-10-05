package DSAVisualizePatterns;

public class LinearSearch {
    public static void main(String[] args) {
        
        int[] array = {10,20,30,40,50};
        int key = 50;

        linearSearch(array, key);
    }

    public static void linearSearch(int[] array, int key)
    {
        boolean found = false;
        for(int i=0; i < array.length; i++)
        {
            if(array[i] == key)
            {
                System.out.println("Element Found At index " + i);
                found = true;
                return;
            }
        }
        if(found == false)
        {
            System.out.println("Element Not Found");
        }
        
    }
    
}
