package MyStack;

class Node{

    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        next = null;
    }
}

public class StackLL
{
    Node top;
    StackLL()
    {
        top = null; // no node is crested
    }

    //push()
    public void push(int value)
    {
        Node newNode = new Node(value); // created a node that should inserted
        
        newNode.next = top; // its holding heads address

        top = newNode; // head is now pointing to new node

        System.out.println(value + " pushed");
    }

    //pop()
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return -1;
        }

        int value = top.data;// store value before deleteing so that v dont lose it

        top = top.next; // this deletes first value

        return value; // temporily v had stored value in variable which was deleteing
    }

    // peek()
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return -1;
        }

        return top.data; // 30 is here because 40 was deleted

    }

    //peek(index) at position
    // position starts with 1 
    public int peek(int position)
    {
        if(position <= 0)
        {
            System.out.println("Invalid Position");
            return -1;
        }

        Node temp = top;

        int count = 1; // count will remember the position of temp

        while(temp != null && count < position)
        {
            temp = temp.next;
            count++;
        }

        if(temp == null)
        {
            System.out.println("Position does not exist");
            return -1;
        }

        return temp.data;
    }

    // isEmpty
    public boolean isEmpty()
    {
        return top == null;
    }

    //display()
    public void display()
    {
        if(isEmpty())
        {
            return;
        }

        Node temp = top;

        while(temp != null)
        {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }

    }

}
