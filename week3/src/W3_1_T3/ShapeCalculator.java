package W3_1_T3;

public class ShapeCalculator {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++){
            Rectangle rect = new Rectangle(Math.random() * 100, Math.random() * 100);
            System.out.printf("Rectangle %s %n|| Base: %.2f %n|| Height: %.2f %n|| Area: %.2f%n%n", i, rect.getBase(), rect.getHeight(), rect.calculateArea());
        }

        for (int i = 1; i < 6; i++){
            Circle circle = new Circle(Math.random() * 100);
            System.out.printf("Circle %s %n|| Diameter: %.2f %n|| Area: %.2f%n%n", i, circle.getDiameter(), circle.calculateArea());
        }

        for (int i = 1; i < 6; i++){
            Triangle triangle = new Triangle(Math.random() * 100, Math.random() * 100);
            System.out.printf("Triangle %s %n|| Base: %.2f %n|| Height: %.2f %n|| Area: %.2f%n%n", i, triangle.getBase(), triangle.getHeight(), triangle.calculateArea());
        }
    }
}
