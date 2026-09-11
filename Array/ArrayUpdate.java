package Array;

public class ArrayUpdate {

    static int[] update() {
        int a[] = {20, 40, 60};
        return a;
    }
    
    public static void main(String[] args) {
        
        int b[] = update();

        System.out.println("Before Modification");
        System.out.println(b[0] + " " + b[1] + " " + b[2]);

        b[0] = 500;

        System.out.println("After Modification");
        System.out.println(b[0] + " " + b[1] + " " + b[2]);
    }
}
