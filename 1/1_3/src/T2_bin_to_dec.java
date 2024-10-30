import java.util.Scanner;

public class T2_bin_to_dec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Binary to Decimal Converter || Enter Binary");
        String binaryStr = scanner.nextLine();
        // System.out.println(binaryStr.length());

        double dec = 0;

        for (int i = binaryStr.length() - 1; i >= 0; i--) {
            double ind = binaryStr.length() - i - 1;
            double character = Character.getNumericValue(binaryStr.charAt(i));
            dec += character * Math.pow(2, ind);
            // System.out.printf("i %s: char %s at ind %s || decimal up to this: %s %n", character, i, ind, dec);
        }

        System.out.printf("%s in binary is %s in decimal", binaryStr, dec);
    }
}
