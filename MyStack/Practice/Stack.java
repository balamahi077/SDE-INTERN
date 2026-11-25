package MyStack.Practice;

public class Stack {
    
    private int top = -1;
    private int size = 0;
    private int values[];

    public Stack(int sizeOfStack)
    {
        this.values = new int[sizeOfStack];
        this.size = sizeOfStack;
    }

    public void push(int value)
    {
        if(this.top == this.size-1)
        {
            System.out.println("Stack is Full");
            return;
        }
        this.top++;
        this.values[top] = value;
    }

    public int peek()
    {
        if(this.top == -1)
        {
            return -1;
        }
        return this.values[this.top];
    }

    public int pop()
    {
        if(this.top == -1)
        {
            System.out.println("Stack is Empty");
            return -1;
        }

        int index = this.top;
        this.top--;
        return this.values[index];
    }

    boolean isEmpty()
    {
        return top == -1;
    }

    boolean isFull()
    {
        return top == size -1;
    }

    void display()
    {
        for(int i = top; i > -1; i--)
        {
            System.out.println(values[i]);
        }
    }

    void displayChar()
    {
        for(int i = top; i > -1; i--)
        {
            System.out.println((char)values[i]);
        }
    }

}
