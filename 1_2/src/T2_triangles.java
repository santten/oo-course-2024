import java.util.Scanner;

public class T2_triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the length of the first triangle leg without unit:");
        double leg1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Give the length of the second triangle leg without unit:");
        double leg2 = Double.parseDouble(scanner.nextLine());

        double hypotenuse = Math.sqrt((Math.pow(leg1, 2)) + (Math.pow(leg2, 2)));

        String result = String.format("The hypotenuse of this triangle is %s", hypotenuse);
        System.out.println(result);
    }
}
