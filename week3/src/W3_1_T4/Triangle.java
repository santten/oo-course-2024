package W3_1_T4;

public class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height, String color){
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getBase(){
        return this.base;
    }

    public double getHeight(){
        return this.height;
    }

    @Override
    public double calculateArea(){
        return (getBase() * getHeight()) / 2;
    }
}