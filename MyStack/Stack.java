package MyStack;

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
                // System.out.println("Stack is Full");
            }
            this.top++;
            this.values[this.top] = value;
        }

        public int peek()
        {
            if(this.top == -1)
            {
                // System.out.println("Stack is Empty Index idiot");
                return -1;
            }
            return this.values[this.top];
        }

        public int pop()
        {
            if(this.top == -1)
            {
                System.out.println("Stack is Empty idiot");
                return -1;
            }
            int index = this.top;
            this.top--;
            return this.values[index];
        }
}
