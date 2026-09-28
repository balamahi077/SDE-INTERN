package DSAVisualizePatterns;

public class Singly_LinkedList {
    
    public static void main(String[] args) {
        

        insertAtTheBegging(500);
    }

    public static void insertAtTheBegging(int newData) 
    {  
        Node node = new Node();
        node.data = 101;
        node.next = null;

        Node secondNode = new Node();
        secondNode.data = 102;
        secondNode.next = null;

        node.next = secondNode; //here firstNode pointing to the secondNode

        Node thirdNode = new Node();
        thirdNode.data = 103;
        thirdNode.next = null;

        secondNode.next = thirdNode; //here secondNode pointing to the thirdNode

        Node newNode = new Node();
        newNode.data = newData;

        Node head = node;
        newNode.next = head;
        head = newNode;

        printNodes(head);


    }

    public static void printNodes(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println( " Null");
    }
}
