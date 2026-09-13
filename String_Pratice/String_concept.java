package String_Pratice;

public class String_concept {
    
    public static void main(String[] args) {
        
        String name = "Bala";
        String str = new String("bala");

        System.out.println("Before Modification : " + name);
        System.out.println("Before Modification : " + str);

        update(name);
        update1(str);

        System.out.println("After Modification : " + name);
        System.out.println("After Modification : " + str);

    }

    static void update(String name)
    {
        name = "Krishna";
    }

    static void update1(String name)
    {
        name = "Krishna";
    }
}
