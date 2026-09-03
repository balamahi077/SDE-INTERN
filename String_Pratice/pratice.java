package String_Pratice;

public class pratice {
    public static void main(String[] args) {
        
        System.out.println("Scenario 1: Both String Literals");
        String str1 = "Java";
        String str2 = "Java";

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        System.out.println("Scenario 2: Both using new Keyword");
        String str3 = new String("Java");
        String str4 = new String( "Java");

        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

        System.out.println("Scenario 3: one new keyword and String");
        String str5 = new String("Java");
        String str6 = "Java";

        System.out.println(str5 == str6);
        System.out.println(str5.equals(str6));

       
       }
    }

