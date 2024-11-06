package W3_1_T4;

public class ShapeCalculator {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            Rectangle rect = new Rectangle(Math.random() * 100, Math.random() * 100, Rectangle.getRandomColor());
            System.out.printf("%sRectangle #%s %n|| Base: %.2f %n|| Height: %.2f %n|| Area: %.2f%n|| Color: %s%n%n\u001B[0m", rect.colorToANSI(rect.getColor()), i, rect.getBase(), rect.getHeight(), rect.calculateArea(), rect.getColor());
        }

        for (int i = 1; i < 6; i++) {
            Circle circle = new Circle(Math.random() * 100, Circle.getRandomColor());
            System.out.printf("%sCircle #%s %n|| Diameter: %.2f %n|| Area: %.2f%n|| Color: %s%n%n\u001B[0m", circle.colorToANSI(circle.getColor()), i, circle.getDiameter(), circle.calculateArea(), circle.getColor());
        }

        for (int i = 1; i < 6; i++) {
            Triangle triangle = new Triangle(Math.random() * 100, Math.random() * 100, Triangle.getRandomColor());
            System.out.printf("%sTriangle #%s %n|| Base: %.2f %n|| Height: %.2f %n|| Area: %.2f%n|| Color: %s%n%n\u001B[0m", triangle.colorToANSI(triangle.getColor()), i, triangle.getBase(), triangle.getHeight(), triangle.calculateArea(), triangle.getColor());
        }
    }
}
