package DSAVisualizePatterns;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[] {10, 20, 30, 40, 50, 60, 70};
        

        int result = binarySearch(arr, 50);
        System.out.println("Index of target number : " + result);
        
    }

    public static int binarySearch(int[] arr, int target)
    {
        //Edge case 1 if array is null
        if(arr == null)
            return -1;
        
        //Edge case 2 if array is length 0
        if(arr.length == 0)
            return -1;

        int leftIndex = 0;
        int rightIndex = arr.length-1;

        while( leftIndex <= rightIndex)
        {
            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;
            if(arr[midIndex] == target)
            {
                return midIndex;
            }
            if(arr[midIndex] > target)
            {
                rightIndex = midIndex -1;
            }
            if(arr[midIndex] < target)
            {
                leftIndex = midIndex + 1;
            }
        }
        return -1;
    }
    
}
