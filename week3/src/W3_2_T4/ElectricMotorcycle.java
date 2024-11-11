package W3_2_T4;

public class ElectricMotorcycle extends AbstractVehicle {
    private final String color;

    public ElectricMotorcycle(String fuel, String fuelEfficiency, String color) {
        super(fuel, fuelEfficiency);
        this.color = color;
    }

    @Override
    public String getVehicleType() {
        return "Electric Motorcycle";
    }

    @Override
    public void charge() {
        System.out.println("Electric Motorcycle is charging.");
    }

    @Override
    public void getInfo() {
        System.out.printf("[INFORMATION] Type: %s || Fuel: %s || Fuel Efficiency: %s || Color: %s%n", getVehicleType(), getFuelType(), getFuelEfficiency(), color);
    }
}