package Chellenges;

public class Errors {

    public static void main(String[] args) {

        // 1. Syntax Error
        int x = ;                       // Invalid syntax

        // 2. Semantic / Logical Error
        int a = 10;
        int b = 20;
        System.out.println(a - b);      // Wrong logic if addition was intended

        // 3. Type Mismatch
        int age = "20";                 // String assigned to int

        // 4. Wrong Method
        System.out.prntln("Hello");     // println() misspelled

        // 5. Return Type Mismatch
        static int getNumber() {
            return "Hello";             // String returned instead of int
        }

        // 6. Duplicate Variable
        int num = 10;
        int num = 20;                   // Variable declared twice

        // 7. Curly Brace Missing
        public static void main(String[] args) {
            System.out.println("Hello");
        // }                            // Missing closing brace
        
        // 8. Case Sensitive Error
        System.Out.println("Hello");    // 'Out' should be 'out'
        
        // 9. print Error
        print("Hello");                 // Java does not have a standalone print()
        
    }
        
        
}
