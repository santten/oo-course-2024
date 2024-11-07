package W3_2_T1;

public class Motorcycle implements Vehicle {
    private final String fuel;
    private final String color;
    private final String type;

    public Motorcycle(String fuel, String color){
        this.type = "Motorcycle";
        this.fuel = fuel;
        this.color = color;
    }

    @Override
    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.printf("Motorcycle Information%n");
        System.out.printf("Type: %s || Fuel: %s || Color: %s%n", type, fuel, color);
    }
}