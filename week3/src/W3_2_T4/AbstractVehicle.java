package W3_2_T4;

public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    private final String fuelType;
    private final String fuelEfficiency;

    public AbstractVehicle(String fuelType, String fuelEfficiency) {
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getFuelType() {
        return fuelType;
    }
    public String getFuelEfficiency() {
        return fuelEfficiency;
    }

    public abstract String getVehicleType();

    @Override
    public void start() {
        System.out.printf("%s is starting.%n", getVehicleType());
    }

    @Override
    public void stop() {
        System.out.printf("%s is stopping.%n", getVehicleType());
    }

    @Override
    public void charge() {
        System.out.printf("Charging this %s is not possible.%n", getVehicleType());
    }
}