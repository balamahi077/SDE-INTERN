package PassByValue_PassByRef;

public class PassByValue {

    static void change(int number)  // when this method called recives parameter 
    {
        number = 50;        // initially it is 20 but, it updated the value has 50
    }
    
    public static void main(String[] args) {
        
        int number = 20;    // initialize the number
        change(number);     // here the number is passed the value of variable
        System.out.println(number); // after method executing it prints 20,
                                    // why because Garbage collector terminated method inside stack
    }
}
