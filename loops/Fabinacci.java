package loops;

public class Fabinacci {
    public static void main(String[] args) {
        
        int num = 8;  // this input that will go till that indices
        int a=0, b=1, c;
        for(int i=0; i<=num; i++) 
        {
            c = a + b;
            System.out.println(c +" "); 
            b = a;
            a = c;
        }
    }
}
