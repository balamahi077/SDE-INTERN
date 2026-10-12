package Array_Concept;

public class DoubleOddHalvedEven {
    public static void main(String[] args)
    {
        //int[] arr = {4, 7, 10, 3};
        int[] arr = {-2, -4, -7, -3};
        //int[] arr = null;

        int[] getResult = getDoubleOddHavledEven(arr);

        for(int value : getResult)
        {
            System.out.print(value + " ");
        }

    }

    public static int[] getDoubleOddHavledEven(int[] arr)
    {
        if(arr == null || arr.length == 0)
            return new int[]{-1};

        int[] newArray = new int[arr.length];

        int j = 0;
        for(int i = 0; i < arr.length; i++)
        {

            if(arr[i] % 2 == 0)
            {
                newArray[j] = arr[i] / 2;
                j++;
            }
            if(arr[i] % 2 != 0)
            {
                newArray[j] = arr[i] + arr[i];
                j++;
            }
        }
        return newArray;
    }
}
