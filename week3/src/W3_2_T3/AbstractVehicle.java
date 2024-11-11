package W3_2_T3;

public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    private final String fuelType;

    public AbstractVehicle(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
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