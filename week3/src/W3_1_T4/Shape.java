package W3_1_T4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shape {
    public final String color;

    public Shape(String color) {
        this.color = color;
    }


    public static String getRandomColor() {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("purple");
        colors.add("cyan");

        Random random = new Random();
        int index = random.nextInt(colors.size());
        return colors.get(index);
    }

    public String getColor() {
        return this.color;
    }

    public String colorToANSI(String color) {
        return switch (color) {
            case "red" -> "\u001B[31m";
            case "green" -> "\u001B[32m";
            case "blue" -> "\u001B[34m";
            case "purple" -> "\u001B[35m";
            case "cyan" -> "\u001B[36m";
            default -> "\u001B[0m";
        };
    }

    public double calculateArea() {
        return 0;
    }
}
