package LinkedList_Concept;

public class JoinSingleNode {
    
    public static void main(String[] args) {

        Node list1Head = null;
        list1Head = addNewNode(list1Head, 50);
        list1Head = addNewNode(list1Head, 15);
        list1Head = addNewNode(list1Head, 65);
        list1Head = addNewNode(list1Head, 45);
        list1Head = addNewNode(list1Head, 90);

        printList(list1Head);


        Node list2Head = null;

        
    }


    public static void printList(Node head)
    {
        Node temp = head;
        System.out.print("head -> ");
        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");

    }
    public static Node getLastNode(Node head)
    {
        while(head.next != null)
        {
            head = head.next;
        }
        return head;
    }

    public static Node addNewNode(Node head, int value)
    {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;

        
        if(head != null)
        {
            newNode.next = head;
            return newNode;
        }   

        return newNode;
    }
    void getjoinSingleNode(Node listFirstHead, Node listSecondHead)
    {

    }

}
