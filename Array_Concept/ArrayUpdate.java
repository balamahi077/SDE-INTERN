package Array_Concept;

public class ArrayUpdate {

    static int[] update() {
        int a[] = {20, 40, 60};
        return a;
    }

    /*
    
      Primitive datatypes are fixed size values, copying them is inexpensive
      Objects(Arrays, Strings, custom Objects) can very from a few bytes to
      gigabytes, so java copies only their reference, not object themselves.

    */
    
    public static void main(String[] args) {
        
        int b[] = update();

        System.out.println("Before Modification");
        System.out.println(b[0] + " " + b[1] + " " + b[2]);

        b[0] = 500;

        System.out.println("After Modification");
        System.out.println(b[0] + " " + b[1] + " " + b[2]);
    }
}
