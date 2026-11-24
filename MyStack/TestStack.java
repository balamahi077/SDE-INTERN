package MyStack;

public class TestStack {

    public static void main(String[] args) {
        
        Stack MyStack = new Stack(5);
    
        MyStack.push(6);
        MyStack.push(7);
        MyStack.push(8);
        MyStack.push(9);
        MyStack.push(10);

        MyStack.peek();

        MyStack.display();

        MyStack.isEmpty();

        MyStack.isFull();

        MyStack.pop();
    }
    
    
}
