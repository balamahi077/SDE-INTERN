package Regex;

public class RegMetaChars {
    
    public static void main(String[] args) {
        
        demoMetachar();
        demoOneWordMatch();
        demoSpaces();
        demoNonDigitMatch();
        demoNonWordMatch();
        demoNonSpaceMatch();

        System.out.println("-----------------");

        demoQuantifiers();
        
    }

    public static void demoMetachar()
    {
        String a = "8";

        System.out.println(a.matches("\\d"));//true
        System.out.println("A".matches("\\d")); //false
        System.out.println();
    }

    public static void demoOneWordMatch()
    {
        System.out.println("A".matches("\\w")); //true
        System.out.println("9".matches("\\w")); //true
        System.out.println("@".matches("\\w")); //false
        System.out.println("_".matches("\\w")); //true
        System.out.println();
    }

    public static void demoSpaces()
    {
        System.out.println(" ".matches("\\s")); //true
        System.out.println("A B".matches("\\s")); //false
        System.out.println();
    }

    public static void demoNonDigitMatch()
    {
        System.out.println("A".matches("\\D")); //true
        System.out.println("@".matches("\\D")); //true
        System.out.println();
    }

    public static void demoNonWordMatch()
    {
        System.out.println("@".matches("\\W")); //true
        System.out.println("A".matches("\\W")); //false
        System.out.println("SD".matches("\\W")); // false
        System.out.println();
    }

    public static void demoNonSpaceMatch()
    {
        System.out.println("A".matches("\\S")); //true
        System.out.println("  ".matches("\\S")); //false
        System.out.println("A".matches("\\S")); //
        System.out.println();
    }


    public static void demoQuantifiers()
    {

        //1) + --> 0 or more
        String s1 = "abc";
        String s2 = "a";
        String s3 = "aabbcccc";
        String s4 = "aabbccccd";
        System.out.println(s1.matches("[abc]+"));
        System.out.println(s2.matches("[abc]+"));
        System.out.println(s3.matches("[abc]+"));
        System.out.println(s4.matches("[abc]+"));

    }
}
