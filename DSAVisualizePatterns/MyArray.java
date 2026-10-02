package DSAVisualizePatterns;


public class MyArray {

    int[] array;
    int length;
    int rightIndex;

    MyArray(int lengthOfArray)
    {
        length = lengthOfArray;
        rightIndex = 0;
        array = new int[length];
    }


    public void insertAtEnd(int value)
    {
        if(rightIndex == length)
        {
            System.out.println("Array is Full");
            return;
        }
        array[rightIndex] = value;
        rightIndex++;
    }

    public void inserAtStart(int value)
    {
        if(rightIndex == length)
        {
            System.out.println("Array is Full");
            return;
        }
        else{
            for(int i = rightIndex-1; i >= 0; i--)
            {
                array[i+1] = array[i];
            }
        }
        array[0] = value;
        rightIndex++;

    }


    public void insertAnyPosition(int position , int value)
    {
        if(rightIndex == length)
        {
            System.out.println("Array is Full");
            return;
        }
        if(position < 0 || position > rightIndex)
        {
            System.out.println("Invalid Position");
            return;
        }

        //shift and insert
        for(int i = rightIndex-1; i >= position; i--)
        {
            array[i+1] = array[i];
        }
        array[position] = value;
        rightIndex++;

    }

    public void printElements()
    {
        System.out.println("index\tvalue");

        for(int i = 0; i < length; i++)
        {
            System.out.println(i + "\t"+ array[i]);
        }

        System.out.println( "size " + rightIndex);
        
    }


    public void deleteFromEnd()
    {
        if(rightIndex == 0)
        {
            System.out.println("Array is Empty");
            return;
        }
        else 
        {
            array[rightIndex -1] = 0;
            rightIndex--;
        }
    }

    public void deleteFromStart()
    {
        if(rightIndex == 0)
        {
            System.out.println("Array is Empty");
            return;
        }
        else 
        {
            //shift elements from index = 0(from start)
            for(int index = 0; index < rightIndex; index++)
            {
                array[index] = array[index + 1];
            }
            rightIndex--;
            array[rightIndex] = 0;
        }
            
    }

    public void deleteFromAnyPosition(int position)
    {
        if(rightIndex == 0)
        {
            System.out.println("Array is Empty");
            return;
        }

        if(position < 0 || position >= rightIndex)
        {
            System.out.println("Invalid Position");
            return;
        }

        //shift
        for(int index = position; index < rightIndex; index++)
        {
            array[index] = array[index + 1];
        }
        rightIndex--;
        array[rightIndex] = 0;
    }
    
}
