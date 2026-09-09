package Methods;

public class InstanceMethod {

    void display() {                            // it is non-static method if you want to access this method
        System.out.println("Hello World");    // must and should be create object
    }
    
    public static void main(String[] args) {

        InstanceMethod im = new InstanceMethod();  // here object is created 
        im.display();                               // using object reference i am accessing method

    }
}
