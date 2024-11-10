package W3_2_T2;

public abstract class AbstractVehicle implements Vehicle {
    private String fuelType;

    public AbstractVehicle(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
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
}