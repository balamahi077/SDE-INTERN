package DSAVisualizePatterns;
import java.util.*;
public class ArrayDemo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of Array : ");
        int lengthOfArray = scan.nextInt();
        scan.close();

        MyArray myArray = new MyArray(lengthOfArray);

        System.out.println("Initial Array");
        myArray.printElements();

        System.out.println();
        System.out.println("After inserting Element At End");
        myArray.insertAtEnd(40);
        myArray.insertAtEnd(20);
        
        myArray.printElements();

        System.out.println();
        System.out.println("Afetr inserting 99 and 66 at the Start");
        myArray.inserAtStart(99);
        myArray.inserAtStart(69);
        myArray.printElements();

        System.out.println();
        System.out.println("Inserting at any Position");
        myArray.insertAnyPosition(2, 999);
        myArray.printElements();
        

        
        System.out.println();
        myArray.insertAnyPosition(4, 666);
        myArray.printElements();


        //============== Deletion ==============
        System.out.println();
        System.out.println("Deleting From End");
        myArray.deleteFromEnd();
        myArray.printElements();

        System.out.println();
        System.out.println("Deleting From Start");
        myArray.deleteFromStart();
        myArray.printElements();

        System.out.println();
        System.out.println("Deleting From Any Position");
        myArray.deleteFromAnyPosition(2);
        myArray.printElements();

       
        
        
        
    }
    
}
