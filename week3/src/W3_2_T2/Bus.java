package W3_2_T2;

public class Bus extends AbstractVehicle {
    private final int capacity;
    private final String type;

    public Bus(String fuel, int capacity){
        super(fuel);
        this.type = "Bus";
        this.capacity = capacity;
    }

    @Override
    public String getVehicleType() {
        return type;
    }

    @Override
    public void start() {
        System.out.println("Bus is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.printf("Bus Information%n");
        System.out.printf("Type: %s || Fuel: %s || Capacity: %s passengers%n", type, getFuelType(), capacity);
    }
}