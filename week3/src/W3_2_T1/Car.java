package W3_2_T1;

public class Car implements Vehicle {
    private final String fuel;
    private final String color;
    private final String type;

    public Car(String fuel, String color){
        this.type = "Car";
        this.fuel = fuel;
        this.color = color;
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.printf("Car Information%n");
        System.out.printf("Type: %s || Fuel: %s || Color: %s%n", type, fuel, color);
    }
}