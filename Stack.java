public class Stack 
{
    static void A() 
    {
        B();
    }
    static void B()
    {
        C();
    }
    static void C()
    {
        System.out.println("Hello");
    }
    public static void main(String[]srgs) 
    {
        A();
        System.out.println("Completed");
    }
}
