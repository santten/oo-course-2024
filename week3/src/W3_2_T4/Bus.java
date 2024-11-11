package W3_2_T4;

public class Bus extends AbstractVehicle {
    private final int capacity;
    private final String type;

    public Bus(String fuel, String fuelEfficiency, int capacity){
        super(fuel, fuelEfficiency);
        this.type = "Bus";
        this.capacity = capacity;
    }

    @Override
    public String getVehicleType() {
        return type;
    }

    @Override
    public void start() {
        System.out.println("Bus is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping.");
    }

    @Override
    public void getInfo() {
        System.out.printf("[INFORMATION] Type: %s || Fuel: %s || Fuel Efficiency: %s || Capacity: %s passengers %n", getVehicleType(), getFuelType(), getFuelEfficiency(), capacity);
    }
}