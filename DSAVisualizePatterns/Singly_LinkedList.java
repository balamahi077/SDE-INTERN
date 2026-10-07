package DSAVisualizePatterns;

public class Singly_LinkedList {
    
    public static void main(String[] args) {

        //testInsertNodeOperations();

        testDeleteNodeOperations();
        
    }


    public static void testInsertNodeOperations(){

        Node head = null;
        printList(head);
        System.out.println();

        //Function Invocation
        head = insertAtStart(401, head);
        printList(head);

        System.out.println();
        System.out.println();
        System.out.println("Inserted At the Start");


        head = insertAtStart(402, head);
        head = insertAtStart(403, head);
        head = insertAtStart(404, head);
        head = insertAtStart(405, head);
        head = insertAtStart(406, head);
        head = insertAtStart(407, head);


        printList(head);

        
        insertAtEnd(501, head);
        System.out.println();
        System.out.println();
        System.out.println("Inserted at the end");
        printList(head);

        

        // Node head = null;
        // head = addToList(401, head);
        // head = addToList(402, head);
        // head = addToList(403, head);
        // head = addToList(404, head);
        // printList(head);

        int lengthOfList = 0;
        lengthOfList = countListOfElements(head);
        findingMiddleElement(lengthOfList, head);

        System.out.println();
        System.out.println();
        System.out.println("Inserted At the Middle");
        printList(head);

        System.out.println();
        System.out.println();
        System.out.println("Inserting After the Key");
        insertAfterKey(666, 10, head);
        printList(head);

    }
    public static Node insertAtStart(int value, Node currentHead)
    {
        Node newNode = new Node(); // Creation of new node and set the values
        newNode.data = value;
        newNode.next = null;

        // //Test case 1 - head is null or list is empty
        // if(currentHead == null)
        // {
        //     return newNode;
        // }
        // else
        // {  //Test case 2 - list is not empty or there are one or more nodes
        //     newNode.next = currentHead;
        //     return newNode;
        // }

        if(currentHead != null)
            newNode.next = currentHead;

        return newNode;
        
    }

    public static Node insertAtEnd (int value, Node currentHead)
    {

        Node lastNode = new Node(); // Creation of new Node and set the values
        lastNode.data = value;
        lastNode.next = null;

        Node currentLastNode = currentHead;
        while(currentLastNode.next != null) 
        {
            currentLastNode = currentLastNode.next;    
        }
        currentLastNode.next = lastNode;

        return currentLastNode;
    }


    public static Node addToList(int value, Node head)
    {

        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;

        if(head == null)
        {
            head = newNode;
        }
        return newNode;
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


    public static int countListOfElements(Node head)
    {
        int count = 1;
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static Node findingMiddleElement(int length, Node head)
    {
        int middleElement = length / 2;
        int count = 1;
        Node temp = head;

        while(temp.next != null)
        {
            if(middleElement == count)
            {
                insertAtMiddle(999, temp);
            }
            else
            {
                temp = temp.next;
            }       
            count++;
        }
        return temp;
    }

    public static void insertAtMiddle(int value, Node head)
    {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = head.next;
        head.next = newNode;
    }



    public static void insertAfterKey(int value, int dataElement, Node head)
    {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;

        if(head == null)
        {
            return;
        }

        Node keyNode = head;
        while(keyNode != null && keyNode.data != dataElement)
        {
            keyNode = keyNode.next;
        }

        if(keyNode == null)
        {
            return; //because if keyNode is pointing to null means Key Not Found
        }
        newNode.next = keyNode.next;
        keyNode.next = newNode;
    }


    public static void testDeleteNodeOperations()
    {
        Node head = null;

        deleteAtStart(head);

        System.out.println();
        System.out.println("----- Delete At Start -----");
        head = insertAtStart(89, head);
        head = insertAtStart(91, head);
        printList(head);
        head = deleteAtStart(head);
        System.out.println();
        printList(head);

        System.out.println();
        System.out.println("----- Delete At End ------");
        head = insertAtStart(89, head);
        head = insertAtStart(91, head);
        printList(head);
        head = deleteAtEnd(head);
        System.out.println();
        printList(head);

        System.out.println();
        System.out.println("------ Delete At Any Position ------");
        head = insertAtStart(99, head);
        printList(head);
        System.out.println();
        head = deleteAtAnyPosition(91, head);
        printList(head);


    }

    //----------- deletion ------------
    public static Node  deleteAtStart(Node head)
    {
        if(head == null)
        {
            System.out.println("List is Empty");
            return null;
        }
        
        return head.next;
    }

    public static Node deleteAtEnd(Node head)
    {
        Node lastButNode = head;
        if(head == null || head.next == null)
        {
            System.out.println("List is Empty");
            return null;
        }

        while(lastButNode.next.next != null)
        {
            lastButNode = lastButNode.next;
        }
        lastButNode.next = null;

        return head;
    }

    public static Node deleteAtAnyPosition(int key , Node head)
    {
        if(head == null) // if the list is empty it return null
        {
            System.out.println("List is Empty");
            return null;
        }
        
        // First Node value is key, works for single node and multiple node
        if(head.data == key) // if only one is there that matching with key, return
            return head.next;
        else if(head.next == null)
            return head;

        Node keyNode = head.next;
        Node preNode = head;

        while(keyNode != null)
        {
            if(keyNode.data == key)
                break;
            preNode = keyNode;
            keyNode = keyNode.next;
        }
        if(keyNode!= null && keyNode.data == key)
        {
            preNode.next = keyNode.next;
        }
        return head;
    }

}
