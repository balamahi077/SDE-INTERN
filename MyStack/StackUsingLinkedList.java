package MyStack;

public class StackUsingLinkedList {

    public static void main(String[] args) {
        
        StackLL stack = new StackLL();

        System.out.println("-----------------------");
        System.out.println("Inilially");
        System.out.println("-----------------------");

        stack.display();

        System.out.println("is stack is Empty : " + stack.isEmpty());
        System.out.println();

        System.out.println("-----------------------");
        System.out.println("push Operation");
        System.out.println("-----------------------");

        stack.push(50);
        stack.push(40);
        stack.push(30);
        stack.push(20);
        stack.push(10);
        System.out.println();

        System.out.println("-----------------------");
        System.out.println("Inside Stack");
        System.out.println("-----------------------");
        System.out.print("Head -->");
        stack.display();
        System.out.print("Null");
        System.out.println();

        System.out.println();
        System.out.println("-----------------------");
        System.out.println("peek Operation");
        System.out.println("-----------------------");

        System.out.println("Top Element : " + stack.peek() );
        System.out.println();

        System.out.println("-----------------------");
        System.out.println("peek by position");
        System.out.println("-----------------------");

        System.out.println("position 1 : " + stack.peek(1));
        System.out.println("position 2 : " + stack.peek(2));
        System.out.println("position 3 : " + stack.peek(3));
        System.out.println("position 4 : " + stack.peek(4));
        System.out.println("position 5 : " + stack.peek(5));
        System.out.println();

        System.out.println("-----------------------");
        System.out.println("pop Operation");
        System.out.println("-----------------------");

        System.out.println("Poped Element : " + stack.pop());
        System.out.println();

        System.out.println("-----------------------");
        System.out.println("Top after pop Operation");
        System.out.println("-----------------------");

        System.out.println("Top element : " + stack.peek());
        System.out.println();

        System.out.println("-----------------------");
        System.out.println("pop reminging Elements");
        System.out.println("-----------------------");

        System.out.println(stack.pop() + " poped");
        System.out.println(stack.pop() + " poped");
        System.out.println(stack.pop() + " poped");
        System.out.println(stack.pop() + " poped");

        stack.display();
        System.out.println();

        System.out.println("is stack is Empty : " + stack.isEmpty());
        System.out.println();

        System.out.println("try poping from stack");
        System.out.println(stack.pop());
    }
    
}
