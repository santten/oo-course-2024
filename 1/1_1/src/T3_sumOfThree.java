import java.util.Scanner;

public class T3_sumOfThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        int sum = (first + second + third);
        int product = (first * second * third);
        // average isn't generally calculated correctly unless it is declared as a float
        // because an integer variable can't store a result that isn't an equal number
        float avg = (float) (first + second + third) / 3;

        String result = String.format("Sum: %s || Product: %s || Average: %s", sum, product, avg);
        System.out.println(result);
    }
}