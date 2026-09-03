package Practice;

public class Circle {
    public static void main(String[] args) {

        float radius = 9.80f;

        float Area = (float) (Math.PI * radius * radius);
        float Circumference = (float) (2 * Math.PI * radius);

        System.out.println("Area of circle is: " + Area);
        System.out.println("Circumference of circle is: " + Circumference);
    }
}
