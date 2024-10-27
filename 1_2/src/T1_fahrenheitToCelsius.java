import java.util.Scanner;

public class T1_fahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a temperature in Fahrenheit:");
        double temp = Double.parseDouble(scanner.nextLine());
        double celsius = (temp - 32) / 1.8;

        String result = String.format("%.2f Fahrenheit is %.2f Celsius", temp, celsius);
        System.out.println(result);
    }
}
