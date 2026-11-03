package TwoD_Array;

public class Pratice {
    
    public static void main(String[] args) {

        int[][] nums ={
            {3,5,9},
            {7,6,2},
            {4,8,1}
        };

        int getResult = getSumOfElements(nums);
        System.out.println(getResult);
        System.out.println();

        int getMaxElement = getMaxElement(nums);
        System.out.println(getMaxElement);
        System.out.println();

        int getMinElement = getMinElement(nums);
        System.out.println(getMinElement);
        System.out.println();

        int[] getEvenOdd = countEvenOdd(nums);
        for(int num : getEvenOdd)
        {
            System.out.println(num);
        }
        System.out.println();

        boolean isKeyPresent = isElementPresent(nums, 8);
        System.out.print("Is key Present :");
        System.out.println(isKeyPresent);
        System.out.println();

        scalarMultiplication(nums, 2);
        System.out.println("Printing Scalar Multiplication : ");
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[i].length; j++)
            {
                System.out.print(nums[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        
    }

    public static int getSumOfElements(int[][] nums)
    {

        if(nums == null)
            return -1;

        int sumOfElements = 0;
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[i].length; j++)
            {
                sumOfElements += nums[i][j];
            }
        }
        System.out.print("Sum of Every Elements : ");
        return sumOfElements;
    }

    public static int getMaxElement(int[][] nums)
    {
        int maxElement = nums[0][0];

        for(int i =0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[i].length; j++)
            {
                if(nums[i][j] > maxElement)
                {
                    maxElement = nums[i][j];
                }
            }
        }
        System.out.print("Max Element : ");
        return maxElement;
    }

    public static int getMinElement(int[][] nums)
    {

        int minElement = nums[0][0];
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[i].length; j++)
            {
                if(nums[i][j] < minElement)
                {
                    minElement = nums[i][j];
                }
            }
        }
        System.out.print("Min Element : ");
        return minElement;
    }

    public static int[] countEvenOdd(int[][] nums)
    {

        if(nums == null || nums.length == 0)
            return new int[]{0,0};
        int countEven = 0;
        int countOdd = 0;
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[i].length; j++)
            {
                if(nums[i][j] % 2 == 0)
                {
                    countEven++;
                }
                else
                {
                    countOdd++;
                }
            }
        }
        System.out.println("Counting Even and Odd : ");
        return new int[]{countEven,countOdd};
    }


    public static boolean isElementPresent(int[][] nums, int key)
    {
        boolean found = false;
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[i].length; j++)
            {
                if(nums[i][j] == key)
                {
                    found = true;
                    break;
                }
            }
            if(found)
                break;
        }
        return found;
    }

    public static void scalarMultiplication(int[][] nums, int multiplyNumber)
    {

        if(nums == null || nums.length == 0)
            return;

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[i].length; j++)
            {
                int multipledNumber = nums[i][j] * multiplyNumber;
                nums[i][j] = multipledNumber;
            }
        }
    }


}

