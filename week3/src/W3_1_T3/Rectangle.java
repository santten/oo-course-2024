package W3_1_T3;

public class Rectangle extends Shape {
    private final double base;
    private final double height;

    public Rectangle(double base, double height){
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
        return getBase() * getHeight();
    }
}