package Queue_Concept;

public class MyQueue {
    private int[] values;
    private int first = 0;
    private int last = 0;
    private int size = 0;
    private int count = 0;

    public MyQueue(int size)
    {
        this.size = size;
        this.values = new int[size];
    }

    public int enqueue(int value)
    {
        // T1 queue is full
        if(this.count == this.size)
            return -1;

        // T2 queue full but we have space at the start
        // last is reached end, but count is less then the size
        if(this.last == this.size && this.first > 0)
        {
            // loop for count times
            for(int loop = 1; loop <= this.count; loop++)
            {
                //Source index this.first copy it to 0
                this.values[loop-1] = this.values[this.first];

            }
            this.first = 0;
        }

        this.values[this.last] = value;
        this.last++;
        this.count++;
    }

    public int dequeue(int value)
    {
        int index = this.first;
        this.first++;
        this.count--;
        return this.values[index];
    }

    public boolean isEmpty()
    {
        // boolean isEmptyStatus = false;
        // if(first == last && first = 0)
        //     isEmptyStatus = true;

        // if(first > last)
        //     isEmptyStatus = true;

        // return false;

        return (this.count == 0);
    }

    public int getCount()
    {
        return this.count;
    }
}
