package Array_Concept;

public class ReplaceNagativeWithZwro {
    
    public static void main(String[] args)
    {
        //int[] arr = new int[]{5, -3, 8, -1, 0};
        //int[] arr = new int[]{-5, -3, -8, -1, -0};
        //int[] arr = null;
        //int[] arr = new int[]{5, 3, 8, 1, 0};
        int[] arr = new int[]{5};

        int[] getResult = replaceNagativeWithZero(arr);

        for(int value : getResult)
        {
            System.out.print(value + " ");
        }

    }

    public static int[] replaceNagativeWithZero(int[] arr)
    {

        if(arr == null || arr.length == 0)
            return new int[]{-1};

        int i = 0;
        while(i < arr.length)
        {
            if(arr[i] < 0)
                arr[i] = 0;

            i++;
        }

        return arr;
    }
}
