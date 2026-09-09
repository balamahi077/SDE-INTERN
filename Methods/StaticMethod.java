package Methods;

public class StaticMethod {

    static void display()
    {
        System.out.println("Hello Balakrishna");
    }
    
    public static void main (String[] args) 
    {
        display();
        Demo.display();
    }
}


class Demo {
    static void display()
    {
        System.out.println("Hi Balakrishna");
    }
}
