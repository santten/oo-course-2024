import java.util.Scanner;

public class T3_measures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a weight in grams:");
        double grams = Double.parseDouble(scanner.nextLine());

        double leivis = Math.floor(grams / 13.28 / 32 / 20);
        double naula = Math.floor(grams / 13.28 / 32) - (leivis * 20);
        double luoti = (grams / 13.28) - (leivis * 32 * 20) - (naula * 32);

        String result = String.format("%f g is equal to %.0f leiviskä, %.0f naula and %.2f luoti", grams, leivis, naula, luoti);
        System.out.println(result);
    }
}
