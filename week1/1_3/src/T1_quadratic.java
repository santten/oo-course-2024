import java.util.Scanner;

public class T1_quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quadratic Equation Solver || ax^2 + bx + c = 0");
        System.out.println("Enter value a:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter value b:");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter value c:");
        double c = Double.parseDouble(scanner.nextLine());

        double discriminant = (Math.pow(b, 2) - (4*a*c));

        String str;

        double resultpos = (-b + ( Math.sqrt(discriminant) )) / (2*a);
        double resultneg = (-b - ( Math.sqrt(discriminant) )) / (2*a);

        System.out.printf("%sx^2 + %sx + %s%n", a, b, c);

        if (discriminant > 0) {
            str = String.format("Two roots found: %s and %s", resultpos, resultneg);
        } else if (discriminant == 0) {
            str = String.format("One root found: %s", resultpos);
        } else {
            str = String.format("No roots exist: the negative discriminant is %s", discriminant);
        }

        System.out.println(str);
    }
}