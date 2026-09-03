package Practice;

public class Temperature {
    public static void main(String[] args) {

        System.out.println("Temperature Conversion");
        
        float temperature = 100f;

        float fahrenheit = (temperature * 9 / 5) + 32;
        System.out.println("Celsius : " + temperature + "°C");
        System.out.println("Fahrenheit : " + fahrenheit + "°F");

        System.out.println("------------------------------");

        float celsius = (temperature - 32) * 5 / 9;
        System.out.println("Fahrenheit : " + temperature + "°F");
        System.out.println("Celsius : " + celsius + "°C");

    }
}
