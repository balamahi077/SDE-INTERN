package Methods;

public class InstanceMethod {

    void display() {
        System.out.println("Hello World");
    }
    
    public static void main(String[] args) {
        
        InstanceMethod im = new InstanceMethod();
        im.display();

    }
}
