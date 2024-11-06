package W3_1_T4;

public class Circle extends Shape {
    private final double diameter;

    public Circle(double diameter, String color){
        super(color);
        this.diameter = diameter;
    }

    public double getDiameter(){
        return this.diameter;
    }

    @Override
    public double calculateArea(){
        return Math.PI * (getDiameter() / 2);
    }
}